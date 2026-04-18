package org.example.assigment.lapyae.hotelmanagement.view;

import org.example.assigment.lapyae.hotelmanagement.model.HotelRooms;
import java.util.List;
import java.util.Scanner;

public class MenuPage {
    private Scanner sc = new Scanner(System.in);

    public int displayMenuAndGetChoice() {
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
        sc.nextLine();
        return choice;
    }

    public void displayAllRooms(List<HotelRooms> rooms) {
        for (HotelRooms r : rooms) {
            String status = r.isBooked() ? "Booked by " + r.getGuestName() : "Available";
            System.out.println("Room " + r.getRoomNumber() + " | " + r.getRoomType() +
                    " | Price: " + r.getPrice() + " | " + status);
        }
    }

    public void displayRoomDetails(HotelRooms room) {
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Price: " + room.getPrice());
        System.out.println("Status: " + (room.isBooked() ? "Booked" : "Available"));
        if (room.isBooked()) System.out.println("Guest Name: " + room.getGuestName());
    }

    public int getRoomNumberInput() {
        System.out.print("Enter room number: ");
        return sc.nextInt();
    }

    public String getGuestNameInput() {
        System.out.print("Enter guest name: ");
        return sc.next();
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}