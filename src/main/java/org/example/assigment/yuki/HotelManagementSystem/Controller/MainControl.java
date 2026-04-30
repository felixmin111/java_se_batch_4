package org.example.assigment.yuki.HotelManagementSystem.Controller;
import org.example.assigment.yuki.HotelManagementSystem.Model.Room;
import org.example.assigment.yuki.HotelManagementSystem.Service.RoomServiceImpl;
import org.example.assigment.yuki.HotelManagementSystem.View.RoomView;

public class MainControl {
    private RoomView view;
    private RoomServiceImpl service;

    public MainControl(RoomView view, RoomServiceImpl service) {
        this.view = view;
        this.service = service;
    }

    public void start() {
        int choice;

        do {
            choice = view.showMenu();
            switch (choice) {
                case 1:
                    displayAllRooms();
                    break;
                case 2:
                    bookRoom();
                    break;
                case 3:
                    cancelBooking();
                    break;
                case 4:
                    searchRoom();
                    break;
                case 5:
                    countAvailableRooms();
                    break;
                case 6:
                    countBookedRooms();
                    break;
                case 7:
                    view.showMessage("Exiting...");
                    break;
            }
        }while (choice != 7);
    }

    public void displayAllRooms() {
        Room[] rooms = service.getAllRooms();
        view.displayAllRooms(rooms);
    }

    public void bookRoom() {
        int roomNumber = view.getRoomNumber();
        String guestName = view.getGuestName();

        try {
            service.bookRoom(roomNumber, guestName);
            view.showMessage("Room " + roomNumber + " booked successfully for " + guestName + ".");
        }catch (Exception e) {
            view.showMessage(e.getMessage());
        }
    }

    public void cancelBooking() {
        int roomNumber = view.getRoomNumber();
        try {
            service.cancelBooking(roomNumber);
            view.showMessage("Booking cancelled successfully.");
        } catch (Exception e) {
            view.showMessage(e.getMessage());
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
