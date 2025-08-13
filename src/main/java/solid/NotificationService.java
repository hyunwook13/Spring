package solid;

public class NotificationService {
    private final NotificationSender sender;

    public NotificationService(NotificationSender sender) {
        this.sender = sender;
    }

    public void notify(String message) {
        sender.send(message);
    }
}
