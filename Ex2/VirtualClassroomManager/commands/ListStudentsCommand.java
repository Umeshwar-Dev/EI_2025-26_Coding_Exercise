import java.util.Arrays;
import java.util.List;


public class ListStudentsCommand implements Command {
    private final String[] args;
    
    public ListStudentsCommand(String[] args) {
        this.args = args;
    }
    
    @Override
    public void execute(ClassroomSystem receiver) throws ClassroomException {
        if (args.length < 2) {
            throw new ValidationException("Usage: LIST_STUDENTS <classroom_name>");
        }
        
        String classroomName = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
        
        Classroom classroom = receiver.getClassroom(classroomName);
        List<String> students = classroom.getStudents();
        
        if (students.isEmpty()) {
            System.out.println("No students enrolled in " + classroomName + ".");
            return;
        }
        
        System.out.println("\n=== Students in " + classroomName + " ===");
        for (String student : students) {
            System.out.println("- " + student);
        }
        System.out.println("Total: " + students.size() + " student(s)\n");
    }
}
