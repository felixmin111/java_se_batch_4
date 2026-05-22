package org.example.assigment.yuki.StudentRegistrationSystem.View;

import javax.swing.*;

public class StudentView extends JFrame {

    public JPanel panel;

    public JTextField idField;
    public JTextField nameField;
    public JTextField majorField;

    public JButton saveButton;
    public JButton displayButton;

    public JTextArea displayArea;

    public StudentView() {

        setTitle("Student Registration System");
        setSize(650, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(70, 90, 100, 30);
        panel.add(idLabel);

        idField = new JTextField();
        idField.setBounds(170, 90, 200, 30);
        panel.add(idField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(70, 140, 100, 30);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(170, 140, 200, 30);
        panel.add(nameField);

        JLabel majorLabel = new JLabel("Major:");
        majorLabel.setBounds(70, 190, 100, 30);
        panel.add(majorLabel);

        majorField = new JTextField();
        majorField.setBounds(170, 190, 200, 30);
        panel.add(majorField);

        saveButton = new JButton("Save");
        saveButton.setBounds(420, 120, 120, 35);
        panel.add(saveButton);

        displayButton = new JButton("Display");
        displayButton.setBounds(420, 180, 120, 35);
        panel.add(displayButton);

        displayArea = new JTextArea();

        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBounds(70, 270, 470, 200);

        panel.add(scrollPane);

        add(panel);

        setVisible(true);
    }
}