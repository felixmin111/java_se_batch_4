package org.example.assigment.thiri.HotelBookingSystem;

public class RoomCancellation extends HotelData {

    @Override
    public void execute() {
        boolean cancel = false;
        do {
            String roomNum;
            boolean found = false;
            roomNum = headerAndDataAsking("ROOM CANCELLATION");

            for (int i = 0; i < roomInfo.length; i++) {

                if (roomNum.equals(roomInfo[i][0])) {
                    found = true;

                    if (roomInfo[i][3].equals("Booked")) {
                        roomInfo[i][3] = "Available";
                        roomInfo[i][4] = "";

                        System.out.println("\n==> Booking for Room " + roomNum + " has been cancelled.");
                        cancel = tryAgain("cancel booking for");

                    } else if (roomInfo[i][3].equals("Available")) {
                        System.out.println("\n==> Room "+ roomNum+  " is not currently booked.");
                        cancel = tryAgain("cancel booking for");
                    }
                }
            }
            if (!found) {
                System.out.println();
                System.out.println("==> Room number " + roomNum + " does not exist. Try again!");
                cancel = tryAgain("cancel booking for");
            }
        }while (!cancel);
        leavingCurrentSession("Cancellation");
    }
}
