package org.example.assigment.lapyae.hotelmanagement.controller;

import org.example.assigment.lapyae.hotelmanagement.service.*;
import org.example.assigment.lapyae.hotelmanagement.model.HotelRooms;
import org.example.assigment.lapyae.hotelmanagement.view.MenuPage;
import org.example.assigment.lapyae.hotelmanagement.exception.*;


public class MainControl {
    private HotelRoomService service = new HotelRoomServicePro();
    private MenuPage menuPage = new MenuPage(); // Controller owns the View

    public void start() {
        while (true) {

            int choice = menuPage.displayMenuAndGetChoice();

            switch (choice) {
                case 1:
                    menuPage.displayAllRooms(service.getAllRooms());
                    break;
                case 2:
                    int rNum = menuPage.getRoomNumberInput();
                    String name = menuPage.getGuestNameInput();
                    handleBooking(rNum, name);
                    break;
                case 3:
                    handleCancel(menuPage.getRoomNumberInput());
                    break;
                case 4:
                    handleSearch(menuPage.getRoomNumberInput());
                    break;
                case 5:
                    menuPage.printMessage("Available Rooms: " + service.countAvailable());
                    break;
                case 6:
                    menuPage.printMessage("Booked Rooms: " + service.countBooked());
                    break;
                case 7:
                    menuPage.printMessage("Exiting program...");
                    System.exit(0);
                default:
                    menuPage.printMessage("Invalid option.");
            }
        }
    }

    private void handleBooking(int roomNum, String name) {
        try {
            service.bookRoom(roomNum, name);
            menuPage.printMessage("Room " + roomNum + " booked successfully for " + name + ".");
        } catch (Exception e) {
            menuPage.printMessage(e.getMessage());
        }
    }

    private void handleCancel(int roomNum) {
        try {
            service.cancelBooking(roomNum);
            menuPage.printMessage("Booking for Room " + roomNum + " has been cancelled.");
        } catch (Exception e) {
            menuPage.printMessage(e.getMessage());
        }
    }

    private void handleSearch(int roomNum) {
        try {
            HotelRooms room = service.searchRoom(roomNum);
            menuPage.displayRoomDetails(room);
        } catch (NotFoundRoomsException e) {
            menuPage.printMessage(e.getMessage());
        }
    }
}
