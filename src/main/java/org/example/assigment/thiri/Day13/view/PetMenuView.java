package org.example.assigment.thiri.Day13.view;

import javax.swing.*;
import java.awt.*;

public class PetMenuView {
    public JPanel panel;
    public JRadioButton option1;
    public JRadioButton option2;
    public JRadioButton petType1;
    public JRadioButton petType2;
    public ButtonGroup buttonGroup1;
    public ButtonGroup buttonGroup2;
    public JButton button1;
    public JButton button2;


    public PetMenuView() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel label = new JLabel("Pet Management Menu");
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setBounds(100, 20, 400, 50);
        panel.add(label);


        JLabel optionLabel = new JLabel("Choose the Menu to manage Pet Data");
        optionLabel.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        optionLabel.setBounds(50, 100, 400, 30);
        panel.add(optionLabel);

        option1 = new JRadioButton("Input Pet Data");
        option1.setBounds(100, 150, 200, 30);

        option2 = new JRadioButton("Display Pet Data");
        option2.setBounds(100, 200, 400, 30);

        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(option1);
        buttonGroup1.add(option2);

        panel.add(option1);
        panel.add(option2);

        JLabel optionLabel1 = new JLabel("Choose Pet Type");
        optionLabel1.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 16));
        optionLabel1.setBounds(50, 250, 400, 30);
        panel.add(optionLabel1);

        petType1 = new JRadioButton("Cat");
        petType1.setBounds(100, 300, 200, 30);

        petType2 = new JRadioButton("Dog");
        petType2.setBounds(100, 350, 400, 30);

        buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(petType1);
        buttonGroup2.add(petType2);

        panel.add(petType1);
        panel.add(petType2);

        button1 = new JButton("Submit");
        button1.setBounds(100, 400, 100, 30);
        panel.add(button1);

        button2 = new JButton("Clear");
        button2.setBounds(200, 400, 100, 30);
        panel.add(button2);
    }


}
