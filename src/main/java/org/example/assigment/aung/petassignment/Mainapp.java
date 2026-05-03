package org.example.assigment.aung.petassignment;

import org.example.assigment.aung.petassignment.controller.MainController;
import org.example.assigment.aung.petassignment.view.MainView;

public class Mainapp {
    public static void main(String[] args) {
        MainView mainView = new MainView();
        new MainController(mainView);
        mainView.show();
    }
}
