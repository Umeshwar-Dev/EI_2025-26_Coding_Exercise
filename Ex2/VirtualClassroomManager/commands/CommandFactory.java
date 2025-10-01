import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * creates command objects
 * Note: This does not follow Factory Pattern and Open/Closed Principle
 */
public class CommandFactory {
    private static final Map<String, Function<String[], Command>> commandMap = new HashMap<>();
    
    static {
        commandMap.put("ADD_CLASSROOM", AddClassroomCommand::new);
        commandMap.put("ADD_STUDENT", AddStudentCommand::new);
        commandMap.put("SCHEDULE_ASSIGNMENT", ScheduleAssignmentCommand::new);
        commandMap.put("SUBMIT_ASSIGNMENT", SubmitAssignmentCommand::new);
        commandMap.put("LIST_CLASSROOMS", ListClassroomsCommand::new);
        commandMap.put("LIST_STUDENTS", ListStudentsCommand::new);
        commandMap.put("LIST_ASSIGNMENTS", ListAssignmentsCommand::new);
        commandMap.put("HELP", HelpCommand::new);
        commandMap.put("EXIT", ExitCommand::new);
    }
    
    public static Command createCommand(String commandName, String[] args) throws InvalidCommandException {
        Function<String[], Command> commandCreator = commandMap.get(commandName.toUpperCase());
        if (commandCreator == null) {
            throw new InvalidCommandException("Unknown command: " + commandName);
        }
        return commandCreator.apply(args);
    }
}