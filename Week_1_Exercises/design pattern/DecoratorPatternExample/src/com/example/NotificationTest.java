package com.example;

public class NotificationTest {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.send("Initial Notification");

        System.out.println("SMS Notification will be added now");
        notifier = new SMSNotifierDecorator(notifier);
        notifier.send("SMS updated Notification");

        System.out.println("Slack Notification will be added now");
        notifier = new SlackNotifierDecorator(notifier);
        notifier.send("SMS and Slack updated Notification ");
    }
}

