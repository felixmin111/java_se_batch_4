package org.example.assigment.lapyae.day7.notification;



public class API {
    public static void main(String[] args){
        Email message1 = new Email();
        Telegram message2 = new Telegram();
        Instagram message3 = new Instagram();

        Notify notification1 = new Notify(message1);
        notification1.SendNotification("Hello World");

        Notify notification2 = new Notify(message2);
        notification2.SendNotification("Hello World");

        Notify notification3 = new Notify(message3);
        notification3.SendNotification("Hello World");

        }
    }
