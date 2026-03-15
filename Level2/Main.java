package Level2;

import Level2.com.UserAccessManagementSystem.AccessService;
import Level2.com.UserAccessManagementSystem.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sam", 2, false);
        Employee e2 = new Employee("Dinky", 3, true);
    
        AccessService service = new AccessService();
        service.requestAccess(e1, "GITHUB", "ADMIN");
    }

}
