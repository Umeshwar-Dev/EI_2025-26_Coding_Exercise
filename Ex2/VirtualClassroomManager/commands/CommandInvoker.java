import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CommandInvoker {
    private static final Logger logger = Logger.getLogger(CommandInvoker.class.getName());
    private final List<Command> commandHistory;
    private int executedCommandsCount;
    
    public CommandInvoker() {
        this.commandHistory = new ArrayList<>();
        this.executedCommandsCount = 0;
    }
    
    public void executeCommand(Command command, ClassroomSystem receiver) throws ClassroomException {
        logger.info("Invoker: Executing command - " + command.getClass().getSimpleName());
        
        try {
            
            command.execute(receiver);
            
            
            commandHistory.add(command);
            executedCommandsCount++;
            
            logger.info("Invoker: Command executed successfully. Total commands: " + executedCommandsCount);
        } catch (ClassroomException e) {
            logger.warning("Invoker: Command execution failed - " + e.getMessage());
            throw e;
        }
    }
    
    public int getExecutedCommandsCount() {
        return executedCommandsCount;
    }
    
    
    public List<Command> getCommandHistory() {
        return new ArrayList<>(commandHistory);
    }
    
    public void clearHistory() {
        commandHistory.clear();
        logger.info("Invoker: Command history cleared");
    }
}