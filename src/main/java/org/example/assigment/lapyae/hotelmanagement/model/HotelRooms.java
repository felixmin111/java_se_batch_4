package org.example.assigment.lapyae.hotelmanagement.model;

public class HotelRooms {
    private int roomNumber;
    private String roomType;
    private double price;
    private boolean isBooked;
    private String guestName;

    public HotelRooms(int roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.isBooked = false;
        this.guestName = "";
    }

    // Getters and Setters
    public int getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public double getPrice() { return price; }
    public boolean isBooked() { return isBooked; }
    public String getGuestName() { return guestName; }

    public void setBooked(boolean booked) { isBooked = booked; }
    public void setGuestName(String guestName) { this.guestName = guestName; }
}
