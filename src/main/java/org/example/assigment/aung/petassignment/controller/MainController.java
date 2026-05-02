package org.example.assigment.aung.petassignment.controller;

import org.example.assigment.aung.petassignment.service.CatService;
import org.example.assigment.aung.petassignment.service.DogService;
import org.example.assigment.aung.petassignment.view.CatView;
import org.example.assigment.aung.petassignment.view.DogView;
import org.example.assigment.aung.petassignment.view.HomeView;
import org.example.assigment.aung.petassignment.view.MainView;

import java.awt.event.MouseAdapter;

public class MainController {
    private MainView mainFrame;

    public MainController(MainView mainFrame) {
        this.mainFrame = mainFrame;

        mainFrame.catMenuItem.addActionListener(e -> showCatPage());
        mainFrame.dogMenuItem.addActionListener(e -> showDogPage());
        mainFrame.homeMenu.addMouseListener(new HomeMenuActionListener());

        showHomePage();
    }

    private void showHomePage() {
        HomeView homeView = new HomeView();
        mainFrame.setView(homeView.panel);
    }

    private void showCatPage() {
        CatView catView = new CatView();
        CatService catService = new CatService();
        new CatController(catService, catView);
        mainFrame.setView(catView.panel);
    }

    private void showDogPage() {
        DogView dogView = new DogView();
        DogService dogService = new DogService();
        new DogController(dogService, dogView);
        mainFrame.setView(dogView.panel);
    }

    public class HomeMenuActionListener extends MouseAdapter {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            showHomePage();
        }

    }
}