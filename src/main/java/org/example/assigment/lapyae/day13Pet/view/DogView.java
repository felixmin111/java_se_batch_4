package org.example.assigment.lapyae.day13Pet.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DogView extends JPanel {
    public JTextField idField = new JTextField(10);
    public JTextField nameField = new JTextField(10);
    public JTextField ageField = new JTextField(5);
    public JTextField breedField = new JTextField(10);
    public JCheckBox trainedBox = new JCheckBox("Trained");

    public JButton saveBtn = new JButton("Save");
    public JButton deleteBtn = new JButton("Delete");

    public DefaultTableModel tableModel;
    public JTable table;

    public DogView() {
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        inputPanel.add(new JLabel("ID:")); inputPanel.add(idField);
        inputPanel.add(new JLabel("Name:")); inputPanel.add(nameField);
        inputPanel.add(new JLabel("Age:")); inputPanel.add(ageField);
        inputPanel.add(new JLabel("Breed:")); inputPanel.add(breedField);
        inputPanel.add(new JLabel("Status:")); inputPanel.add(trainedBox);
        inputPanel.add(saveBtn); inputPanel.add(deleteBtn);

        tableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Age", "Breed", "Trained"}, 0);
        table = new JTable(tableModel);

        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}
