package org.example.assigment.thiri.HotelBookingSystem;

public class RoomBooking extends HotelData {

    @Override
    public void execute() {
        boolean book = false;
        do {
            String roomNum;
            boolean found = false;
            roomNum = headerAndDataAsking("ROOM BOOKING");

            for (int i = 0; i < roomInfo.length; i++) {

                if (roomNum.equals(roomInfo[i][0])) {
                    found = true;

                    if (roomInfo[i][3].equals("Available")) {
                        roomInfo[i][3] = "Booked";

                        System.out.println("Enter your name: ");
                        String cusName = sc.nextLine();
                        roomInfo[i][4] = cusName;

                        System.out.println("-".repeat(50));
                        System.out.println("==> Room " + roomNum + " is booked successfully for \"" + cusName + "\".");
                        book = leavingCurrentSession("Booking");
                        break;

                    } else if (roomInfo[i][3].equals("Booked")) {
                        System.out.println("\n==> Unfortunately! Selected room is not Available");
                        book = tryAgain();
                    }
                }
            }
            if (!found) {
                System.out.println("\n==> Room number does not exist. Try Again!");
            }
        }while(!book);
    }

}
