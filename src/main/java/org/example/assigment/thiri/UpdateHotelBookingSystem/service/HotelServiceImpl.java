package org.example.assigment.thiri.UpdateHotelBookingSystem.service;

import org.example.assigment.aung.hotelassignment.model.Room;
import org.example.assigment.thiri.UpdateHotelBookingSystem.model.RoomData;

public class HotelServiceImpl implements HotelService {
    public RoomData[] roomData = new RoomData[15];

    public HotelServiceImpl(){
        roomData[0] = new RoomData(101, "Standard", 50.0, "Available", "");
        roomData[1] = new RoomData(102, "Deluxe", 100.0, "Booked", "Alice");
        roomData[2] = new RoomData(103, "Standard", 50.0, "Available", "");
        roomData[3] = new RoomData(104, "Deluxe", 100.0, "Available", "");
        roomData[4] = new RoomData(105, "Suite", 150.0, "Booked", "John");
        roomData[5] = new RoomData(201, "Standard", 50.0, "Available", "");
        roomData[6] = new RoomData(202, "Deluxe", 100.0, "Booked", "Emma");
        roomData[7] = new RoomData(203, "Suite", 150.0, "Available", "");
        roomData[8] = new RoomData(204, "Standard", 50.0, "Available", "");
        roomData[9] = new RoomData(205, "Deluxe", 100.0, "Available", "");
        roomData[10] = new RoomData(301, "Suite", 150.0, "Booked", "David");
        roomData[11] = new RoomData(302, "Standard", 50.0, "Available", "");
        roomData[12] = new RoomData(303, "Deluxe", 100.0, "Available", "");
        roomData[13] = new RoomData(304, "Suite", 150.0, "Available", "");
        roomData[14] = new RoomData(305, "Standard", 50.0, "Booked", "Sophia");
    }

    @Override
    public void displayAllRooms() {

        for (RoomData room : roomData){
            System.out.println(room);}
    }

    @Override
    public void bookRoom(int roomNum, String cusName)  {
        boolean found = false;
            for (RoomData room : roomData) {
                if (room.getNum()==roomNum) {
                    found = true;

                    if (room.getStatus().equalsIgnoreCase("Available")) {
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
        for (RoomData room : roomData) {
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
        for (RoomData room : roomData) {
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
        for (RoomData room : roomData)  {
            if (room.getStatus().equalsIgnoreCase("Available")) {
                count++;
            }
        }
        System.out.println("Available Rooms: " + count);
    }

    @Override
    public void getBookedRoomCount() {
        int count = 0;
        for (RoomData room : roomData)  {
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
