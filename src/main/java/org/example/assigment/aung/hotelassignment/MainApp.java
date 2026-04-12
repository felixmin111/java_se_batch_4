package org.example.assigment.aung.hotelassignment;

import org.example.assigment.aung.hotelassignment.controller.MainController;
import org.example.assigment.aung.hotelassignment.exception.RoomNotFoundException;

public class MainApp {
    public static void main(String[] args) throws RoomNotFoundException {
        MainController controller = new MainController();
        controller.start();

    }
}
