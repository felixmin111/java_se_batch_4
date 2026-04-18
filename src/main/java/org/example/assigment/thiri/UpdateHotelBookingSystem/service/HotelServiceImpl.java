package org.example.assigment.thiri.UpdateHotelBookingSystem.service;

import org.example.assigment.thiri.UpdateHotelBookingSystem.model.Room;

public class HotelServiceImpl implements HotelService {
    public Room[] roomData = new Room[15];

    public HotelServiceImpl(){
        roomData[0] = new Room(101, "Standard", 50.0, "Available", "");
        roomData[1] = new Room(102, "Deluxe", 100.0, "Booked", "Alice");
        roomData[2] = new Room(103, "Standard", 50.0, "Available", "");
        roomData[3] = new Room(104, "Deluxe", 100.0, "Available", "");
        roomData[4] = new Room(105, "Suite", 150.0, "Booked", "John");
        roomData[5] = new Room(201, "Standard", 50.0, "Available", "");
        roomData[6] = new Room(202, "Deluxe", 100.0, "Booked", "Emma");
        roomData[7] = new Room(203, "Suite", 150.0, "Available", "");
        roomData[8] = new Room(204, "Standard", 50.0, "Available", "");
        roomData[9] = new Room(205, "Deluxe", 100.0, "Available", "");
        roomData[10] = new Room(301, "Suite", 150.0, "Booked", "David");
        roomData[11] = new Room(302, "Standard", 50.0, "Available", "");
        roomData[12] = new Room(303, "Deluxe", 100.0, "Available", "");
        roomData[13] = new Room(304, "Suite", 150.0, "Available", "");
        roomData[14] = new Room(305, "Standard", 50.0, "Booked", "Sophia");
    }

    @Override
    public void displayAllRooms() {

        for (Room room : roomData){
            System.out.println(room);}
    }

    @Override
    public void bookRoom(int roomNum, String cusName)  {
        boolean found = false;
            for (Room room : roomData) {
                if (room.getNum()==roomNum) {
                    found = true;

                    if (room.getStatus().equalsIgnoreCase("0")) {
                        room.setStatus("Booked");
                        room.setCusName(cusName);

                        System.out.println("-".repeat(50));
                        System.out.println("==> Room " + roomNum + " is booked successfully for \"" + cusName + "\".");
                    } else {
                        System.out.println("\n==> Unfortunately! Selected room is not available.");
                    }
                    break;
                }
            }
            if (!found) {System.out.println("\n==> Room number does not exist.");}

    }

    @Override
    public void cancelBooking(int roomNum) {
        boolean found = false;
        for (Room room : roomData) {
            if (room.getNum()==roomNum) {
                found = true;
                if (room.getStatus().equalsIgnoreCase("Booked")) {
                    room.setStatus("Available");
                    room.setCusName("");
                    System.out.println("\n==> Booking for Room " + roomNum + " has been cancelled.");
                } else {
                    System.out.println("\n==> Room " + roomNum + " is not currently booked.");
                }
            }
        }if (!found) {System.out.println("==> Room number " + roomNum + " does not exist.");}
    }

    @Override
    public void searchRoom(int roomNum) {
        boolean found = false;
        for (Room room : roomData) {
            if (room.getNum()==roomNum) {
                found = true;
                System.out.println("\n==> Details Information of the Room <==");
                System.out.println("Room Number: " + room.getNum());
                System.out.println("Room Type: " + room.getType());
                System.out.println("Price: " + room.getPrice());
                System.out.println("Status: " + room.getStatus());
                if (room.getStatus().equalsIgnoreCase("Booked")) {
                    System.out.println("Guest Name: " + room.getCusName());
                }
            }
        }
        if (!found) {
            System.out.println("\n==> Room number " + roomNum + " does not exist.");
        }
    }

    @Override
    public void getAvailableRoomCount() {
        int count = 0;
        for (Room room : roomData)  {
            if (room.getStatus().equalsIgnoreCase("Available")) {
                count++;
            }
        }
        System.out.println("Available Rooms: " + count);
    }

    @Override
    public void getBookedRoomCount() {
        int count = 0;
        for (Room room : roomData)  {
            if (room.getStatus().equalsIgnoreCase("Booked")) {
                count++;
            }
        }
        System.out.println("Booked Rooms: " + count);
    }

    @Override
    public void exit() {
        System.out.println("=".repeat(50));
        System.out.println("   Thank you for using our Hotel Booking System");
        System.out.println("=".repeat(50));
    }

}
