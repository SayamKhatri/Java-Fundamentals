package Level4.NotificationAlertSystem;
import java.util.HashSet;

public class User {
    private String id;
    private String name;
    private HashSet<ChannelType> subscriptions = new HashSet<>();

    public void subscribe(ChannelType channel){
        subscriptions.add(channel);
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void unsubscribe(ChannelType channel){
        if (!subscriptions.remove(channel))
            System.out.println("User had not subscribed to the channel");
    }

    public HashSet<ChannelType> getSubscriptions() {
        return subscriptions;
    }

    public String getName() {
        return name;
    }
}
