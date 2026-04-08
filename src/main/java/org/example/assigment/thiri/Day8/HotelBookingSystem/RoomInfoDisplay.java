package org.example.assigment.thiri.Day8.HotelBookingSystem;

public class RoomInfoDisplay extends HotelData {

    @Override
    public void displayInfo() {
        System.out.println("------ Room Information -----");
        for(int i = 0; i < roomInfo.length; i++ ) {
            String num = roomInfo[i][0];
            String type = roomInfo[i][1];
            String price = roomInfo[i][2];
            String status = roomInfo[i][3];
            String name = roomInfo[i][4];

            if(roomInfo[i][3].equals("Available")) {
                System.out.println("Room " + num + " | " + type + " | " + "Price: " + price + " | " + status);
            }else if(roomInfo[i][3].equals("Booked")){
                System.out.println("Room " + num + " | " + type + " | " + "Price: " + price + " | " + status + " by " + name);}
        }
        System.out.println();
    }

    public void book() {}
    public void cancel() {}
    public void search() {}
    public void countAvailableRoom() {}
    public void countBookedRoom() {}
    public void exit() {}
}
