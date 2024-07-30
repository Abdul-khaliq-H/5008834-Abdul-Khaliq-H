package DecoratorPatternExample;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create a simple EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS notification capability
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Add Slack notification capability
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send a notification through all channels
        slackNotifier.send("Hello, this is a test message!");
    }
}


// Output:
// Sending email: Hello, this is a test message!
// Sending SMS: Hello, this is a test message! 
// Sending Slack message: Hello, this is a test message!