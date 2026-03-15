package Level3.EmployeePayrollSystem;

public class ContractEmployee extends Employee{
    private double hourlyRate;
    private final double hoursWorked = 2080;  

    public ContractEmployee(String name, String id, double hourlyRate) {
        super(name, id);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

}
