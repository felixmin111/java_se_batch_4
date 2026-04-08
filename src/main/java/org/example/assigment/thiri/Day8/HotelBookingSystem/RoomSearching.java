package org.example.assigment.thiri.Day8.HotelBookingSystem;

public class RoomSearching extends HotelData{

    @Override
    public void search() {
        System.out.println("----- Room Searching Session ----- ");
        System.out.println("Enter room number: ");
        String roomNum = sc.nextLine();
        boolean found = false;

        for(int i = 0; i < roomInfo.length; i++ ) {
            String num = roomInfo[i][0];
            String type = roomInfo[i][1];
            String price = roomInfo[i][2];
            String status = roomInfo[i][3];
            String name = roomInfo[i][4];

            if(roomInfo[i][0].equals(roomNum)) {
                found = true;
                System.out.println("\n==> Details Information of the Room <==");
                System.out.println("Room Number: " + num);
                System.out.println("Room Type: " + type);
                System.out.println("Price: " + price);
                System.out.println("Status: " + status);
                    if(roomInfo[i][3].equals("Booked")) {
                        System.out.println("Guest Name: " + name);
                    }
            }else if(!found){
                System.out.println("\n==> Room number does not exist.");}
        }
        System.out.println();
    }

    public void displayInfo() {}
    public void book() {}
    public void cancel() {}
    public void countAvailableRoom() {}
    public void countBookedRoom() {}
    public void exit() {
    }
}
