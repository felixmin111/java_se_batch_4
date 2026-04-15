package org.example.assigment.lapyae.hotelmanagement.view;
import org.example.assigment.lapyae.hotelmanagement.controller.MainControl;
import org.example.assigment.lapyae.hotelmanagement.model.HotelRooms;
import java.util.Scanner;

public class MenuPage {
    private MainControl controller = new MainControl();
    private Scanner sc = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\nONE HOTEL");
            System.out.println("1. Display All Rooms");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Search Room");
            System.out.println("5. Count Available Rooms");
            System.out.println("6. Count Booked Rooms");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (HotelRooms r : controller.handleDisplayAll()) {
                        String status = r.isBooked() ? "Booked by " + r.getGuestName() : "Available";
                        System.out.println("Room " + r.getRoomNumber() + " | " + r.getRoomType() +
                                " | Price: " + r.getPrice() + " | " + status);
                    }
                    break;
                case 2:
                    System.out.print("Enter room number: ");
                    int rNum = sc.nextInt();
                    System.out.print("Enter guest name: ");
                    String name = sc.next();
                    System.out.println(controller.handleBooking(rNum, name));
                    break;
                case 3:
                    System.out.print("Enter room number to cancel: ");
                    System.out.println(controller.handleCancel(sc.nextInt()));
                    break;
                case 4:
                    System.out.print("Enter room number to search: ");
                    controller.handleSearch(sc.nextInt());
                    break;
                case 5:
                    System.out.println("Available Rooms: " + controller.handleCountAvailable());
                    break;
                case 6:
                    System.out.println("Booked Rooms: " + controller.handleCountBooked());
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}