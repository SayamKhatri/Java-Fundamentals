package Level2.com.PaymentServiceSystem;

public class CryptoPayment implements PaymentService {

    @Override
    public void processPayment(double amount, String userId) {
        System.out.println("Processing payments through Crypto method for amount $" + amount + " for user: " + userId);
    }
}
