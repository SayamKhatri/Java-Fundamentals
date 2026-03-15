package Level4.NotificationAlertSystem;
import java.util.HashSet;

public class AlertService {

    public void alertUser(User u, Severity level){
        HashSet<ChannelType> subscriptions = u.getSubscriptions();
        if (subscriptions.isEmpty()){
            System.out.println("No channels subscribed for user: " + u.getName());
            return;
        }

        String prefix = "";
        if (level == Severity.HIGH)
            prefix = "🚨 URGENT: ";

        for (ChannelType channel : subscriptions) {
            ChannelFactory.createChannel(channel).notification(u.getName(), prefix);
        }
    }
}
