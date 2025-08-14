package Head02_OOP_Programming.solid;

public class SmsNotificationSender implements NotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SMS 전송: " + message);
    }
}
