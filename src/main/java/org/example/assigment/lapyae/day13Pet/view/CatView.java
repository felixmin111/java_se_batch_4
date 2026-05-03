package org.example.assigment.lapyae.day13Pet.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CatView extends JPanel {
    public JTextField idField = new JTextField(10), nameField = new JTextField(10),
            ageField = new JTextField(5), colorField = new JTextField(10);
    public JCheckBox indoorBox = new JCheckBox("Indoor");
    public JComboBox<String> furBox = new JComboBox<>(new String[]{"SHORT", "MEDIUM", "LONG"});

    public JButton saveBtn = new JButton("Save"), updateBtn = new JButton("Update"), deleteBtn = new JButton("Delete");
    public DefaultTableModel tableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Age", "Indoor", "Fur"}, 0);
    public JTable table = new JTable(tableModel);

    public CatView() {
        setLayout(new BorderLayout());
        JPanel form = new JPanel(new GridLayout(7, 2, 5, 5));
        form.add(new JLabel("ID:")); form.add(idField);
        form.add(new JLabel("Name:")); form.add(nameField);
        form.add(new JLabel("Age:")); form.add(ageField);
        form.add(new JLabel("Color:")); form.add(colorField);
        form.add(new JLabel("Options:")); form.add(indoorBox);
        form.add(new JLabel("Fur:")); form.add(furBox);
        form.add(saveBtn); form.add(deleteBtn);

        add(form, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
    }
}
