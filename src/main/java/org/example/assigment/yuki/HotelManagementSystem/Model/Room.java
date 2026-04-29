package org.example.assigment.yuki.HotelManagementSystem.Model;

public class Room {
    private int roomNumber;
    private String roomType;
    private double price;
    private boolean isBooked;
    private String guestName;

    public Room(){}

    public Room(int roomNumber, String roomType, double price, boolean isBooked, String guestName) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isBooked = isBooked;
        this.guestName = guestName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }
}




