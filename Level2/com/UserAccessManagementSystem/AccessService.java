package Level2.com.UserAccessManagementSystem;

public class AccessService {
    public void requestAccess(Employee emp, String type, String AccessLevel) {
        Application a = ApplicationFactory.getInstance().create(type, AccessLevel);
        if (AccessLevel.equals("ADMIN")) {
            if (!emp.isManager()) {
                System.out.println("Access not Granted.");
            }
        }

        if (AccessLevel.equals("WRITE")) {
            int level = emp.getSeniorityLevel();
            if (level < 2) {
                System.out.println("Access not Granted.");
            }
        }

        System.out.println("Access Granted.");
        System.out.println("Application: " + a.getName());
        System.out.println("User: " + emp.getName());
        System.out.println("Access Level: " + AccessLevel);

    }
}
