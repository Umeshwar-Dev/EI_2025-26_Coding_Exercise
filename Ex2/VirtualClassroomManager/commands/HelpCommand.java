public class HelpCommand implements Command {
    private final String[] args;
    
    public HelpCommand(String[] args) {
        this.args = args;
    }
    
    @Override
    public void execute(ClassroomSystem receiver) throws ClassroomException {
        System.out.println("\n=== Virtual Classroom Manager - Help ===");
        System.out.println("Available commands:");
        System.out.println("1. ADD_CLASSROOM <n> - Create a new classroom");
        System.out.println("2. ADD_STUDENT <id> <classroom> - Enroll student in classroom");
        System.out.println("3. SCHEDULE_ASSIGNMENT <classroom> <details> - Schedule assignment");
        System.out.println("4. SUBMIT_ASSIGNMENT <student_id> <classroom> <details> - Submit assignment");
        System.out.println("5. LIST_CLASSROOMS - Show all classrooms");
        System.out.println("6. LIST_STUDENTS <classroom> - Show students in classroom");
        System.out.println("7. LIST_ASSIGNMENTS <classroom> - Show classroom assignments");
        System.out.println("8. HELP - Show this help");
        System.out.println("9. EXIT - Exit application");
        System.out.println("=========================================\n");
    }
}