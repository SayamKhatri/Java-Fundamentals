package Level4.TaskManagementSystem;

import java.util.HashSet;

public class User {
    private String name;
    private String id;
    private HashSet<Task> assignedTasks = new HashSet<>();

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Task> getAssignedTasks() {
        return assignedTasks;
    }

    public void addTask(Task t) {
        assignedTasks.add(t);
    }

    public void removeTask(Task t) {
        assignedTasks.remove(t);
    }
    
}
