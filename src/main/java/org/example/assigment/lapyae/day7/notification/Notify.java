package org.example.assigment.lapyae.day7.notification;

public class Notify {
    Noti noti;
    public Notify(Noti noti) {
        this.noti = noti;
    }

    public void SendNotification(String message) {noti.send(message);}

}
