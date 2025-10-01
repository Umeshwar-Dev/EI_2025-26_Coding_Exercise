import java.util.Arrays;


public class AddClassroomCommand implements Command {
    private final String[] args;
    
    public AddClassroomCommand(String[] args) {
        this.args = args;
    }
    
    
    @Override
    public void execute(ClassroomSystem receiver) throws ClassroomException {
        if (args.length < 2) {
            throw new ValidationException("Usage: ADD_CLASSROOM <classroom_name>");
        }
        
        String classroomName = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
        
        receiver.addClassroom(classroomName);
        System.out.println("Classroom " + classroomName + " has been created.");
    }
}