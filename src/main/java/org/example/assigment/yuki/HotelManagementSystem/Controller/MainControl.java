package org.example.assigment.yuki.HotelManagementSystem.Controller;
import org.example.assigment.yuki.HotelManagementSystem.Model.Room;
import org.example.assigment.yuki.HotelManagementSystem.Service.RoomService;
import org.example.assigment.yuki.HotelManagementSystem.View.RoomView;

public class MainControl {
    private RoomView view;
    private RoomService service;

    public MainControl(RoomView view, RoomService service) {
        this.view = view;
        this.service = service;
    }

    public void start() {
        int choice;

        do {
            choice = view.showMenu();

            if (choice == 1) {
                displayAllRooms();
            } else if (choice == 2) {
                searchRoom();
            } else if (choice == 3) {
                bookRoom();
            } else if (choice == 4) {
                cancelBooking();
            } else if (choice == 5) {
                view.showMessage("Exiting program...");
            } else {
                view.showMessage("Invalid choice.");
            }

        } while (choice != 5);
    }

    public void displayAllRooms() {
        Room[] rooms = service.getAllRooms();
        view.displayAllRooms(rooms);
    }

    public void bookRoom() {
        int roomNumber = view.getRoomNumber();
        String guestName = view.getGuestName();

        Room room = service.findRoomByNumber(roomNumber);

        if (room == null) {
            view.showMessage("Room not found.");
            return;
        }

        if (room.isBooked()) {
            view.showMessage("Room " + roomNumber + " is already booked.");
            return;
        }

        boolean booked = service.bookRoom(roomNumber, guestName);

        if (booked) {
            view.showMessage("Room " + roomNumber + " booked successfully for " + guestName + ".");
        } else {
            view.showMessage("Booking failed.");
        }
    }

    public void cancelBooking() {
        int roomNumber = view.getRoomNumber();
        int result = service.cancelBooking(roomNumber);

        if (result == -1) {
            view.showMessage("There is no room called " + roomNumber);
        } else if (result == 0) {
            view.showMessage("Room " + roomNumber + " is not currently booked.");
        } else {
            view.showMessage("Booking for Room " + roomNumber + " has been cancelled.");
        }
    }

    public void searchRoom() {
        int roomNumber = view.getRoomNumber();
        Room room = service.findRoomByNumber(roomNumber);
        view.displayRoom(room);
    }

    public void countAvailableRooms() {
        int count = service.countAvailableRooms();
        view.displayAvailableRoomsCount(count);
    }

    public void countBookedRooms() {
        int count = service.countBookedRooms();
        view.displayBookedRoomsCount(count);
    }

}
