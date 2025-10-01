import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Main class for Virtual Classroom Manager Application
 * Acts as CLIENT in Command Pattern - creates commands and passes them to invoker
 */
public class VirtualClassroomManager {
    private static final Logger logger = Logger.getLogger(VirtualClassroomManager.class.getName());
    private final ClassroomSystem classroomSystem;  // RECEIVER
    private final CommandInvoker invoker;           // INVOKER
    private final Scanner scanner;
    private boolean running;

    public VirtualClassroomManager() {
        this.classroomSystem = new ClassroomSystem();
        this.invoker = new CommandInvoker();
        this.scanner = new Scanner(System.in);
        this.running = false;
    }

    public static void main(String[] args) {
        VirtualClassroomManager manager = new VirtualClassroomManager();

        try {
            manager.start();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Application failed to start", e);
            System.err.println("Application failed to start. Please check logs.");
        }
    }

    public void start() {
        logger.info("Starting Virtual Classroom Manager");
        displayWelcome();
        running = true;

        while (running) {
            try {
                System.out.print("\nVirtual Classroom Manager> ");
                String input = scanner.nextLine().trim();

                if (!input.isEmpty()) {
                    processInput(input);
                }
            } catch (Exception e) {
                logger.log(Level.WARNING, "Error processing input", e);
                System.err.println("Error: " + e.getMessage());
            }
        }

        cleanup();
    }

    /**
     * CLIENT responsibility: Create command and pass to INVOKER
     */
    private void processInput(String input) {
        // declare tokens outside try so it's visible in catch
        String[] tokens = input.split("\\s+");

        try {
            // CLIENT creates the command
            Command command = CommandFactory.createCommand(tokens[0], tokens);
            // CLIENT passes command to INVOKER
            invoker.executeCommand(command, classroomSystem);

        } catch (InvalidCommandException e) {
            System.err.println("Unknown command: " + tokens[0]);
            showHelp();

        // either catch superclass only OR catch separately:
        } catch (ValidationException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (ClassroomException e) {
            System.err.println("Error: " + e.getMessage());

        } catch (Exception e) {
            logger.log(Level.SEVERE, "Unexpected error", e);
            System.err.println("An unexpected error occurred. Please try again.");
        }
    }

    private void displayWelcome() {
        System.out.println("====================================================");
        System.out.println("    Welcome to Virtual Classroom Manager");
        System.out.println("====================================================");
        System.out.println("Initial State:");
        System.out.println("Number of Classrooms: 0");
        System.out.println("Number of Students: 0");
        System.out.println("Number of Assignments: 0");
        System.out.println("\nType 'HELP' for available commands.");
        System.out.println("====================================================");
    }

    private void showHelp() {
        System.out.println("\nAvailable Commands:");
        System.out.println("ADD_CLASSROOM <name> - Create a new classroom");
        System.out.println("ADD_STUDENT <id> <classroom> - Enroll student in classroom");
        System.out.println("SCHEDULE_ASSIGNMENT <classroom> <details> - Schedule assignment");
        System.out.println("SUBMIT_ASSIGNMENT <student_id> <classroom> <details> - Submit assignment");
        System.out.println("LIST_CLASSROOMS - Show all classrooms");
        System.out.println("LIST_STUDENTS <classroom> - Show students in classroom");
        System.out.println("LIST_ASSIGNMENTS <classroom> - Show classroom assignments");
        System.out.println("HELP - Show this help");
        System.out.println("EXIT - Exit application\n");
    }

    private void cleanup() {
        running = false;
        scanner.close();
        System.out.println("\nThank you for using Virtual Classroom Manager!");
        logger.info("Application terminated successfully");
    }

    public void stop() {
        running = false;
    }
}
