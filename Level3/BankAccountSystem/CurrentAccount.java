package Level3.BankAccountSystem;

public class CurrentAccount extends BankAccount{
    double overdraftLimit;
    CurrentAccount(String accountNumber, String name, double balance, double overdraftLimit) {
        super(accountNumber, name, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()){
            System.out.println("Insufficient balance, checking overdraft limits..");
            if (amount > overdraftLimit) {
                System.out.println("OverDraft limit also exhasuted!");
                return;
            }

            else {
                overdraftLimit -= amount - getBalance();
                System.out.println("Using OverDraftlimit, updated limit is: " + overdraftLimit);

            }
        }
        
        setBalance(getBalance() - amount);

    }
}
