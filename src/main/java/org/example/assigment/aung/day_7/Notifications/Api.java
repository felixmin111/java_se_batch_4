package org.example.assigment.aung.day_7.Notifications;

public class Api {
    public static void main(String[] args) {
        Whatsapp message1 = new Whatsapp();
        Viber message2 = new Viber();
        Messenger message3 = new Messenger();

        Notifier notification1 = new Notifier(message1);
        notification1.SendNotification("Hello World");

        Notifier notification2 = new Notifier(message2);
        notification2.SendNotification("Hello World");

        Notifier notification3 = new Notifier(message3);
        notification3.SendNotification("Hello World");

    }
}
