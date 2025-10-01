public interface Command {
    void execute(ClassroomSystem receiver) throws ClassroomException;
}