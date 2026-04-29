package org.example.assigment.yuki.HotelManagementSystem.Service;

import org.example.assigment.yuki.HotelManagementSystem.Model.Room;

public interface RoomServiceImpl {
    Room[] getAllRooms();
    Room findRoomByNumber(int roomNumber);
    void bookRoom(int roomNumber, String guestName) throws Exception;
    void cancelBooking(int roomNumber) throws Exception;
    int countAvailableRooms();
    int countBookedRooms();
}
