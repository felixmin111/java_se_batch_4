package org.example.assigment.thiri.Day13.controller;

import org.example.assigment.thiri.Day13.service.PetServiceImpl;
import org.example.assigment.thiri.Day13.view.Menu;


public class PetController {
    private Menu menu;
    private PetServiceImpl serviceImpl;

    public void start() {
        menu = new Menu();
        serviceImpl = new PetServiceImpl();
        boolean condition = true;

        while (condition) {
            int input1 = Menu.displayMenu();

            switch (input1) {
                case 1:
                    int input2 = Menu.displayType();
                    serviceImpl.input(input2);
                    break;
                case 2:
                    input2 = Menu.displayType();
                    serviceImpl.display(input2);
                    break;
                case 3:
                    condition = serviceImpl.exit();
                    break;
                default:
                    System.out.println("Invalid Option. Please Try Again!");
            }
        }
    }
}

