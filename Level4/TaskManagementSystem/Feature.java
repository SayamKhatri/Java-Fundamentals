package Level4.TaskManagementSystem;

public class Feature extends Task{
    private int estimatedHours;

    public Feature(String taskId, String title, PriorityType priority, StatusType status, int estimatedHours) {
        super(taskId, title, priority, status);
        this.estimatedHours = estimatedHours;
    }
 
}
