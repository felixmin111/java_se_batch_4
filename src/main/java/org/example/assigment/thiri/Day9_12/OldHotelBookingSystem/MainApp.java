package org.example.assigment.thiri.Day9_12.OldHotelBookingSystem;

import static org.example.assigment.thiri.Day9_12.OldHotelBookingSystem.HotelData.header;
import static org.example.assigment.thiri.Day9_12.OldHotelBookingSystem.HotelData.sc;

public class MainApp {

    public static void main(String[] args) {displayFunction();}

    public static void displayFunction() {
        int choice;
        do {
            System.out.println("=".repeat(50));
            System.out.println("      *  WELCOME FROM PAN PACIFIC HOTEL *");
            header("AVAILABLE FUNCTIONS");
            System.out.println(
                    """     
                            
                            1. Display All Rooms
                            2. Book a Room
                            3. Cancel Booking
                            4. Search Room
                            5. Count Available Rooms
                            6. Count Booked Rooms
                            7. Exit""");
            System.out.println("-".repeat(50));

            try{
            System.out.println("Enter choice eg. 1: ");
            choice = sc.nextInt();
            sc.nextLine();
            } catch (RuntimeException e) {
                sc.nextLine();
                choice = 0;
            }

            choiceProcessing(choice);

            if (choice== 1 || choice== 2 || choice== 3|| choice== 4|| choice== 5|| choice== 6) {
                choice = continueService();}

        } while (choice != 7 ) ;
        {sc.close();}
    }

    public static void choiceProcessing(int choice) {

        switch (choice) {
            case 1:
                BookingService bookingService = new BookingService(new RoomInfoDisplay());
                break;
            case 2:
                BookingService bookingService1 = new BookingService(new RoomBooking());
                break;
            case 3:
                BookingService bookingService2 = new BookingService(new RoomCancellation());
                break;
            case 4:
                BookingService bookingService3 = new BookingService(new RoomSearching());
                break;
            case 5:
                BookingService bookingService4 = new BookingService(new RoomAvailable());
                break;
            case 6:
                BookingService bookingService5 = new BookingService(new RoomBooked());
                break;
            case 7:
                BookingService bookingService6 = new BookingService(new ExitSystem());
                break;
            default:
                System.out.println("\n==> Invalid Input. Try Again!");
                break;
        }

    }

    public static int continueService() {
        int choice1 = 0 ;
        String keepingOn;
        do {
            System.out.println("Would you like to try another function? (y/n): ");
            keepingOn = sc.nextLine();

            if (keepingOn.equalsIgnoreCase("y")) {
                break;
            } else if (keepingOn.equalsIgnoreCase("n")) {
                BookingService bookingService6 = new BookingService(new ExitSystem());
                choice1 = 7;
                break;
            } else {
                System.out.println("\n==> Invalid input. Try again!");
                System.out.println("-".repeat(50));
            }
        } while (!keepingOn.equals("y"));
        return choice1;
    }
}