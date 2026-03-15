package Level3.EmployeePayrollSystem;

public class FullTimeEmployee extends Employee implements Taxable{
    private double Salary;
    private final double bonus = 0.10;

    public FullTimeEmployee(String name, String id, double Salary) {
        super(name, id);
        this.Salary = Salary;
    }

    @Override
    public double calculatePay() {
        return (Salary + (Salary * bonus) - (calculateTax()));
    }

    @Override
    public double calculateTax() {
        return Salary * 0.20;
    }

}
