package org.example.Day20.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ProductView {

    public JPanel panel;

    public JTextField idField;
    public JTextField nameField;
    public JTextField priceField;
    public JTextField quantityField;

    // NEW
    public JComboBox<String> categoryComboBox;
    public JTextField searchField;

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

        // =======================
        // FORM
        // =======================

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(70, 90, 120, 30);
        panel.add(idLabel);

        idField = new JTextField();
        idField.setBounds(190, 90, 160, 30);
        idField.setEnabled(false);
        panel.add(idField);

        // CATEGORY
        JLabel categoryLabel = new JLabel("Category:");
        categoryLabel.setBounds(70, 130, 120, 30);
        panel.add(categoryLabel);

        categoryComboBox = new JComboBox<>();
        categoryComboBox.setBounds(190, 130, 160, 30);

//        // Sample Categories
//        categoryComboBox.addItem("Food");
//        categoryComboBox.addItem("Drink");
//        categoryComboBox.addItem("Electronic");
//        categoryComboBox.addItem("Clothes");
//        categoryComboBox.addItem("Stationery");

        panel.add(categoryComboBox);

        JLabel nameLabel = new JLabel("Product Name:");
        nameLabel.setBounds(70, 170, 120, 30);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(190, 170, 160, 30);
        panel.add(nameField);

        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setBounds(70, 210, 120, 30);
        panel.add(priceLabel);

        priceField = new JTextField();
        priceField.setBounds(190, 210, 160, 30);
        panel.add(priceField);

        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setBounds(70, 250, 120, 30);
        panel.add(quantityLabel);

        quantityField = new JTextField();
        quantityField.setBounds(190, 250, 160, 30);
        panel.add(quantityField);

        // =======================
        // BUTTONS
        // =======================

        saveButton = new JButton("Save");
        saveButton.setBounds(420, 170, 110, 30);
        panel.add(saveButton);

        updateButton = new JButton("Update");
        updateButton.setBounds(420, 210, 110, 30);
        panel.add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(420, 250, 110, 30);
        panel.add(deleteButton);

        // =======================
        // SEARCH BOX
        // =======================

        JLabel searchLabel = new JLabel("Search:");
        searchLabel.setBounds(500, 320, 60, 30);
        panel.add(searchLabel);

        searchField = new JTextField();
        searchField.setBounds(560, 320, 160, 30);
        panel.add(searchField);

        // =======================
        // TABLE
        // =======================

        tableModel = new DefaultTableModel(
                new Object[]{"ID", "Category", "Name", "Price", "Quantity"}, 0
        );

        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(70, 360, 650, 220);
        panel.add(scrollPane);
    }
}