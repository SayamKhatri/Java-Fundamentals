package Level4.NotificationAlertSystem;

public class SMS extends Channel{

    @Override
    public void notification(String name, String prefix) {
        System.out.println(prefix + "Alerting: " + name + " through SMS");
    }

}
