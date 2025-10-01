import java.util.Arrays;

/**
 * CONCRETE COMMAND: Add Classroom
 * Encapsulates the request to add a classroom
 * Knows how to invoke the appropriate method on the RECEIVER
 */
public class AddClassroomCommand implements Command {
    private final String[] args;
    
    public AddClassroomCommand(String[] args) {
        this.args = args;
    }
    
    /**
     * Execute method invokes the RECEIVER's method
     */
    @Override
    public void execute(ClassroomSystem receiver) throws ClassroomException {
        if (args.length < 2) {
            throw new ValidationException("Usage: ADD_CLASSROOM <classroom_name>");
        }
        
        String classroomName = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
        // COMMAND delegates actual work to RECEIVER
        receiver.addClassroom(classroomName);
        System.out.println("Classroom " + classroomName + " has been created.");
    }
}