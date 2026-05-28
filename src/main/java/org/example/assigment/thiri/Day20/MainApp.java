package org.example.assigment.thiri.Day20;

import org.example.assigment.thiri.Day20.controller.MainController;
import org.example.assigment.thiri.Day20.view.MainView;

public class MainApp {
    public static void main(String[] args) {
        MainView frame = new MainView();
        new MainController(frame);
        frame.show();
    }
}
