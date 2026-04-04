package org.example.assigment.thiri.Day7.Notification;

public class sms extends Notification{
    @Override
    public void send(String message) {
        System.out.println("----- Notification from SMS -----");
        System.out.println(message);
        System.out.println();
    }
}
