package org.example.Day17;

import org.example.Day17.controller.MainController;
import org.example.Day17.view.MainView;

public class MainApp {
    public static void main(String[] args) {
        MainView frame = new MainView();
        new MainController(frame);
        frame.show();
    }
}
