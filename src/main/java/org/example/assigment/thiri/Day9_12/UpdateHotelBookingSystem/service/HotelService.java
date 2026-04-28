package org.example.assigment.thiri.Day9_12.UpdateHotelBookingSystem.service;

public interface HotelService {
    public void displayAllRooms();
    public void bookRoom(int roomNum, String cusName);
    public void cancelBooking(int roomNum);
    public void searchRoom(int roomNum);
    public void getAvailableRoomCount();
    public void getBookedRoomCount();
    public void exit();
}
