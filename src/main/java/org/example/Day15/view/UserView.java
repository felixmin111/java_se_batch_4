package org.example.Day15.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class UserView {
    public JPanel panel;

    public JTextField idField;
    public JTextField nameField;
    public JTextField ageField;
    public JTextField phoneField;
    public JTextField addressField;

    public JButton saveButton;
    public JButton updateButton;
    public JButton deleteButton;

    public JTable table;
    public DefaultTableModel tableModel;

    public UserView() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("User Management", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setBounds(50, 20, 650, 40);
        panel.add(title);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(70, 90, 100, 30);
        panel.add(idLabel);

        idField = new JTextField();
        idField.setBounds(190, 90, 160, 30);
        idField.setEditable(false);
        panel.add(idField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(70, 130, 100, 30);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(190, 130, 160, 30);
        panel.add(nameField);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(70, 170, 100, 30);
        panel.add(ageLabel);

        ageField = new JTextField();
        ageField.setBounds(190, 170, 160, 30);
        panel.add(ageField);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(70, 210, 100, 30);
        panel.add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(190, 210, 160, 30);
        panel.add(phoneField);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(70, 250, 100, 30);
        panel.add(addressLabel);

        addressField = new JTextField();
        addressField.setBounds(190, 250, 160, 30);
        panel.add(addressField);

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
                new Object[]{"ID", "Name", "Age", "Address", "Phone"}, 0
        );

        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(70, 320, 650, 200);
        panel.add(scrollPane);
    }
}