package org.example.assigment.thiri.Day13.controller;

import org.example.assigment.thiri.Day13.model.Cat;
import org.example.assigment.thiri.Day13.model.Pet;
import org.example.assigment.thiri.Day13.service.CatService;
import org.example.assigment.thiri.Day13.validator.NullValidator;
import org.example.assigment.thiri.Day13.view.CatView;

import javax.swing.*;
import java.util.List;

public class CatController {
    private CatService catService;
    private CatView catView;

    public CatController(CatService catService, CatView catView) {
        this.catService = catService;
        this.catView = catView;
        loadCat();
        this.catView.saveButton.addActionListener(e -> {saveCat();});
        this.catView.updateButton.addActionListener(e ->   {updateCat();});
        this.catView.deleteButton.addActionListener(e -> {deleteCat();});
        this.catView.table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                fillFormFromSelectedRow();
            }
        });
    }

    private void loadCat() {
        catView.tableModel.setRowCount(0); //Clean Old data

        List<Cat>  cats = catService.getCats();
        for (Cat cat : cats) {
            catView.tableModel.addRow(new Object[]{
                    cat.getId(),
                    cat.getName(),
                    cat.getAge(),
                    cat.getColor(),
                    cat.isIndoor() ? "Yes" : "No",
                    cat.getLength()
            });
        }
    }

    private void saveCat() {
        try {
            System.out.println("Saving cat...");

            Integer id = this.catView.idField.getText().hashCode();
            String name = this.catView.nameField.getText();
            int age = Integer.parseInt(this.catView.ageField.getText());
            String color = this.catView.colorField.getText();
            String isIndoorStr = catView.option1.isSelected() ? "yes" : "no";

            String furLength = "";
            if (catView.shortF.isSelected()) furLength = "Short";
            else if (catView.mediumF.isSelected()) furLength = "Medium";
            else if (catView.longF.isSelected()) furLength = "Long";

            Cat cat = new Cat(id, name, age, color, Pet.PetType.CAT, isIndoorStr.equals("yes"), furLength);
            NullValidator.validate(cat);
            catService.saveCat(cat);
            loadCat();
            clearForm();

        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(catView.panel, e.getMessage());
        }
    }


    private void clearForm() {
        catView.idField.setText("");
        catView.nameField.setText("");
        catView.ageField.setText("");
        catView.colorField.setText("");
        catView.buttonGroup1.clearSelection();
        catView.buttonGroup2.clearSelection();
    }

    private void updateCat() {
        System.out.println("Updating cat...");

        String idText = this.catView.idField.getText();
        if (idText == null || idText.isEmpty()) {
            System.out.println("Error: ID is empty. Please select a cat from the table first.");
            return;
        }
        int id = Integer.parseInt(idText);
        String name = this.catView.nameField.getText();
        int age = Integer.parseInt(this.catView.ageField.getText());
        String color = this.catView.colorField.getText();
        String isIndoorStr = catView.option1.isSelected() ? "yes" : "no";

        String furLength = "";
        if (catView.shortF.isSelected()) furLength = "Short";
        else if (catView.mediumF.isSelected()) furLength = "Medium";
        else if (catView.longF.isSelected()) furLength = "Long";

        Cat cat  = new Cat(id, name, age, color, Pet.PetType.CAT, isIndoorStr.equals("yes"), furLength);
        catService.updateCat(cat);
        loadCat();
        clearForm();
    }

    private void deleteCat() {
        System.out.println("Deleting cat...");
        int id = Integer.parseInt(this.catView.idField.getText());
        catService.deleteCat(id);
        loadCat();
        clearForm();
    }

    private void fillFormFromSelectedRow() {

        int row = catView.table.getSelectedRow();

        // FIX: If no row is selected (row is -1), exit the method immediately
        if (row < 0) {
            return;
        }
        System.out.println("Filling form...");

        String id = catView.table.getValueAt(row, 0).toString();
        String name = catView.table.getValueAt(row, 1).toString();
        String age = catView.table.getValueAt(row, 2).toString();
        String color = catView.table.getValueAt(row, 3).toString();
        String isIndoor = catView.table.getValueAt(row, 4).toString();
        String length = catView.table.getValueAt(row, 5).toString();

        // Set text fields
        catView.idField.setText(id);
        catView.nameField.setText(name);
        catView.ageField.setText(age);
        catView.colorField.setText(color);

        // Handle Radio Buttons for Indoor status
        if (isIndoor.equalsIgnoreCase("Yes")) {
            catView.option1.setSelected(true);
        } else {
            catView.option2.setSelected(true);
        }

        // Handle Radio Buttons for Fur Length
        if (length.equals("Short")) catView.shortF.setSelected(true);
        else if (length.equals("Medium")) catView.mediumF.setSelected(true);
        else if (length.equals("Long")) catView.longF.setSelected(true);
    }

}
