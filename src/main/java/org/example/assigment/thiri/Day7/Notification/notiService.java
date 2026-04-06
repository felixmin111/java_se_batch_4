package org.example.assigment.thiri.Day7.Notification;

public class notiService {
    Notification noti;
    public notiService(Notification noti) {
        this.noti = noti;
    }
    public void notifier(String message) {
        noti.send(message);
    }
}
