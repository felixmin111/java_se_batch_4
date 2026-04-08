package org.example.assigment.thiri.Day8.HotelBookingSystem;

public class RoomCancellation extends HotelData {

    @Override
    public void cancel() {
        System.out.println("----- Room Cancellation Session ----- ");
        System.out.println("Enter room number: ");
        String roomNum = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < roomInfo.length; i++) {
            if (roomNum.equals(roomInfo[i][0])) {
                found = true;
                if (roomInfo[i][3].equals("Booked")) {
                    roomInfo[i][3] = "Available";
                    roomInfo[i][4] = "";

                    System.out.println("\n==> Booking for Room " + roomNum + " has been cancelled.");

                } else if (roomInfo[i][3].equals("Available")) {
                    System.out.println("\n==> Room "+ roomNum+  " is not currently booked.");
                }
            }
        }
        if (!found) {
            System.out.println();
            System.out.println("\n==> Room number does not exist.");
        }
        System.out.println();
    }
    public void displayInfo() {}
    public void book() {}
    public void search() {}
    public void countAvailableRoom() {}
    public void countBookedRoom() {}
    public void exit() {
    }
}
