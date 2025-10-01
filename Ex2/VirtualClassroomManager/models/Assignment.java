public class Assignment {
    private final String details;
    private boolean submitted;
    private String submittedBy;
    
    public Assignment(String details) {
        this.details = details;
        this.submitted = false;
    }
    
    public String getDetails() {
        return details;
    }
    
    public boolean isSubmitted() {
        return submitted;
    }
    
    public String getSubmittedBy() {
        return submittedBy;
    }
    
    public void submit(String studentId) {
        this.submitted = true;
        this.submittedBy = studentId;
    }
}