package org.example.assigment.yuki.PetInformationFileSystem.View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DogView {

    public JPanel panel;

    public JTextField idField, nameField, ageField, colorField, breedField;
    public JButton saveButton;
    public JButton updateButton;
    public JButton deleteButton;

    public JTable table;
    public DefaultTableModel tableModel;

    public DogView(){
        panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Dog Management", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setBounds(50, 20, 650, 40);
        panel.add(title);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(70, 100, 100, 30);
        panel.add(idLabel);
        idField = new JTextField();
        idField.setBounds(150,100,150,30);
        panel.add(idField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(70, 140, 100, 30);
        panel.add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(150,140,150,30);
        panel.add(nameField);


        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(70, 180, 100, 30);
        panel.add(ageLabel);
        ageField = new JTextField();
        ageField.setBounds(150,180,150,30);
        panel.add(ageField);

        JLabel colorLabel = new JLabel("Color:");
        colorLabel.setBounds(70, 220, 100, 30);
        panel.add(colorLabel);
        colorField = new JTextField();
        colorField.setBounds(150,220,150,30);
        panel.add(colorField);


        JLabel breedLabel = new JLabel("Dog's Breed:");
        breedLabel.setBounds(70, 260, 100, 30);
        panel.add(breedLabel);
        breedField = new JTextField();
        breedField.setBounds(150,260,150,30);
        panel.add(breedField);

        saveButton = new JButton("Save");
        saveButton.setBounds(360,180,100,30);
        panel.add(saveButton);

        updateButton = new JButton("Update");
        updateButton.setBounds(360, 220, 110, 30);
        panel.add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(360, 260, 110, 30);
        panel.add(deleteButton);

        tableModel = new DefaultTableModel(
                new Object[]{"ID","Name","Age","Color","Fur"},0);

        table = new JTable(tableModel);

        JScrollPane sp = new JScrollPane(table);
        sp.setBounds(50,320,600,200);
        panel.add(sp);
    }
}
