package Level2.com.UserAccessManagementSystem;

public class ApplicationFactory {
    private static ApplicationFactory instance = new ApplicationFactory();
    private ApplicationFactory() {};

    public static ApplicationFactory getInstance() {
        return instance;
    }

    public Application create(String type, String AccessLevel) {
        return new Application(type, AccessLevel);
    }
}
