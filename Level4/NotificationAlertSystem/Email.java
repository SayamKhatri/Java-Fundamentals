package Level4.NotificationAlertSystem;

public class Email extends Channel{

    @Override
    public void notification(String name, String prefix) {
        System.out.println(prefix + "Alerting: " + name + " through email");
    }
    
}
