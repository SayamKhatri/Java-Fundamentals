package Level3.BankAccountSystem;

public class BankAccount {
    private String accountNumber;
    private String name;
    private double balance;

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
            return;
        }

        balance -= amount;
        System.out.println("Amount Withdrawn: " + amount + " , Updated balance is: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount Deposited: " + amount + " , Updated balance is: " + balance);
    }
        

}
