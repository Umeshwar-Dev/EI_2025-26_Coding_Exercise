import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class Classroom {
    private final String name;
    private final Set<String> students;
    private final List<Assignment> assignments;
    
    public Classroom(String name) {
        this.name = name;
        this.students = ConcurrentHashMap.newKeySet();
        this.assignments = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void addStudent(String studentId) throws DuplicateEntityException {
        if (students.contains(studentId)) {
            throw new DuplicateEntityException("Student " + studentId + " is already enrolled");
        }
        students.add(studentId);
    }
    
    public List<String> getStudents() {
        return new ArrayList<>(students);
    }
    
    public void addAssignment(String details) throws DuplicateEntityException {
        if (assignments.stream().anyMatch(a -> a.getDetails().equals(details))) {
            throw new DuplicateEntityException("Assignment already exists: " + details);
        }
        assignments.add(new Assignment(details));
    }
    
    public void submitAssignment(String studentId, String details) throws ClassroomException {
        if (!students.contains(studentId)) {
            throw new EntityNotFoundException("Student " + studentId + " not enrolled in this classroom");
        }
        
        Assignment assignment = assignments.stream()
            .filter(a -> a.getDetails().equals(details))
            .findFirst()
            .orElseThrow(() -> new EntityNotFoundException("Assignment not found: " + details));
        
        assignment.submit(studentId);
    }
    
    public List<Assignment> getAssignments() {
        return new ArrayList<>(assignments);
    }
}