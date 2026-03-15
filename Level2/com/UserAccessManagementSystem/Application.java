package Level2.com.UserAccessManagementSystem;

public class Application {
    private String name;
    private String AccessLevel;
    Application(String name, String AccessLevel) {
        this.name = name;
        this.AccessLevel = AccessLevel;
    }
    public String getName() {
        return name;
    }
    public String getAccessLevel() {
        return AccessLevel;
    }
}
