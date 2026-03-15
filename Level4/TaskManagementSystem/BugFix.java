package Level4.TaskManagementSystem;

public class BugFix extends Task {
    private SeverityType severity;

    public BugFix(String taskId, String title, PriorityType priority, StatusType status, SeverityType severity) {
        super(taskId, title, priority, status);
        this.severity = severity;
    }

}
