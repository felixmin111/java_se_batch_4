package org.example.assigment.lapyae.day13Pet.view;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    public JMenuItem catMenuItem = new JMenuItem("Manage Cats");
    public JMenuItem dogMenuItem = new JMenuItem("Manage Dogs");
    public JMenuItem homeMenuItem = new JMenuItem("Home");
    private JPanel contentPanel = new JPanel(new BorderLayout());

    public MainView() {
        setTitle("Pet Management System");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Navigation");
        menu.add(homeMenuItem);
        menu.add(catMenuItem);
        menu.add(dogMenuItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        add(contentPanel);
    }

    public void setView(JPanel panel) {
        contentPanel.removeAll();
        contentPanel.add(panel, BorderLayout.CENTER);
        contentPanel.revalidate();
        contentPanel.repaint();
    }
}
