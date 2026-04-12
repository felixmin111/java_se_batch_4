package org.example.assigment.aung.hotelassignment.view;
import java.util.Scanner;
public class MainMenu {
    public static Scanner sc = new Scanner(System.in);
    public int displayMenu() {
        System.out.println("\n\n=====Welcome to One hotel=====\n Available Functions\n"+
                "(1) Display all rooms\n" +
                "(2) Book a room\n"+
                "(3) Cancel Booking\n"+
                "(4) Search Room\n"+
                "(5) Count available rooms\n"+
                "(6) Count Booked rooms\n"+
                "(7) Exit\n"+
                "\nEnter your choice: "
        );
        int choice=sc.nextInt();sc.nextLine();
        return choice;
    }
    public int inputRoomNumber() {
        System.out.println("Enter Room Number: ");
        int number =sc.nextInt();sc.nextLine();
        return number;
    }
    public String inputGuestName() {
        System.out.println("Enter Guest Name: ");
        String name =sc.nextLine();
        return name;
    }
}
