package org.example.assigment.thiri.Day13;

import org.example.assigment.thiri.Day13.controller.MainController;
import org.example.assigment.thiri.Day13.view.MainView;

public class MainApp {
    public static void main(String[] args) {
        MainView mainView = new MainView();
        new MainController(mainView);
        mainView.show();
    }
}
