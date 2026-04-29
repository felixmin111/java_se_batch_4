package org.example.assigment.thiri.Day9_12.OldHotelBookingSystem;

import java.util.Scanner;

public abstract class HotelData implements BookingSystem {

        static Scanner sc = new Scanner(System.in);
        static String[][] roomInfo = {
                {"101", "Standard", "50.0", "Available", ""},
                {"102", "Deluxe", "100.0", "Booked", "Alice"},
                {"103", "Standard", "50.0", "Available", ""},
                {"104", "Deluxe", "100.0", "Available", ""},
                {"105", "Suite", "150.0", "Booked", "John"},
                {"201", "Standard", "50.0", "Available", ""},
                {"202", "Deluxe", "100.0", "Booked", "Emma"},
                {"203", "Suite", "150.0", "Available", ""},
                {"204", "Standard", "50.0", "Available", ""},
                {"205", "Deluxe", "100.0", "Available", ""},
                {"301", "Suite", "150.0", "Booked", "David"},
                {"302", "Standard", "50.0", "Available", ""},
                {"303", "Deluxe", "100.0", "Available", ""},
                {"304", "Suite", "150.0", "Available", ""},
                {"305", "Standard", "50.0", "Booked", "Sophia"}
        };

        public static void header(String word) {

                int width = 50;
                int padding = (width - word.length()) / 2;
                String space = " ".repeat(padding);

                System.out.println("=".repeat(50));
                System.out.println(space +  word);
                System.out.println("=".repeat(50));

        }

        public static String headerAndDataAsking(String word) {
                header(word);
                String roomNum;
                System.out.println("Enter room number: ");
                return roomNum = sc.nextLine();
        }

        public static boolean tryAgain(String word) {
                String choice;
                boolean book = false;
                do{
                        System.out.println("-".repeat(50));
                        System.out.print("Would you like to "+ word + " another room? (y/n): ");
                        choice = sc.nextLine();

                        if (choice.equalsIgnoreCase("y")) {
                                break;
                        } else if (choice.equalsIgnoreCase("n")) {
                                book = true;
                                break;
                        }else{
                                System.out.println("\n==> Invalid Input. Try Again!");
                        }
                } while (!choice.equalsIgnoreCase("y"));
                return book;
        }

        public static boolean leavingCurrentSession(String word) {

                boolean book;

                int width = 50;
                String word1 = "==> Leaving  Function <==";

                int padding = (width - word.length() - word1.length()) / 2;
                String space = " ".repeat(padding);

                System.out.println("=".repeat(50));
                System.out.println(space+"==> Leaving " + word + " Function <==");
                System.out.println("=".repeat(50));

                return book = true;
        }

}

