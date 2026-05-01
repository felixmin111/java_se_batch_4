package org.example.Day15.view;

import javax.swing.*;
import java.awt.*;

public class MainView {
    public JFrame frame;
    public JMenuItem userMenuItem;
    public JMenuItem productMenuItem;
    public JMenu homeMenu;

    public JPanel mainPanel;
    public MainView() {
        frame = new JFrame("Management System For Mini Store");

        JMenuBar menuBar = new JMenuBar();
        homeMenu = new JMenu("Home");

        JMenu menu = new JMenu("Management Menu");
        userMenuItem = new JMenuItem("User");
        productMenuItem = new JMenuItem("Product");
        menu.add(userMenuItem);
        menu.add(productMenuItem);
        menuBar.add(homeMenu);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void setView(JPanel panal){
        mainPanel.removeAll();
        mainPanel.add(panal, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
    }
    public void show(){
        frame.setVisible(true);
    }

}
