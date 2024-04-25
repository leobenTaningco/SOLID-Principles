public class EmailNotificationSend implements SendEmailNotification{
    public void sendEmailNotification(String email){
        System.out.println("Email notification sent to: " + email);
    }
}
