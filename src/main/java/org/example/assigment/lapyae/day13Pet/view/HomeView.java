package org.example.assigment.lapyae.day13Pet.view;

import javax.swing.*;
import java.awt.*;

public class HomeView extends JPanel { // MUST extend JPanel
    public HomeView() {
        setLayout(new GridBagLayout());
        JLabel message = new JLabel(
                "<html><div style='text-align:center;'>"
                        + "Pet Store Management System <br><br>"
                        + "To manage the Pets.<br>"
                        + "Click Navigation on top left corner and select your process."
                        + "</div></html>",
                SwingConstants.CENTER);

        message.setFont(new Font("Arial", Font.PLAIN, 18));
        add(message);
    }
}
