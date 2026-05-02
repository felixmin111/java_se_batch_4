package org.example.assigment.aung.petassignment.view;

import javax.swing.*;
import java.awt.*;

public class HomeView {

    public JPanel panel;

    public HomeView() {
        panel = new JPanel(new BorderLayout());

        JLabel title = new JLabel("Welcome to Pet Store Management System", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));

        JLabel message = new JLabel(
                "<html><div style='text-align:center;'>"
                        + "You can manage Dogs and Cats.<br><br>"
                        + "Click Dog Management to add, update, delete and view dogs.<br>"
                        + "Click Cat Management to add, update, delete and view cats."
                        + "</div></html>",
                SwingConstants.CENTER);

        message.setFont(new Font("Arial", Font.PLAIN, 18));

        panel.add(title, BorderLayout.NORTH);
        panel.add(message, BorderLayout.CENTER);
    }

}
