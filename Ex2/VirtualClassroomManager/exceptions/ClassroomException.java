public abstract class ClassroomException extends Exception {
    public ClassroomException(String message) {
        super(message);
    }
    
    public ClassroomException(String message, Throwable cause) {
        super(message, cause);
    }
}