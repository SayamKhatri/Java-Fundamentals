package Level2.com.NotificationServiceSystem;

public class NotificationFactory {
    public static NotificationService create(String type) {
        if (type.equals("EMAIL")){
            return new EmailNotification();
        }
        else if (type.equals("SMS")){
            return new SMSNotification();
        }
        else if (type.equals("PUSH")){
            return new PushNotification();
        }
        else {
            throw new IllegalArgumentException("Invalid Notification Type");
        }
    }
}
