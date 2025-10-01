import java.util.List;


public class ListClassroomsCommand implements Command {
    private final String[] args;
    
    public ListClassroomsCommand(String[] args) {
        this.args = args;
    }
    
    @Override
    public void execute(ClassroomSystem receiver) throws ClassroomException {
        
        List<Classroom> classrooms = receiver.getAllClassrooms();
        
        if (classrooms.isEmpty()) {
            System.out.println("No classrooms available.");
            return;
        }
        
        System.out.println("\n=== All Classrooms ===");
        for (Classroom classroom : classrooms) {
            System.out.println("- " + classroom.getName());
        }
        System.out.println("Total: " + classrooms.size() + " classroom(s)\n");
    }
}
