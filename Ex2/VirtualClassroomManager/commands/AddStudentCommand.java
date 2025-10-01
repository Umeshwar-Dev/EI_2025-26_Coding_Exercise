import java.util.Arrays;


public class AddStudentCommand implements Command {
    private final String[] args;
    
    public AddStudentCommand(String[] args) {
        this.args = args;
    }
    
    @Override
    public void execute(ClassroomSystem receiver) throws ClassroomException {
        if (args.length < 3) {
            throw new ValidationException("Usage: ADD_STUDENT <student_id> <classroom_name>");
        }
        
        String studentId = args[1];
        String classroomName = String.join(" ", Arrays.copyOfRange(args, 2, args.length));
        
        receiver.addStudent(studentId, classroomName);
        System.out.println("Student " + studentId + " has been enrolled in " + classroomName + ".");
    }
}