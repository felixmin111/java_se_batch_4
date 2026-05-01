package org.example.Day15.view;

import javax.swing.*;
import java.awt.*;

public class HomeView {
    public JPanel panel;

    public HomeView() {
        panel = new JPanel(new BorderLayout());

        JLabel title = new JLabel("Welcome to CRUD Management System", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));

        JLabel message = new JLabel(
                "<html><div style='text-align:center;'>"
                        + "You can manage Users and Products from the top menu.<br><br>"
                        + "Click User Management to add, update, delete and view users.<br>"
                        + "Click Product Management to manage product data."
                        + "</div></html>",
                SwingConstants.CENTER
        );

        message.setFont(new Font("Arial", Font.PLAIN, 18));

        panel.add(title, BorderLayout.NORTH);
        panel.add(message, BorderLayout.CENTER);
    }

}

