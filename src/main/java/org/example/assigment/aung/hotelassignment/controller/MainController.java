package org.example.assigment.aung.hotelassignment.controller;

import org.example.assigment.aung.hotelassignment.exception.RoomAlreadyBookedException;
import org.example.assigment.aung.hotelassignment.exception.RoomNotBookedException;
import org.example.assigment.aung.hotelassignment.exception.RoomNotFoundException;
import org.example.assigment.aung.hotelassignment.model.Room;
import org.example.assigment.aung.hotelassignment.service.RoomService;
import org.example.assigment.aung.hotelassignment.service.RoomServiceImpl;
import org.example.assigment.aung.hotelassignment.view.MainMenu;

public class MainController {
    private MainMenu mainMenu;
    private RoomService roomService;

    public void start()  {

        mainMenu = new MainMenu();
        roomService = new RoomServiceImpl();

        while(true){
            int choice = mainMenu.displayMenu();
            switch (choice){
                case 1:
                    roomService.displayAllRooms();
                    break;

                case 2:
                    int roomNumberBooking = mainMenu.inputRoomNumber();
                    String name = mainMenu.inputGuestName();
                    try {
                        roomService.bookRoom(roomNumberBooking, name);
                    } catch (RoomAlreadyBookedException|RoomNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    int roomNumberCancel = mainMenu.inputRoomNumber();
                    try {
                        roomService.cancelBooking(roomNumberCancel);
                    } catch (RoomNotBookedException|RoomNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    int roomNumberSearch = mainMenu.inputRoomNumber();
                    try {
                        roomService.searchRoom(roomNumberSearch);
                    } catch (RoomNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 5:
                    int available = roomService.getAvailableRoomCount();
                    System.out.println("Available Rooms: " + available);
                    break;

                case 6:
                    int booked = roomService.getBookedRoomCount();
                    System.out.println("Booked Rooms: " + booked);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    return;
            }
        }
    }
}

