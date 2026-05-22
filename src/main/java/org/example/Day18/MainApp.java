package org.example.Day18;

import org.example.Day18.controller.MainController;
import org.example.Day18.view.MainView;

public class MainApp {
    public static void main(String[] args) {
        MainView frame = new MainView();
        new MainController(frame);
        frame.show();
    }
}
