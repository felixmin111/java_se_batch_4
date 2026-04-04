package org.example.assigment.thiri.Day7.Notification;

public class push extends Notification{
        @Override
        public void send(String message) {
            System.out.println("----- Notification from Push -----");
            System.out.println(message);
            System.out.println();
        }
    }

