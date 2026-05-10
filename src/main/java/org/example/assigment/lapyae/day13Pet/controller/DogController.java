package org.example.assigment.lapyae.day13Pet.controller;

import org.example.assigment.lapyae.day13Pet.model.Dog;
import org.example.assigment.lapyae.day13Pet.model.Pet;
import org.example.assigment.lapyae.day13Pet.service.DogService;
import org.example.assigment.lapyae.day13Pet.view.DogView;

public class DogController {
    private DogView view;
    private DogService service;

    public DogController(DogView view, DogService service) {
        this.view = view;
        this.service = service;
        this.view.saveBtn.addActionListener(e -> handleSave());
        refreshTable();
        this.view.deleteBtn.addActionListener(e -> {
            // Get the row the user clicked on
            int selectedRow = view.table.getSelectedRow();

            if (selectedRow != -1) { // -1 means no row is selected
                // Grab the ID from the first column (index 0)
                String id = view.tableModel.getValueAt(selectedRow, 0).toString();

                // Tell the service to delete it from the DB
                service.delete(id);

                // Refresh the table so it disappears from the screen
                refreshTable();
            } else {
                // Warn the user if they didn't select a row
                javax.swing.JOptionPane.showMessageDialog(view, "Please select a dog from the table to delete!");
            }
        });
    }

    private void handleSave() {
        try {
            String id = view.idField.getText();
            String name = view.nameField.getText();
            int age = Integer.parseInt(view.ageField.getText());
            String breed = view.breedField.getText();
            boolean trained = view.trainedBox.isSelected();
    
            Dog dog = new Dog(id, name, age, Pet.Type.DOG, "Unknown", breed, trained);
            
            // --- VALIDATION ADDED HERE ---
            org.example.assigment.lapyae.day13Pet.validator.BasicValidator.validatePet(dog);
            
            service.addDog(dog);
            refreshTable();
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(view, "Age must be a valid number!");
        } catch (Exception ex) {
            // Catch validation errors and show them!
            javax.swing.JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }

    private void refreshTable() {
        view.tableModel.setRowCount(0);
        for (Dog d : service.getAllDogs()) {
            view.tableModel.addRow(new Object[] { d.getId(), d.getName(), d.getAge(), d.getBreed(), d.isTrained() });
        }
    }
}
