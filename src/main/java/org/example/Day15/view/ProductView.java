package org.example.Day15.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ProductView {
    public JPanel panel;

    public JTextField idField;
    public JTextField nameField;
    public JTextField priceField;
    public JTextField quantityField;

    public JButton saveButton;
    public JButton updateButton;
    public JButton deleteButton;

    public JTable table;
    public DefaultTableModel tableModel;

    public ProductView() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Product Management", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        title.setBounds(50, 20, 650, 40);
        panel.add(title);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(70, 90, 120, 30);
        panel.add(idLabel);

        idField = new JTextField();
        idField.setBounds(190, 90, 160, 30);
        panel.add(idField);

        JLabel nameLabel = new JLabel("Product Name:");
        nameLabel.setBounds(70, 130, 120, 30);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(190, 130, 160, 30);
        panel.add(nameField);

        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setBounds(70, 170, 120, 30);
        panel.add(priceLabel);

        priceField = new JTextField();
        priceField.setBounds(190, 170, 160, 30);
        panel.add(priceField);

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setBounds(70, 210, 120, 30);
        panel.add(quantityLabel);

        quantityField = new JTextField();
        quantityField.setBounds(190, 210, 160, 30);
        panel.add(quantityField);

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
                new Object[]{"ID", "Name", "Price", "Quantity"}, 0
        );

        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(70, 290, 650, 220);
        panel.add(scrollPane);
    }
}