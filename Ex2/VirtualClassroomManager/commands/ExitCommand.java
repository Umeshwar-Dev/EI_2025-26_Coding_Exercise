public class ExitCommand implements Command {
    private final String[] args;
    
    public ExitCommand(String[] args) {
        this.args = args;
    }
    
    @Override
    public void execute(ClassroomSystem system) throws ClassroomException {
        System.out.println("Goodbye!");
        System.exit(0);
    }
}
