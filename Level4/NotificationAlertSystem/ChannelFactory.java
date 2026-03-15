package Level4.NotificationAlertSystem;

public class ChannelFactory {
    public static Channel createChannel(ChannelType channel){
        if (channel == ChannelType.EMAIL)
            return new Email();

        else if (channel == ChannelType.SMS)
            return new SMS();

        else if (channel == ChannelType.PUSH)
            return new Push();

        else
            throw new IllegalArgumentException("This is not a channel type!");
    }
}
