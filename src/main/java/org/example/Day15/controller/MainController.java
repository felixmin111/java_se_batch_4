package org.example.Day15.controller;

import org.example.Day15.service.ProductService;
import org.example.Day15.service.UserService;
import org.example.Day15.view.HomeView;
import org.example.Day15.view.MainView;
import org.example.Day15.view.ProductView;
import org.example.Day15.view.UserView;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;

public class MainController {
    private MainView mainFrame;
    public MainController(MainView mainFrame) {
        this.mainFrame = mainFrame;
        mainFrame.userMenuItem.addActionListener(e -> { showUserPage();});
        mainFrame.productMenuItem.addActionListener(e ->{ showProductPage();});
        mainFrame.homeMenu.addMouseListener(new HomeMenuActionListener());
    }
    public void showUserPage(){
        UserView userView = new UserView();
        UserService userService = new UserService();
        new UserController(userView,userService);
        mainFrame.setView(userView.panel);
    }

    public void showProductPage(){
        ProductView productView = new ProductView();
        ProductService productService = new ProductService();
        new ProductController(productService,productView);
        mainFrame.setView(productView.panel);
    }

    public void showHomePage(){
        System.out.println("Call Home Panal");
        HomeView homeView = new HomeView();
        mainFrame.setView(homeView.panel);
    }
    public class HomeMenuActionListener extends MouseAdapter {
        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {
            showHomePage();
        }

    }
}
