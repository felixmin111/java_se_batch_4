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
            int selectedRow = view.table.getSelectedRow();

            if (selectedRow != -1) { // -1 means no row is selected
                String id = view.tableModel.getValueAt(selectedRow, 0).toString();
                service.delete(id);
                refreshTable();
            } else {
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
            org.example.assigment.lapyae.day13Pet.validator.BasicValidator.validatePet(dog);
            
            service.addDog(dog);
            refreshTable();
        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(view, "Age must be a valid number!");
        } catch (Exception ex) {

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
