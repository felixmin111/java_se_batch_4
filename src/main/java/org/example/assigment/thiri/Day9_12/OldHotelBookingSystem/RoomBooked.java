package org.example.assigment.thiri.Day9_12.OldHotelBookingSystem;

public class RoomBooked extends HotelData {
    @Override
    public void execute() {
        header("COUNT BOOKED ROOMS");
        int count = 0;
        for (int i = 0; i < roomInfo.length; i++) {
            if (roomInfo[i][3].equals("Booked")) {
                count++;
            }
        }
        System.out.println("Booked Rooms: " + count);
        leavingCurrentSession("Current");
    }
}
