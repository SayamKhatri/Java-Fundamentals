package Level4.TaskManagementSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TaskService {
    private HashMap<StatusType, HashSet<Task>> tasks = new HashMap<>();
    private static TaskService instance = new TaskService();
    private TaskService(){};

    public static TaskService getInstance(){
        return instance;
    }

    public Task createTask(String taskId, String title, PriorityType priority, StatusType status, int hours){
        Task newTask = new Feature(taskId, title, priority, status, hours);
        if (!tasks.containsKey(status)){
            tasks.put(status, new HashSet<>());
        }

        tasks.get(status).add(newTask);
        return newTask;
    }

    public Task createTask(String taskId, String title, PriorityType priority, StatusType status, SeverityType severity){
        Task newTask = new BugFix(taskId, title, priority, status, severity);
        if (!tasks.containsKey(status)){
            tasks.put(status, new HashSet<>());
        }

        tasks.get(status).add(newTask);
        return newTask;
    }

    public Task createTask(String taskId, String title, PriorityType priority, StatusType status, User u){
        Task newTask = new CodeReview(taskId, title, priority, status, u);
        if (!tasks.containsKey(status)){
            tasks.put(status, new HashSet<>());
        }

        tasks.get(status).add(newTask);
        return newTask;
    }

    public void assignTask(User u, Task t){
        HashSet<Task> tasks = u.getAssignedTasks();
        if (tasks.size() >= 5){
            System.out.println("User already have 5 tasks assigned, please find another developer");
            return;
        }

        u.addTask(t);
    }

    public void completeTask(Task t, User u){
        StatusType current_status = t.getStatus();
        t.setStatus(StatusType.DONE);
        u.removeTask(t);
        HashSet<Task> taskSet = tasks.get(current_status);
        taskSet.remove(t);
        
        if (!tasks.containsKey(StatusType.DONE))
            tasks.put(StatusType.DONE, new HashSet<>());

        tasks.get(StatusType.DONE).add(t);
    }

    public void getTaskSummary() {
        printStatus(StatusType.IN_PROGRESS);
        printStatus(StatusType.TODO);
        printStatus(StatusType.DONE);
    }

    private void printStatus(StatusType status) {
        HashSet<Task> taskSet = tasks.getOrDefault(status, new HashSet<>());
        System.out.print(status + " -> ");
        for (Task task : taskSet) {
            System.out.print(task.getTaskId() + " , ");
        }
        System.out.println();
    }
    
    public void getTaskSummary(User u){
        HashSet<Task> tasks = u.getAssignedTasks();
        ArrayList<String> p_tasks = new ArrayList<>();
        ArrayList<String> t_tasks = new ArrayList<>();
        ArrayList<String> d_tasks = new ArrayList<>();

        for (Task task : tasks) {
            if (task.getStatus() == StatusType.IN_PROGRESS)
                p_tasks.add(task.getTaskId());

            else if (task.getStatus() == StatusType.TODO)
                t_tasks.add(task.getTaskId());
            
            else
                d_tasks.add(task.getTaskId());
        }

        System.out.println("INPROGRESS tasks: " + p_tasks);
        System.out.println("TODO tasks: " + t_tasks);
        System.out.println("DONE tasks: " + d_tasks);
    }
}
