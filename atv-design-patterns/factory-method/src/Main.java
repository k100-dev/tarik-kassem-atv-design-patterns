public class Main {
    public static void main(String[] args) {
        String message = "Bem-vindo ao sistema!";

        NotificationService emailService = new NotificationService(new EmailNotificationFactory());
        NotificationService smsService = new NotificationService(new SMSNotificationFactory());
        NotificationService pushService = new NotificationService(new PushNotificationFactory());

        emailService.notifyUser(message);
        smsService.notifyUser(message);
        pushService.notifyUser(message);
    }
}
