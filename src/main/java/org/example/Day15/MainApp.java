package org.example.Day15;

import org.example.Day15.controller.MainController;
import org.example.Day15.view.MainView;

public class MainApp {
    public static void main(String[] args) {
        MainView frame = new MainView();
        new MainController(frame);
        frame.show();
    }
}
