package Level4.TaskManagementSystem;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Sayam", "1");
        User u2 = new User("Rahul", "2");

        TaskService service = TaskService.getInstance();
        Task t1 = service.createTask("T1", "DB connect", PriorityType.MEDIUM, StatusType.TODO, 20);
        Task t2 = service.createTask("T2", "Security", PriorityType.HIGH, StatusType.TODO, SeverityType.CRITICAL);

        service.assignTask(u1, t1);
        service.assignTask(u2, t2);
        service.getTaskSummary();

        service.completeTask(t2, u2);

        service.getTaskSummary();
        // service.getTaskSummary(u1);
    }
}
