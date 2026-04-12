package org.example.assigment.aung.hotelassignment.model;

public class Room {
    private int number;
    private String type;
    private double price;
    private boolean bookingStatus;
    private String guestName;

    public Room(int number, String type, double price, boolean bookingStatus, String guestName) {
        this.number = number;
        this.type = type;
        this.price = price;
        this.bookingStatus = bookingStatus;
        this.guestName = guestName;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBooked() {
        return bookingStatus;
    }

    public void setBooked(boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    @Override
    public String toString() {
        String status = "";
        if (bookingStatus) {
            status = "Booked by " + guestName;
        }
        else {
            status = "Available";
        }
        return this.number+" |"+
                this.type+" |"+
                "Price: "+this.price+" |"+
                status;
    }
}
