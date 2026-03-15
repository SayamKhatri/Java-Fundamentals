package Level3.BankAccountSystem;

public class Main {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("A123", "Sam", 1000);
        a1.deposit(30);
        
        SavingsAccount a2 = new SavingsAccount("B123", "Dinky", 2000, 0.05);
        a2.deposit(100);
        a2.applyInterest();
        System.out.println(a2.getBalance());

        BankAccount a3 = new CurrentAccount("C123", "Arhul", 10, 1000);
        a3.withdraw(200);
        a3.getBalance();

    }
}
