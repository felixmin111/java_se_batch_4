package org.example.assigment.aung.day_7.Notifications;

public class Notifier {
    Notification notification;
    public Notifier(Notification notification) {
        this.notification = notification;
    }

    public void SendNotification(String message) {notification.popup(message);}

}
