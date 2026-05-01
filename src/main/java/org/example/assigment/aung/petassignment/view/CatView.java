package org.example.assigment.aung.petassignment.view;
import javax.swing.*;

public class CatView {
    public JFrame frame;
    public JPanel panel;

    public JTextField idField;
    public JTextField nameField;
    public JTextField ageField;
    public JTextField colorField;
    public JCheckBox isIndoorBox;
    public JComboBox<String> furlengthBox;
    public JButton saveButton;

    public CatView() {
        frame = new JFrame("<<<Cat Data Registration>>>");
        panel = new JPanel();
        panel.setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(50, 50, 100, 30);
        panel.add(idLabel);

        idField = new JTextField(20);
        idField.setBounds(190, 50, 150, 30);
        panel.add(idField);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 100, 100, 30);
        panel.add(nameLabel);

        nameField = new JTextField(20);
        nameField.setBounds(190, 100, 150, 30);
        panel.add(nameField);

        JLabel ageLabel = new JLabel("Age:");
        ageLabel.setBounds(50, 150, 100, 30);
        panel.add(ageLabel);

        ageField = new JTextField(20);
        ageField.setBounds(190, 150, 150, 30);
        panel.add(ageField);

        JLabel colorLabel = new JLabel("Color:");
        colorLabel.setBounds(50, 200, 100, 30);
        panel.add(colorLabel);

        colorField = new JTextField(20);
        colorField.setBounds(190, 200, 150, 30);
        panel.add(colorField);

        JLabel indoorLabel = new JLabel("Is it an Indoor Cat?:");
        indoorLabel.setBounds(50, 250, 100, 30);
        panel.add(indoorLabel);

        isIndoorBox = new JCheckBox("Yes");
        isIndoorBox.setBounds(190, 250, 150, 30);
        panel.add(isIndoorBox);

        JLabel furLengthLabel = new JLabel("Fur Length:");
        furLengthLabel.setBounds(50, 300, 100, 30);
        panel.add(furLengthLabel);

        String[] Options = {"LONG", "MEDIUM", "SHORT"};
        furlengthBox = new JComboBox<>(Options);
        furlengthBox.setBounds(190, 300, 150, 30);
        panel.add(furlengthBox);

        saveButton = new JButton("Save");
        saveButton.setBounds(190, 350, 80, 30);
        panel.add(saveButton);

        frame.add(panel);
        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void show() {
        frame.setVisible(true);
    }

}
