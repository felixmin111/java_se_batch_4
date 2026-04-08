package org.example.assigment.thiri.Day8.HotelBookingSystem;

import static org.example.assigment.lapyae.day5.StudentReg.sc;

public class MainApp {
    public static void main(String[] args)  {
        BookingService bookingService = new BookingService(new RoomInfoDisplay());
        BookingService bookingService1 = new BookingService(new RoomBooking());
        BookingService bookingService2 = new BookingService(new RoomCancellation());
        BookingService bookingService3 = new BookingService(new RoomSearching());
        BookingService bookingService4 = new BookingService(new RoomAvailable());
        BookingService bookingService5 = new BookingService(new RoomBooked());
        BookingService bookingService6 = new BookingService(new ExitSystem());
        }
    }

//    public static void main(){
//
//        int choice;
//        do{
//            System.out.println("Welcome from Pan Pacific Hotel");
//            System.out.println("\n----- Available Functions -----");
//            System.out.println(
//                            "1. Display All Rooms\n" +
//                            "2. Book a Room\n" +
//                            "3. Cancel Booking\n" +
//                            "4. Search Room\n" +
//                            "5. Count Available Rooms\n" +
//                            "6. Count Booked Rooms\n" +
//                            "7. Exit");
//            System.out.println("-------------------------------");
//
//            System.out.println("Enter choice eg. 1: ");
//            choice = sc.nextInt();
//
//        }while(choice!=7);
//
//    }


