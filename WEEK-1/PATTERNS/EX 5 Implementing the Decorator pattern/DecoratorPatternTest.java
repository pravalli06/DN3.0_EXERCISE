
public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Basic email notification
        Notifier notifier = new EmailNotifier();
        notifier.send("Hello, this is a basic email notification!");

        // Email + SMS notification
        Notifier smsNotifier = new SMSNotifierDecorator(new EmailNotifier());
        smsNotifier.send("Hello, this is an email and SMS notification!");

        // Email + SMS + Slack notification
        Notifier multiChannelNotifier = new SlackNotifierDecorator(
                new SMSNotifierDecorator(new EmailNotifier()));
        multiChannelNotifier.send("Hello, this is an email, SMS, and Slack notification!");
    }
}
