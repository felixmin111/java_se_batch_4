package org.example.assigment.thiri.Day13.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class CatDisplayView {
    public JPanel panel;
    public JTable table;
    public static DefaultTableModel model;
    public JScrollPane scrollPane;
    public JButton deleteButton;
    public JButton backButton;


    public CatDisplayView() {
        panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Cat Information in the System", SwingConstants.CENTER);
        title.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 24));
        title.setBounds(100, 20, 400, 50);
        panel.add(title);

        model = new DefaultTableModel(
                new Object[]{"ID", "Name", "Age", "Indoor", "Fur length"},
                0
        );

        table = new JTable(model);

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(100, 100, 400, 220);
        panel.add(scrollPane);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(100, 350, 100, 30);
        panel.add(deleteButton);

        backButton = new JButton("Back");
        backButton.setBounds(300, 350, 100, 30);
        panel.add(backButton);
    }
}
