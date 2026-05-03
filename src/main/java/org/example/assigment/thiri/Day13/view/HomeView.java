package org.example.assigment.thiri.Day13.view;

import javax.swing.*;
import java.awt.*;

public class HomeView {
    public JPanel panel;

    public HomeView() {
        panel = new JPanel(new BorderLayout());

        JLabel title = new JLabel("Home page", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));

        JLabel message = new JLabel(
                "<html><div style='text-align:center;'>"
                        + "You can manage Pets from the top menu.<br>"
                        + "Click Pet Management to choose Cat or Dog.<br>"
                        + "Then you can add, update, delete and view pets."
                        + "</div></html>",
                SwingConstants.CENTER);

        message.setFont(new Font("Arial", Font.PLAIN, 15));

        panel.add(title, BorderLayout.NORTH);
        panel.add(message, BorderLayout.CENTER);
    }
}
