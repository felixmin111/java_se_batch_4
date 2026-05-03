package org.example.assigment.aung.petassignment.view;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

public class DogView {
    public JPanel panel;

    public JTextField idField;
    public JTextField nameField;
    public JTextField ageField;
    public JTextField colorField;
    public JTextField breedField;
    public JCheckBox isTrainedBox;

    public JButton saveButton;
    public JButton updateButton;
    public JButton deleteButton;

    public JTable table;
    public DefaultTableModel tableModel;

    public DogView() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("<<<Dog Data Registration>>>", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setBounds(50, 20, 650, 40);
        panel.add(title);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(70, 90, 120, 30);
        panel.add(idLabel);

        idField = new JTextField();
        idField.setBounds(190, 90, 160, 30);
        panel.add(idField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(70, 130, 120, 30);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(190, 130, 160, 30);
        panel.add(nameField);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(70, 170, 120, 30);
        panel.add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(190, 170, 160, 30);
        panel.add(ageField);

        JLabel colorLabel = new JLabel("Color:");
        colorLabel.setBounds(70, 210, 120, 30);
        panel.add(colorLabel);

        colorField = new JTextField();
        colorField.setBounds(190, 210, 160, 30);
        panel.add(colorField);

        JLabel breedLabel = new JLabel("Breed:");
        breedLabel.setBounds(70, 250, 120, 30);
        panel.add(breedLabel);

        breedField = new JTextField();
        breedField.setBounds(190, 250, 160, 30);
        panel.add(breedField);

        JLabel trainedLabel = new JLabel("Is it Trained?:  ");
        trainedLabel.setBounds(70, 290, 120, 30);
        panel.add(trainedLabel);

        isTrainedBox = new JCheckBox("Yes");
        isTrainedBox.setBounds(190, 290, 160, 30);
        panel.add(isTrainedBox);

        saveButton = new JButton("Save");
        saveButton.setBounds(420, 130, 110, 30);
        panel.add(saveButton);

        updateButton = new JButton("Update");
        updateButton.setBounds(420, 170, 110, 30);
        panel.add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(420, 210, 110, 30);
        panel.add(deleteButton);

        tableModel = new DefaultTableModel(
                new Object[] { "ID", "Name", "Age", "Color", "Breed", "Is Trained" }, 0);

        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(70, 350, 650, 220);
        panel.add(scrollPane);
    }

}
