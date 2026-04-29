package org.example.assigment.yuki.HotelManagementSystem.Service;

import org.example.assigment.yuki.HotelManagementSystem.Exception.RoomAlreadyBookedException;
import org.example.assigment.yuki.HotelManagementSystem.Exception.RoomNotFoundException;
import org.example.assigment.yuki.HotelManagementSystem.Exception.RoomNotBookedException;
import org.example.assigment.yuki.HotelManagementSystem.Model.Room;

public class RoomService implements RoomServiceImpl{
    private Room[] rooms;
    public RoomService() {
        rooms = new Room[10];
        rooms[0] = new Room(1, "Standard", 50.0, false, "");
        rooms[1] = new Room(2, "Deluxe", 100.0, false, "");
        rooms[2] = new Room(3, "Standard", 50.0, false, "");
        rooms[3] = new Room(4, "Deluxe", 100.0, false, "");
        rooms[4] = new Room(5, "Standard", 50.0, false, "");
        rooms[5] = new Room(6, "Deluxe", 100.0, true, "Tun");
        rooms[6] = new Room(7, "Standard", 50.0, false, "");
        rooms[7] = new Room(8, "Deluxe", 100.0, false, "");
        rooms[8] = new Room(9, "Standard", 50.0, false, "");
        rooms[9] = new Room(10, "Deluxe", 100.0, false, "");
    }

    public Room[] getAllRooms() {
        return rooms;
    }

    public Room findRoomByNumber(int roomNumber) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].getRoomNumber() == roomNumber) {
                return rooms[i];
            }
        }
        return null;
    }

    @Override
    public void bookRoom(int roomNumber, String guestName) throws Exception {
        Room room = findRoomByNumber(roomNumber);

        if (room == null) {
            throw new RoomNotFoundException("Room not found.");
        }
        if (room.isBooked()) {
            throw new RoomAlreadyBookedException("Room is already booked.");
        }
        room.setBooked(true);
        room.setGuestName(guestName);
    }

    @Override
    public void cancelBooking(int roomNumber) throws Exception {
        Room room = findRoomByNumber(roomNumber);
        if (room == null) {
            throw new RoomNotFoundException("Room not found.");
        }
        if (!room.isBooked()) {
            throw new RoomNotBookedException("Room is not currently booked.");
        }
        room.setBooked(false);
        room.setGuestName("");

    }

    public int countAvailableRooms() {
        int availableRooms = 0;
        for(int i = 0; i < rooms.length; i++){
            if(!rooms[i].isBooked()){
                availableRooms++;
            }
        }
        return availableRooms;
    }

    public int countBookedRooms() {
        int bookedRooms = 0;
        for(int i = 0; i < rooms.length; i++){
            if(rooms[i].isBooked()){
                bookedRooms++;
            }
        }
        return bookedRooms;
    }


}
