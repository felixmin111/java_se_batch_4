package org.example.assigment.aung.day_7.Notifications;

public class Viber extends Notification {
    @Override
    public void popup(String message) {
        System.out.println("--------------");
        System.out.println("Sending Notification.....");
        System.out.println("From Viber");
        System.out.println(message);
        System.out.println("--------------");
    }
}
