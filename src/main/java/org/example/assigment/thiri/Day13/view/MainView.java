package org.example.assigment.thiri.Day13.view;

import javax.swing.*;
import java.awt.*;

public class MainView {
    public JFrame frame;
    public JMenuItem catMenuItem;
    public JMenuItem dogMenuItem;
    public JMenu homeMenu;

    public  static JPanel majorPanel;
    public MainView() {
        frame = new JFrame("Pet Management System");

        JMenuBar menuBar = new JMenuBar();
        homeMenu = new JMenu("Home");

        JMenu menu = new JMenu("Pet Management Menu");

        catMenuItem = new JMenuItem("Cat");
        dogMenuItem = new JMenuItem("Dog");
        menu.add(catMenuItem);
        menu.add(dogMenuItem);
        menuBar.add(homeMenu);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        majorPanel = new JPanel(new BorderLayout());
        frame.add(majorPanel);
        frame.setSize(800, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void setView(JPanel panel){
        majorPanel.removeAll();
        majorPanel.add(panel, BorderLayout.CENTER);
        majorPanel.revalidate();
        majorPanel.repaint();
    }

    public void show() {
        frame.setVisible(true);
    }
}
