package org.example.assigment.aung.hotelassignment.service;
import org.example.assigment.aung.hotelassignment.exception.RoomAlreadyBookedException;
import org.example.assigment.aung.hotelassignment.exception.RoomNotBookedException;
import org.example.assigment.aung.hotelassignment.exception.RoomNotFoundException;

public interface RoomService {
    public void displayAllRooms();
    public void bookRoom(int roomNumber, String guestName) throws RoomNotFoundException, RoomAlreadyBookedException;
    public void cancelBooking(int roomNumber) throws RoomNotBookedException,  RoomNotFoundException;
    public void searchRoom(int roomNumber) throws RoomNotFoundException;
    public int getAvailableRoomCount();
    public int getBookedRoomCount();
}
