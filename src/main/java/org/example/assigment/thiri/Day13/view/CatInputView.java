package org.example.assigment.thiri.Day13.view;

import javax.swing.*;
import java.awt.*;

public  class  CatInputView {

    public static JTextField idField;
    public static JTextField nameField;
    public static JTextField ageField;

    public static ButtonGroup buttonGroup1;
    public static ButtonGroup buttonGroup2;

    public static JRadioButton option1;
    public static JRadioButton option2;

    public static JRadioButton longF;
    public static JRadioButton mediumF;
    public static JRadioButton shortF;


    public  JButton saveButton;
    public  JButton backButton;
    public static JLabel resultField;
    public JPanel panel;

    public CatInputView() {
        System.out.println("Cat Input View");
        panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Cat Input Form", SwingConstants.CENTER);
        title.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        title.setBounds(100, 20, 400, 50);
        panel.add(title);

        JLabel idLabel = new JLabel("ID");
        idLabel.setBounds(70, 70, 120, 30);
        panel.add(idLabel);

        idField = new JTextField();
        idField.setBounds(190, 70, 160, 30);
        panel.add(idField);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(70, 120, 120, 30);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(190, 120, 160, 30);
        panel.add(nameField);

        JLabel ageLabel = new JLabel("Age");
        ageLabel.setBounds(70, 170, 120, 30);
        panel.add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(190, 170, 160, 30);
        panel.add(ageField);

        JLabel indoorLabel = new JLabel("Indoor");
        indoorLabel.setBounds(70, 220, 120, 30);
        panel.add(indoorLabel);

        option1 = new JRadioButton("Yes");
        option1.setBounds(190, 220, 60, 30);
        panel.add(option1);

        option2 = new JRadioButton("No");
        option2.setBounds(250, 220, 60, 30);
        panel.add(option2);

        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(option1);
        buttonGroup1.add(option2);

        JLabel furLengthLabel = new JLabel("Fur Length");
        furLengthLabel.setBounds(70, 270, 120, 30);
        panel.add(furLengthLabel);

        longF = new JRadioButton("Long");
        longF.setBounds(190, 270, 70, 30);
        panel.add(longF);

        mediumF = new JRadioButton("Medium");
        mediumF.setBounds(250, 270, 100, 30);
        panel.add(mediumF);

        shortF = new JRadioButton("Short");
        shortF.setBounds(330, 270, 80, 30);
        panel.add(shortF);

        buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(longF);
        buttonGroup2.add(mediumF);
        buttonGroup2.add(shortF);

        saveButton = new JButton("Save");
        saveButton.setBounds(190, 320, 100, 30);
        panel.add(saveButton);

        backButton = new JButton("Back");
        backButton.setBounds(350, 320, 100, 30);
        panel.add(backButton);

        resultField = new JLabel();
        resultField.setBounds(30, 400, 400, 50);
        panel.add(resultField);

    }
}
