package Level3.EmployeePayrollSystem;

public class PayRoll {
    public void pay(Employee e) {
        System.out.println("Paying Employee: " + e.getName() + " Amount: " + e.calculatePay());
    }
}
