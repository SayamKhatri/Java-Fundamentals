package Level3.EmployeePayrollSystem;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Sayam", "123", 130000);
        Employee e2 = new FullTimeEmployee("Dinky", "456", 190000);
        Employee e3 = new ContractEmployee("Rahul", "789", 100);

        PayRoll p = new PayRoll();
        p.pay(e1);
        p.pay(e2);
        p.pay(e3);

    }
}
