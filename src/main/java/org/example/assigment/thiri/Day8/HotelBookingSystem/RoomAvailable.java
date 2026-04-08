package org.example.assigment.thiri.Day8.HotelBookingSystem;

import static org.example.assigment.thiri.Day8.HotelBookingSystem.MainApp.main;

public class RoomAvailable extends HotelData{

    @Override
    public void countAvailableRoom() {
        System.out.println("----- Available Rooms ----- ");
        int count = 0;
        for (int i = 0; i < roomInfo.length; i++) {
            if (roomInfo[i][3].equals("Available")) {
                count++;
            }
        }
        System.out.println("Available Rooms: " + count);
        System.out.println();
    }

    public void displayInfo() {}
    public void book() {}
    public void cancel() {}
    public void search() {}
    public void countBookedRoom() {}
    public void exit() {
    }
}
