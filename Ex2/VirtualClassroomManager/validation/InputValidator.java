public class InputValidator {
    private static final int MAX_NAME_LENGTH = 100;
    private static final int MAX_ID_LENGTH = 50;
    private static final int MAX_DETAILS_LENGTH = 500;
    
    public void validateClassroomName(String name) throws ValidationException {
        if (name == null || name.trim().isEmpty()) {
            throw new ValidationException("Classroom name cannot be empty");
        }
        
        if (name.length() > MAX_NAME_LENGTH) {
            throw new ValidationException("Classroom name too long (max " + MAX_NAME_LENGTH + " characters)");
        }
        
        if (!name.matches("^[a-zA-Z0-9\\s\\-_\\.]+$")) {
            throw new ValidationException("Classroom name contains invalid characters");
        }
    }
    
    public void validateStudentId(String id) throws ValidationException {
        if (id == null || id.trim().isEmpty()) {
            throw new ValidationException("Student ID cannot be empty");
        }
        
        if (id.length() > MAX_ID_LENGTH) {
            throw new ValidationException("Student ID too long (max " + MAX_ID_LENGTH + " characters)");
        }
        
        if (!id.matches("^[a-zA-Z0-9\\-_]+$")) {
            throw new ValidationException("Student ID contains invalid characters");
        }
    }
    
    public void validateAssignmentDetails(String details) throws ValidationException {
        if (details == null || details.trim().isEmpty()) {
            throw new ValidationException("Assignment details cannot be empty");
        }
        
        if (details.length() > MAX_DETAILS_LENGTH) {
            throw new ValidationException("Assignment details too long (max " + MAX_DETAILS_LENGTH + " characters)");
        }
    }
}