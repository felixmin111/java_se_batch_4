package org.example.assigment.thiri.Day13.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DogView {

        public  JTextField idField;
        public  JTextField nameField;
        public  JTextField ageField;
        public  JTextField colorField;
        public  JTextField breedField;
        public  ButtonGroup buttonGroup;
        public JRadioButton option1;
        public JRadioButton option2;
        public JButton saveButton;
        public JButton updateButton;
        public JButton deleteButton;
        public JLabel resultField1;
        public JTable table;
        public DefaultTableModel tableModel;
        public JPanel panel;

        public DogView() {
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
            idField.setEnabled(false);

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

            JLabel colorLabel = new JLabel("Color");
            colorLabel.setBounds(70, 220, 120, 30);
            panel.add(colorLabel);

            colorField = new JTextField();
            colorField.setBounds(190, 220, 160, 30);
            panel.add(colorField);

            JLabel indoorLabel = new JLabel("Breed");
            indoorLabel.setBounds(70, 270, 120, 30);
            panel.add(indoorLabel);

            breedField = new JTextField();
            breedField.setBounds(190, 270, 160, 30);
            panel.add(breedField);

            JLabel furLengthLabel = new JLabel("Is trained?");
            furLengthLabel.setBounds(70, 320, 120, 30);
            panel.add(furLengthLabel);

            option1 = new JRadioButton("Yes");
            option1.setBounds(190, 320, 60, 30);

            panel.add(option1);
            option2 = new JRadioButton("No");
            option2.setBounds(250, 320, 60, 30);

            panel.add(option2);
            buttonGroup = new ButtonGroup();
            buttonGroup.add(option1);
            buttonGroup.add(option2);

            saveButton = new JButton("Save");
            saveButton.setBounds(450, 120, 100, 30);
            panel.add(saveButton);

            updateButton = new JButton("Update");
            updateButton.setBounds(450, 170, 100, 30);
            panel.add(updateButton);

            deleteButton = new JButton("Delete");
            deleteButton.setBounds(450, 220, 100, 30);
            panel.add(deleteButton);

            resultField1 = new JLabel();
            resultField1.setBounds(600, 120, 400, 50);
            panel.add(resultField1);

            tableModel = new DefaultTableModel(
                    new Object[]{"ID", "Name", "Age", "Color", "Breed", "Is trained?"}, 0
            );

            table = new JTable(tableModel);

            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setBounds(70, 370, 650, 200);
            panel.add(scrollPane);
        }
}
