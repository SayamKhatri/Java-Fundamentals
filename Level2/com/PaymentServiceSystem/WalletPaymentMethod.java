package Level2.com.PaymentServiceSystem;

public class WalletPaymentMethod implements PaymentService {

    @Override
    public void processPayment(double amount, String userId) {
        System.out.println("Processing payments through Wallet for amount $" + amount + " for user: " + userId);
    }

}
