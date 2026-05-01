package org.example.Day15;

import javax.swing.*;

public class UserView {
    public JFrame frame;
    public JPanel panel;

    public JLabel name;
    public JTextField nameField;

    public JLabel ageLabel;
    public JTextField ageField;

    public JLabel phoneLabel;
    public JTextField phoneField;

    public JLabel addressLabel;
    public JTextField addressField;

    public JButton savebutton;

    public UserView() {
        frame = new JFrame("Layout and Panel Example");

        panel = new JPanel();
        panel.setLayout(null);
        JLabel nameLabel=new JLabel("Enter Name: ");
        nameLabel.setBounds(50, 50, 100, 30);
        panel.add(nameLabel);

        nameField=new JTextField(20);
        nameField.setBounds(190, 50, 100, 30);
        panel.add(nameField);


        ageLabel=new JLabel("Enter Age: ");
        ageLabel.setBounds(50, 100, 80, 30);
        panel.add(ageLabel);

        ageField=new JTextField(20);
        ageField.setBounds(190, 100, 80, 30);
        panel.add(ageField);

        phoneLabel=new JLabel("Enter Phone: ");
        phoneLabel.setBounds(50, 150, 150, 30);
        panel.add(phoneLabel);

        phoneField=new JTextField(20);
        phoneField.setBounds(190, 150, 150, 30);
        panel.add(phoneField);

        addressLabel=new JLabel("Enter Address: ");
        addressLabel.setBounds(50, 200, 150, 30);
        panel.add(addressLabel);

        addressField=new JTextField(20);
        addressField.setBounds(190, 200, 150, 30);
        panel.add(addressField);

        savebutton = new JButton("Save");
        savebutton.setBounds(190, 250, 80, 30);
        panel.add(savebutton);

        frame.add(panel);

        frame.setSize(500,600);
    }
    public void show(){
        frame.setVisible(true);
    }
}
