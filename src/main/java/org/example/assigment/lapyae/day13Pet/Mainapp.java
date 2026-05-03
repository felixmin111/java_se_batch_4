package org.example.assigment.lapyae.day13Pet;

import org.example.assigment.lapyae.day13Pet.controller.MainController;
import org.example.assigment.lapyae.day13Pet.view.MainView;

public class Mainapp {
    public static void main(String[] args) {
        MainView mainView = new MainView();
        new MainController(mainView);
        mainView.setVisible(true);
    }
}

