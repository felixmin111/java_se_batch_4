package org.example.assigment.lapyae.hotelmanagement;

import org.example.assigment.lapyae.hotelmanagement.controller.MainControl;
import org.example.assigment.lapyae.hotelmanagement.exception.NotFoundRoomsException;
import org.example.assigment.lapyae.hotelmanagement.view.MenuPage;
public class HotelMainApp {
    public static void main(String[] args) {
        MenuPage menu = new MenuPage();
        menu.start();
    }
}
