import java.util.Arrays;

public class ScheduleAssignmentCommand implements Command {
    private final String[] args;
    
    public ScheduleAssignmentCommand(String[] args) {
        this.args = args;
    }
    
    @Override
    public void execute(ClassroomSystem receiver) throws ClassroomException {
        if (args.length < 3) {
            throw new ValidationException("Usage: SCHEDULE_ASSIGNMENT <classroom_name> <assignment_details>");
        }
        
        String classroomName = args[1];
        String assignmentDetails = String.join(" ", Arrays.copyOfRange(args, 2, args.length));
        // COMMAND delegates to RECEIVER
        receiver.scheduleAssignment(classroomName, assignmentDetails);
        System.out.println("Assignment for " + classroomName + " has been scheduled.");
    }
}