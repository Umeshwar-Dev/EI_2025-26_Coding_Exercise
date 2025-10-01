import java.util.Arrays;
import java.util.List;


public class ListAssignmentsCommand implements Command {
    private final String[] args;
    
    public ListAssignmentsCommand(String[] args) {
        this.args = args;
    }
    
    @Override
    public void execute(ClassroomSystem receiver) throws ClassroomException {
        if (args.length < 2) {
            throw new ValidationException("Usage: LIST_ASSIGNMENTS <classroom_name>");
        }
        
        String classroomName = String.join(" ", Arrays.copyOfRange(args, 1, args.length));
        
        Classroom classroom = receiver.getClassroom(classroomName);
        List<Assignment> assignments = classroom.getAssignments();
        
        if (assignments.isEmpty()) {
            System.out.println("No assignments scheduled for " + classroomName + ".");
            return;
        }
        
        System.out.println("\n=== Assignments for " + classroomName + " ===");
        for (Assignment assignment : assignments) {
            String status = assignment.isSubmitted() ? 
                "Submitted by " + assignment.getSubmittedBy() : "Not submitted";
            System.out.println("- " + assignment.getDetails() + " (" + status + ")");
        }
        System.out.println("Total: " + assignments.size() + " assignment(s)\n");
    }
}
