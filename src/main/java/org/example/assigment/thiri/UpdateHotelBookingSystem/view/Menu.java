package org.example.assigment.thiri.UpdateHotelBookingSystem.view;

import java.util.Scanner;

public class Menu {
    static Scanner sc = new Scanner(System.in);

    public static int displayFunction() {
        int choice;

        while (true) {
            System.out.println("=".repeat(50));
            System.out.println("      *  WELCOME FROM PAN PACIFIC HOTEL *");
            System.out.println("=".repeat(50));
            System.out.println("              AVAILABLE FUNCTIONS");
            System.out.println("=".repeat(50));
            System.out.println("""
                
                1. Display All Rooms
                2. Book a Room
                3. Cancel Booking
                4. Search Room
                5. Count Available Rooms
                6. Count Booked Rooms
                7. Exit""");
            System.out.println("-".repeat(50));

            System.out.println("Enter choice eg. 1: ");

            try {
                choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                if (choice >= 1 && choice <= 7) {
                    return choice;
                } else {
                    System.out.println("==> Please enter a number between 1–7.");
                }

            } catch (Exception e) {
                System.out.println("==> Invalid input. Please enter a number.");
                sc.nextLine(); // clear wrong input
            }
        }
    }

    public static int getRoomNum() {
        while (true) {
            System.out.println("Enter room number: ");
            try {
                int roomNum = sc.nextInt();
                sc.nextLine();
                return roomNum;
            } catch (Exception e) {
                System.out.println("==> Invalid Input! Please enter a number.");
                sc.nextLine();
            }
        }
    }

    public static String getCusName() {
        System.out.println("Enter your name: ");
        String cusName = sc.nextLine();
        return cusName;
    }

}