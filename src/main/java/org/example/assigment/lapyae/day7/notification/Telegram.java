package org.example.assigment.lapyae.day7.notification;

public class Telegram extends Noti{
    @Override
    public void send(String message){
        System.out.println("--------------");
        System.out.println("Telegram");
        System.out.println("Notification");
        System.out.println(message);
        System.out.println("--------------");
    }
}
