package org.example.assigment.aung.day_7.Notifications;

public class Messenger extends Notification {
    @Override
    public void popup(String message) {
        System.out.println("--------------");
        System.out.println("Sending Notification.....");
        System.out.println("From Messenger");
        System.out.println(message);
        System.out.println("--------------");
    }
}
