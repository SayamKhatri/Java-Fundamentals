package Level2.com.NotificationServiceSystem;

public class EmailNotification implements NotificationService{

    @Override
    public void send() {
        System.out.println("The message is being sent via an email");
    }
    
}
