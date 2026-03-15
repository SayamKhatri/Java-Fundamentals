package Level2.com.UserAccessManagementSystem;

public class Employee {
    private String name;
    private int seniorityLevel;
    private boolean isManager;

    public Employee(String name, int seniorityLevel, boolean isManager) {
        this.name = name;
        this.seniorityLevel = seniorityLevel;
        this.isManager = isManager;
    }

    public int getSeniorityLevel() {
        return seniorityLevel;
    }

    public boolean isManager() {
        return isManager;
    }

    public String getName() {
        return name;
    }

}
