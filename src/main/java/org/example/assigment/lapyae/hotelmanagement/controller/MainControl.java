package org.example.assigment.lapyae.hotelmanagement.controller;

import org.example.assigment.lapyae.hotelmanagement.service.HotelRoomService;
import org.example.assigment.lapyae.hotelmanagement.view.MenuPage;
import org.example.assigment.lapyae.hotelmanagement.service.*;
import org.example.assigment.lapyae.hotelmanagement.model.HotelRooms;
import org.example.assigment.lapyae.hotelmanagement.exception.*;
import java.util.List;

public class MainControl {
    private HotelRoomService service = new HotelRoomServicePro();

    public List<HotelRooms> handleDisplayAll() {
        return service.getAllRooms();
    }

    public String handleBooking(int roomNum, String name) {
        try {
            service.bookRoom(roomNum, name);
            return "Room " + roomNum + " booked successfully for " + name + ".";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public String handleCancel(int roomNum) {
        try {
            service.cancelBooking(roomNum);
            return "Booking for Room " + roomNum + " has been cancelled.";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public void handleSearch(int roomNum) {
        try {
            HotelRooms room = service.searchRoom(roomNum);
            System.out.println("Room Number: " + room.getRoomNumber());
            System.out.println("Room Type: " + room.getRoomType());
            System.out.println("Price: " + room.getPrice());
            System.out.println("Status: " + (room.isBooked() ? "Booked" : "Available"));
            if (room.isBooked()) System.out.println("Guest Name: " + room.getGuestName());
        } catch (NotFoundRoomsException e) {
            System.out.println(e.getMessage());
        }
    }

    public long handleCountAvailable() { return service.countAvailable(); }
    public long handleCountBooked() { return service.countBooked(); }
}
