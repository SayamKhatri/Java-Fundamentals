package Level2.com.PaymentServiceSystem;

public class LogAndIgnorePayment implements PaymentService{

    @Override
    public void processPayment(double amount, String userId) {
        System.out.println("Unknown payment type requested by user:" + userId + ". Logging and skipping.");
    }

}
