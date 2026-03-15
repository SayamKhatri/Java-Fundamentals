package Level3.BankAccountSystem;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    SavingsAccount(String accountNumber, String name, double balance, double interestRate) {
        super(accountNumber, name, balance);
        this.interestRate = interestRate;
    }
    
    public void applyInterest() {
        setBalance(getBalance() + getBalance() * interestRate);
    }
}
