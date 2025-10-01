import java.util.Arrays;

public class SubmitAssignmentCommand implements Command {
    private final String[] args;
    
    public SubmitAssignmentCommand(String[] args) {
        this.args = args;
    }
    
    @Override
    public void execute(ClassroomSystem receiver) throws ClassroomException {
        if (args.length < 4) {
            throw new ValidationException("Usage: SUBMIT_ASSIGNMENT <student_id> <classroom_name> <assignment_details>");
        }
        
        String studentId = args[1];
        String classroomName = args[2];
        String assignmentDetails = String.join(" ", Arrays.copyOfRange(args, 3, args.length));
        // COMMAND delegates to RECEIVER
        receiver.submitAssignment(studentId, classroomName, assignmentDetails);
        System.out.println("Assignment submitted by Student " + studentId + " in " + classroomName + ".");
    }
}