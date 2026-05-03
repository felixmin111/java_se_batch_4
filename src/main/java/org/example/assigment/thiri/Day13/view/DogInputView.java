package org.example.assigment.thiri.Day13.view;

import javax.swing.*;

public class DogInputView {

        public static JTextField idField;
        public static JTextField nameField;
        public static JTextField ageField;
        public static JTextField breedField;
        public static ButtonGroup buttonGroup;
        public JRadioButton option1;
        public JRadioButton option2;
        public JButton saveButton;
        public JButton backButton;
        public JLabel resultField1;
        public JPanel panel;

        public DogInputView() {
            System.out.println("Dog Input View");
            panel = new JPanel();
            panel.setLayout(null);

            JLabel title = new JLabel("Dog Input Form", SwingConstants.CENTER);
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

            JLabel indoorLabel = new JLabel("Breed");
            indoorLabel.setBounds(70, 220, 120, 30);
            panel.add(indoorLabel);

            breedField = new JTextField();
            breedField.setBounds(190, 220, 160, 30);
            panel.add(breedField);

            JLabel furLengthLabel = new JLabel("Is trained?");
            furLengthLabel.setBounds(70, 270, 120, 30);
            panel.add(furLengthLabel);

            option1 = new JRadioButton("Yes");
            option1.setBounds(190, 270, 60, 30);

            panel.add(option1);
            option2 = new JRadioButton("No");
            option2.setBounds(250, 270, 60, 30);

            panel.add(option2);
            buttonGroup = new ButtonGroup();
            buttonGroup.add(option1);
            buttonGroup.add(option2);

            saveButton = new JButton("Save");
            saveButton.setBounds(190, 320, 100, 30);
            panel.add(saveButton);

            backButton = new JButton("Back");
            backButton.setBounds(350, 320, 100, 30);
            panel.add(backButton);

            resultField1 = new JLabel();
            resultField1.setBounds(30, 400, 400, 50);
            panel.add(resultField1);
        }
}
