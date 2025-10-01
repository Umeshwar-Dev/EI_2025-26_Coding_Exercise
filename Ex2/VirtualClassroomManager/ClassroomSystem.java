import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;


public class ClassroomSystem {
    private static final Logger logger = Logger.getLogger(ClassroomSystem.class.getName());
    private final Map<String, Classroom> classrooms;
    private final InputValidator validator;
    
    public ClassroomSystem() {
        this.classrooms = new ConcurrentHashMap<>();
        this.validator = new InputValidator();
    }
    
   
    public void addClassroom(String name) throws ClassroomException {
        logger.info("Receiver: Adding classroom - " + name);
        validator.validateClassroomName(name);
        
        String key = name.toLowerCase();
        if (classrooms.containsKey(key)) {
            throw new DuplicateEntityException("Classroom already exists: " + name);
        }
        
        classrooms.put(key, new Classroom(name));
        logger.info("Receiver: Classroom created successfully");
    }
    
  
    public void addStudent(String studentId, String classroomName) throws ClassroomException {
        logger.info("Receiver: Enrolling student " + studentId + " in " + classroomName);
        validator.validateStudentId(studentId);
        validator.validateClassroomName(classroomName);
        
        Classroom classroom = getClassroom(classroomName);
        classroom.addStudent(studentId);
        logger.info("Receiver: Student enrolled successfully");
    }
    
 
    public void scheduleAssignment(String classroomName, String details) throws ClassroomException {
        logger.info("Receiver: Scheduling assignment for " + classroomName);
        validator.validateClassroomName(classroomName);
        validator.validateAssignmentDetails(details);
        
        Classroom classroom = getClassroom(classroomName);
        classroom.addAssignment(details);
        logger.info("Receiver: Assignment scheduled successfully");
    }
    
 
    public void submitAssignment(String studentId, String classroomName, String details) throws ClassroomException {
        logger.info("Receiver: Processing assignment submission");
        validator.validateStudentId(studentId);
        validator.validateClassroomName(classroomName);
        validator.validateAssignmentDetails(details);
        
        Classroom classroom = getClassroom(classroomName);
        classroom.submitAssignment(studentId, details);
        logger.info("Receiver: Assignment submitted successfully");
    }
    
    public List<Classroom> getAllClassrooms() {
        return new ArrayList<>(classrooms.values());
    }
    
    public Classroom getClassroom(String name) throws EntityNotFoundException {
        Classroom classroom = classrooms.get(name.toLowerCase());
        if (classroom == null) {
            throw new EntityNotFoundException("Classroom not found: " + name);
        }
        return classroom;
    }
}