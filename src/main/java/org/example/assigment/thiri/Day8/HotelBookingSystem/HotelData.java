package org.example.assigment.thiri.Day8.HotelBookingSystem;

import java.util.Scanner;

public abstract class HotelData implements BookingSystem {

        Scanner sc = new Scanner(System.in);
        static String[][] roomInfo = {
                {"101", "Standard", "50.0", "Available", ""},
                {"102", "Deluxe", "100.0", "Booked", "Alice"},
                {"103", "Standard", "50.0", "Available", ""},
                {"104", "Deluxe", "100.0", "Available", ""},
                {"105", "Suite", "150.0", "Booked", "John"},
                {"106", "Standard", "50.0", "Available", ""},
                {"107", "Deluxe", "100.0", "Booked", "Emma"},
                {"108", "Suite", "150.0", "Available", ""},
                {"109", "Standard", "50.0", "Available", ""},
                {"110", "Deluxe", "100.0", "Available", ""},
                {"111", "Suite", "150.0", "Booked", "David"},
                {"112", "Standard", "50.0", "Available", ""},
                {"113", "Deluxe", "100.0", "Available", ""},
                {"114", "Suite", "150.0", "Available", ""},
                {"115", "Standard", "50.0", "Booked", "Sophia"}
        };
}

