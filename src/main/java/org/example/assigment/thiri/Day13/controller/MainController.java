package org.example.assigment.thiri.Day13.controller;

import org.example.assigment.thiri.Day13.view.HomeView;
import org.example.assigment.thiri.Day13.view.MainView;
import org.example.assigment.thiri.Day13.view.PetMenuView;
import org.example.assigment.yuki.PetInformationFileSystem.Service.PetService;

import java.awt.event.MouseAdapter;

public class MainController {

    public MainView mainView;

    public MainController(MainView mainView) {
        this.mainView = mainView;
        System.out.println("Call Main Controller");
        mainView.homeMenu.addMouseListener(new HomeMenuActionListener());
        mainView.menu.addMouseListener(new PetMenuActionListener());
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

    public class PetMenuActionListener extends MouseAdapter {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            showPetMenuPage();
        }
    }

    public void showPetMenuPage() {
        PetMenuView menu = new PetMenuView();
        new PetMenuController( menu);
        MainView.setView(menu.panel);
    }

}
