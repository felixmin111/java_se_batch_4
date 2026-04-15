package org.example.assigment.lapyae.hotelmanagement.service;
import org.example.assigment.lapyae.hotelmanagement.model.HotelRooms;
import org.example.assigment.lapyae.hotelmanagement.exception.*;
import java.util.ArrayList;
import java.util.List;

public class HotelRoomServicePro implements HotelRoomService {
    private List<HotelRooms> rooms = new ArrayList<>();

    public HotelRoomServicePro() {
        // Sample data matching the assignment requirements [cite: 23, 24, 25, 26]
        rooms.add(new HotelRooms(101, "Standard", 50.0));
        rooms.add(new HotelRooms(102, "Deluxe", 100.0));
        rooms.add(new HotelRooms(103, "Standard", 50.0));
        rooms.add(new HotelRooms(104, "Deluxe", 100.0));
    }

    @Override
    public List<HotelRooms> getAllRooms() {
        return rooms;
    }

    @Override
    public void bookRoom(int roomNum, String name) throws BookedRoomException, NotFoundRoomsException {
        HotelRooms room = searchRoom(roomNum);
        if (room.isBooked()) {
            throw new BookedRoomException("Room " + roomNum + " is already booked.");
        }
        room.setBooked(true);
        room.setGuestName(name);
    }

    @Override
    public void cancelBooking(int roomNum) throws AvailableRoomsException, NotFoundRoomsException {
        HotelRooms room = searchRoom(roomNum);
        if (!room.isBooked()) {
            throw new AvailableRoomsException("Room " + roomNum + " is not currently booked.");
        }
        room.setBooked(false);
        room.setGuestName("");
    }

    @Override
    public HotelRooms searchRoom(int roomNum) throws NotFoundRoomsException {
        return rooms.stream()
                .filter(r -> r.getRoomNumber() == roomNum)
                .findFirst()
                .orElseThrow(() -> new NotFoundRoomsException("Room not found."));
    }

    @Override
    public long countAvailable() {
        return rooms.stream().filter(r -> !r.isBooked()).count();
    }

    @Override
    public long countBooked() {
        return rooms.stream().filter(r -> r.isBooked()).count();
    }
}