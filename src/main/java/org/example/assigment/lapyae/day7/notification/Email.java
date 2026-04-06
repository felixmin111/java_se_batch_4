package org.example.assigment.lapyae.day7.notification;

public class Email extends Noti {
    @Override
    public void send(String message){
        System.out.println("--------------");
        System.out.println("Email");
        System.out.println("Notification");
        System.out.println(message);
        System.out.println("--------------");
    }
}
