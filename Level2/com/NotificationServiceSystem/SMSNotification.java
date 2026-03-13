package Level2.com.NotificationServiceSystem;

public class SMSNotification implements NotificationService{

    @Override
    public void send() {
        System.out.println("The message is being sent via an SMS service");
    }
    
}
