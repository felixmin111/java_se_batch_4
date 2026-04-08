package org.example.assigment.thiri.Day8.HotelBookingSystem;

public class RoomBooked extends HotelData {
    @Override
    public void countBookedRoom() {
        System.out.println("----- Booked Rooms ----- ");
        int count = 0;
        for (int i = 0; i < roomInfo.length; i++) {
            if (roomInfo[i][3].equals("Booked")) {
                count++;
            }
        }
        System.out.println("Booked Rooms: " + count);
        System.out.println();

    }

    public void displayInfo() {}
    public void book() {}
    public void cancel() {}
    public void search() {}
    public void countAvailableRoom() {}
    public void exit() {
    }
}
