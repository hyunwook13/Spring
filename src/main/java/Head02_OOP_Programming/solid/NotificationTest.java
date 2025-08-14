package Head02_OOP_Programming.solid;

public class NotificationTest {
    public static void main(String[] args) {
        NotificationSender[] senders = {
                new EmailNotificationSender(),
                new SmsNotificationSender()
        };

        for (NotificationSender sender : senders) {
            NotificationService service = new NotificationService(sender);

            service.notify("방송을 정지합니다");
        }


    }
}
