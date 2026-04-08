package org.example.assigment.thiri.Day8.HotelBookingSystem;

import static org.example.assigment.thiri.Day8.HotelBookingSystem.MainApp.main;

public class RoomBooking extends HotelData{

    @Override
    public void book() {
        boolean book = false;
        do {
            System.out.println("----- Room Booking Session ----- ");
            System.out.println("Enter room number: ");
            String roomNum = sc.nextLine();
            boolean found = false;

            for (int i = 0; i < roomInfo.length; i++) {
                if (roomNum.equals(roomInfo[i][0])) {
                    found = true;

                    if (roomInfo[i][3].equals("Available")) {
                        roomInfo[i][3] = "Booked";

                        System.out.println("Enter your name: ");
                        String cusName = sc.nextLine();
                        roomInfo[i][4] = cusName;

                        System.out.println("\n==> Room " + roomNum + " is booked successfully for " + cusName + ".");
                        book = true;
                        break;

                    } else if (roomInfo[i][3].equals("Booked")) {
                        System.out.println("\n==> Unfortunately! Selected room is not Available");
                        System.out.print("Try again? (y/n): ");
                        String choice = sc.nextLine();

                        if (choice.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                }
            }
            if (!found) {
                System.out.println("\n==> Room number does not exist.");
                System.out.print("Try again? (y/n): ");
                String choice = sc.nextLine();

                if (choice.equalsIgnoreCase("n")) {
                    break;
                }
            }
            System.out.println();
        }while(!book);//{main();};
    }


    public void displayInfo() {}
    public void cancel() {}
    public void search() {}
    public void countAvailableRoom() {}
    public void countBookedRoom() {}
    public void exit() {}
}
