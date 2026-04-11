package org.example.assigment.thiri.HotelBookingSystem;

public class RoomInfoDisplay extends HotelData {

    @Override
    public void execute() {
        header("DISPLAY ALL ROOM INFORMATION");
        System.out.printf("%-9s %-11s %-12s %-13s%-10s\n", "Room", "Type" , "Price", "Status", "Customer Name");

        for(int i = 0; i < roomInfo.length; i++ ) {
            String num = roomInfo[i][0];
            String type = roomInfo[i][1];
            String price = roomInfo[i][2];
            String status = roomInfo[i][3];
            String name = roomInfo[i][4];

            if(roomInfo[i][3].equals("Available")) {
                System.out.printf("%-5s | %-10s | %-10s | %-10s |\n", num , type , "RM " + price , status);
            }else if(roomInfo[i][3].equals("Booked")){
                System.out.printf("%-5s | %-10s | %-10s | %-10s | %-10s\n", num , type , "RM " + price, status , " by " + name);}
        }
        System.out.println("-".repeat(50));
    }
}
