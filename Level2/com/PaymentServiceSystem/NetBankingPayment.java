package Level2.com.PaymentServiceSystem;

public class NetBankingPayment implements PaymentService {

    @Override
    public void processPayment(double amount, String userId) {
        System.out.println("Processing payments through Net banking for amount $" + amount + " for user: " + userId);
    }
    
}
