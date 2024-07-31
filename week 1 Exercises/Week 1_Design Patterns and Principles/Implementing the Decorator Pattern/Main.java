
public class Main {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier();
        
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);
        
        slackNotifier.send("Your order has been shipped!");
    }
}
