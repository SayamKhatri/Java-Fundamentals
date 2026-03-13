package Level2.com.PaymentServiceSystem;

public class CreditCardPayment implements PaymentService {

    @Override
    public void processPayment(double amount, String userId) {
        System.out.println("Processing payments through Credit card for amount $" + amount + " for user: " + userId);
    }
    
}
