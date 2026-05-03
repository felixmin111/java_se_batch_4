package org.example.assigment.aung.petassignment.view;

import javax.swing.*;
import java.awt.*;

public class MainView {
    public JFrame frame;
    public JMenuItem dogMenuItem;
    public JMenuItem catMenuItem;
    public JMenu homeMenu;

    public JPanel mainPanel;

    public MainView() {
        frame = new JFrame("Pet Store Management System");

        JMenuBar menuBar = new JMenuBar();
        homeMenu = new JMenu("Home");

        JMenu menu = new JMenu("Pet Menu");
        dogMenuItem = new JMenuItem("Dog");
        catMenuItem = new JMenuItem("Cat");
        menu.add(dogMenuItem);
        menu.add(catMenuItem);
        menuBar.add(homeMenu);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
        mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void setView(JPanel panal) {
        mainPanel.removeAll();
        mainPanel.add(panal, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
    }

    public void show() {
        frame.setVisible(true);
    }

}
