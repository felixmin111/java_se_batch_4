package org.example.assigment.thiri.Day7.Notification;

public class email extends Notification{
    @Override
    public void send(String message) {
        System.out.println("----- Notification from Email -----");
        System.out.println(message);
        System.out.println();
    }
}
