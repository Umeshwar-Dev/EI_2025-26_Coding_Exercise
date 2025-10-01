import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * INVOKER in Command Pattern
 * Responsible for invoking commands and maintaining command history
 * Provides ability to track executed commands for logging/audit purposes
 */
public class CommandInvoker {
    private static final Logger logger = Logger.getLogger(CommandInvoker.class.getName());
    private final List<Command> commandHistory;
    private int executedCommandsCount;
    
    public CommandInvoker() {
        this.commandHistory = new ArrayList<>();
        this.executedCommandsCount = 0;
    }
    
    /**
     * INVOKER's primary responsibility: Execute command on receiver
     * Maintains history and provides logging
     */
    public void executeCommand(Command command, ClassroomSystem receiver) throws ClassroomException {
        logger.info("Invoker: Executing command - " + command.getClass().getSimpleName());
        
        try {
            // INVOKER calls execute() on COMMAND, passing the RECEIVER
            command.execute(receiver);
            
            // Track command in history
            commandHistory.add(command);
            executedCommandsCount++;
            
            logger.info("Invoker: Command executed successfully. Total commands: " + executedCommandsCount);
        } catch (ClassroomException e) {
            logger.warning("Invoker: Command execution failed - " + e.getMessage());
            throw e;
        }
    }
    
    /**
     * Get command execution statistics
     */
    public int getExecutedCommandsCount() {
        return executedCommandsCount;
    }
    
    /**
     * Get command history (useful for audit/logging)
     */
    public List<Command> getCommandHistory() {
        return new ArrayList<>(commandHistory);
    }
    
    /**
     * Clear command history (useful for memory management in long-running apps)
     */
    public void clearHistory() {
        commandHistory.clear();
        logger.info("Invoker: Command history cleared");
    }
}