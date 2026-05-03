package org.example.assigment.thiri.Day13.view;

import javax.swing.*;
import java.awt.*;

public class MainView {

    public JFrame frame;
    public static JPanel mainPanel;
    public JMenuBar menuBar;
    public JMenu homeMenu;
    public JMenu menu;
    public JLabel titleLabel;

    public MainView() {

        frame = new JFrame("Pet Management System");
        menuBar = new JMenuBar();

        homeMenu = new JMenu("Home");
        menu = new JMenu("Pet Management Menu");
        menuBar.add(homeMenu);
        menuBar.add(menu);

        titleLabel = new JLabel("Welcome to Pet Management System");
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        frame.setJMenuBar(menuBar);
        mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(titleLabel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void show() {
        frame.setVisible(true);
    }

    public static void setView(JPanel panel){
        mainPanel.removeAll();
        mainPanel.add(panel, BorderLayout.CENTER);
        mainPanel.revalidate();
        mainPanel.repaint();
    }
}
