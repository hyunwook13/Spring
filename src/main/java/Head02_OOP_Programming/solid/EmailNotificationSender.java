package Head02_OOP_Programming.solid;

public class EmailNotificationSender implements NotificationSender{
    @Override
    public void send(String message) {
        System.out.println("이메일 전송: " + message);
    }
}
