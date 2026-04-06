package org.example.assigment.thiri.Day7.Notification;

public class notiApi {
    public static void main(String[] args) {

        email notiEmail = new email();
        notiService noti1 = new notiService(notiEmail);
        noti1.notifier("Congratulations! You are selected as the team members.");

        sms notiSms = new sms();
        notiService noti2 = new notiService(notiSms);
        noti2.notifier("Your bill is expired");

        push notiPush = new push();
        notiService noti3 = new notiService(notiPush);
        noti3.notifier("Nice to meet you");

    }

}
