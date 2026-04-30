package org.example.assigment.lapyae.day13Pet.controller;
import org.example.assigment.lapyae.day13Pet.service.Petservice;
import org.example.assigment.lapyae.day13Pet.view.Mainmenu;

public class MainController {
    private Mainmenu view = new Mainmenu();
    private Petservice service = new Petservice();

    public void start() {
        while (true) {
            int choice = view.displayMainMenu();
            if (choice == 1) handleInput();
            else if (choice == 2) handleDisplay();
            else if (choice == 3) break;
        }
    }

    private void handleInput() {
        int type = view.petTypeMenu();
        if (type == 1) service.addCat(view.getCatInput());
        else if (type == 2) service.addDog(view.getDogInput());
    }

    private void handleDisplay() {

        view.displayPets(service.getCats(), service.getDogs());
    }
}
