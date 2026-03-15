package Level4.TaskManagementSystem;

public class CodeReview extends Task{
    private User codeReviewer;

    public CodeReview(String taskId, String title, PriorityType priority, StatusType status, User u) {
            super(taskId, title, priority, status);
            this.codeReviewer = u;
        }
    
}
