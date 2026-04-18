package org.example.assigment.thiri.UpdateHotelBookingSystem.controller;


import org.example.assigment.thiri.UpdateHotelBookingSystem.service.HotelServiceImpl;
import org.example.assigment.thiri.UpdateHotelBookingSystem.view.Menu;
import static org.example.assigment.thiri.UpdateHotelBookingSystem.view.Menu.getCusName;
import static org.example.assigment.thiri.UpdateHotelBookingSystem.view.Menu.getRoomNum;

public class HotelController {
    Menu menu;
    HotelServiceImpl serviceImpl;

    public void start() {

        int choice;
        menu = new Menu();
        serviceImpl = new HotelServiceImpl();
        do {
            choice = Menu.displayFunction();
            int roomNumInput;
            String cusNameInput;
            switch (choice) {
                case 1:
                    serviceImpl.displayAllRooms();
                    break;
                case 2:
                    roomNumInput = getRoomNum() ;
                    cusNameInput = getCusName();
                    serviceImpl.bookRoom(roomNumInput, cusNameInput);
                    break;
                case 3:
                    roomNumInput = getRoomNum() ;
                    serviceImpl.cancelBooking(roomNumInput);
                    break;
                case 4:
                    roomNumInput = getRoomNum();
                    serviceImpl.searchRoom(roomNumInput);
                    break;
                case 5:
                    serviceImpl.getAvailableRoomCount();
                    break;
                case 6:
                    serviceImpl.getBookedRoomCount();
                    break;
                case 7:
                    serviceImpl.exit();
                    break;
                default:
                    System.out.println("\n==> Invalid Input. Try Again!");
                    break;
            }

        } while (choice != 7);
    }
}
