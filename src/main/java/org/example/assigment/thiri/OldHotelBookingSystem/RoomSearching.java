package org.example.assigment.thiri.OldHotelBookingSystem;

public class RoomSearching extends HotelData {

    @Override
    public void execute() {
        boolean exit = false;
        do {
            String roomNum;
            boolean found = false;
            roomNum = headerAndDataAsking("ROOM SEARCHING");

            for (int i = 0; i < roomInfo.length; i++) {

                String num = roomInfo[i][0];
                String type = roomInfo[i][1];
                String price = roomInfo[i][2];
                String status = roomInfo[i][3];
                String name = roomInfo[i][4];

                if (roomInfo[i][0].equals(roomNum)) {
                    found = true;
                    System.out.println("\n==> Details Information of the Room <==");
                    System.out.println("Room Number: " + num);
                    System.out.println("Room Type: " + type);
                    System.out.println("Price: " + price);
                    System.out.println("Status: " + status);

                    if (roomInfo[i][3].equals("Booked")) {
                        System.out.println("Guest Name: " + name);
                    }
                    exit = tryAgain("search");
                    break;
                }
            }
            if (!found) {
                System.out.println("\n==> Room number " + roomNum + " does not exist.");
                exit = tryAgain("search");
            }
        }while (!exit);
        leavingCurrentSession("Searching");
    }
}
