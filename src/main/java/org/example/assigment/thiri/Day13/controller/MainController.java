package org.example.assigment.thiri.Day13.controller;

import org.example.Day17.controller.ProductController;
import org.example.Day17.service.ProductService;
import org.example.assigment.thiri.Day13.service.CatService;
import org.example.assigment.thiri.Day13.service.DogService;
import org.example.assigment.thiri.Day13.view.CatView;
import org.example.assigment.thiri.Day13.view.DogView;
import org.example.assigment.thiri.Day13.view.HomeView;
import org.example.assigment.thiri.Day13.view.MainView;

import java.awt.event.MouseAdapter;

public class MainController {
    public MainView mainView;
    public MainController(MainView mainView) {
        this.mainView = mainView;
        System.out.println("Call Main Controller");
        mainView.homeMenu.addMouseListener(new HomeMenuActionListener());
        mainView.catMenuItem.addActionListener(e -> { showCatPage(); });
        mainView.dogMenuItem.addActionListener(e -> { showDogPage(); });
    }

    public class HomeMenuActionListener extends MouseAdapter {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            showHomePage();
        }
    }

   public void showHomePage() {
        HomeView homeView = new HomeView();
        MainView.setView(homeView.panel);
    }

    public void showCatPage() {
        CatView catView = new CatView();
        CatService catService = new CatService();
        new CatController(catService,catView);
        mainView.setView(catView.panel);
    }

    public void showDogPage() {
        DogView dogView = new DogView();
        DogService dogService = new DogService();
        new DogController(dogService,dogView);
        mainView.setView(dogView.panel);
    }

}
