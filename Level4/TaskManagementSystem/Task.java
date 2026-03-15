package Level4.TaskManagementSystem;

public class Task {
    private String taskId;
    private String title;
    private PriorityType priority;
    private StatusType status;
    
    public String getTaskId() {
        return taskId;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public Task(String taskId, String title, PriorityType priority, StatusType status) {
        this.taskId = taskId;
        this.title = title;
        this.priority = priority;
        this.status = status;
    }

    
}
