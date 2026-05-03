package org.example.assigment.lapyae.day13Pet.controller;

import org.example.assigment.lapyae.day13Pet.service.CatService;
import org.example.assigment.lapyae.day13Pet.service.DogService;
import org.example.assigment.lapyae.day13Pet.view.*;

public class MainController {

    private final MainView mainFrame;
    private final DogService dogService = new DogService();
    private final CatService catService = new CatService();

    public MainController(MainView mainFrame) {
        this.mainFrame = mainFrame;

        mainFrame.homeMenuItem.addActionListener(e -> mainFrame.setView(new HomeView()));

        mainFrame.dogMenuItem.addActionListener(e -> {
            DogView dv = new DogView();
            new DogController(dv, dogService);
            mainFrame.setView(dv);
        });

        mainFrame.catMenuItem.addActionListener(e -> {
            CatView cv = new CatView();
            new CatController(cv, catService);
            mainFrame.setView(cv);
        });

        mainFrame.setView(new HomeView());
    }
}
