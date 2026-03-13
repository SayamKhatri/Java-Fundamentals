package Level2.com.PaymentServiceSystem;

public class UPIPayment implements PaymentService{

    @Override
    public void processPayment(double amount, String userId) {
        System.out.println("Processing payments through UPI method for amount $" + amount + " for user: " + userId);
    }
    
}
