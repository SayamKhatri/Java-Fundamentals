package Level4.NotificationAlertSystem;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("123", "Sayam");
        User u2 = new User("456", "Dinky");

        u1.subscribe(ChannelType.EMAIL);
        u1.subscribe(ChannelType.SMS);

        AlertService service = new AlertService();
        service.alertUser(u1, Severity.MEDIUM);
    }
}
