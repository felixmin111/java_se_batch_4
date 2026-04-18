package org.example.assigment.thiri.UpdateHotelBookingSystem.model;

public class RoomData {

    private int num;
    private String type;
    private double price;
    private String status;
    private String cusName;

    public RoomData(int num, String type, double price, String status, String cusName) {
        this.num = num;
        this.type = type;
        this.price = price;
        this.status = status;
        this.cusName = cusName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }


    public String toString() {

        if (status.equalsIgnoreCase("Available")) {
            return num + " | " +
                    type + " | " +
                    price + " | " +
                    status;
        } else {
            return num + " | " +
                    type + " | " +
                    price + " | " +
                    status + " by " +
                    cusName;
        }

    }
}
