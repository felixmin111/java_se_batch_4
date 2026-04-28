package org.example.assigment.thiri.Day9_12.OldHotelBookingSystem;

public class RoomAvailable extends HotelData {

    @Override
    public void execute() {
        header("COUNT AVAILABLE ROOM");

        int count = 0;
        for (int i = 0; i < roomInfo.length; i++) {
            if (roomInfo[i][3].equals("Available")) {
                count++;
            }
        }
        System.out.println("Available Rooms: " + count);
        leavingCurrentSession("Current");
    }

}
