package org.example.assigment.aung.petassignment.controller;

import org.example.assigment.aung.petassignment.model.Dog;
import org.example.assigment.aung.petassignment.model.Pet;
import org.example.assigment.aung.petassignment.service.DogService;
import org.example.assigment.aung.petassignment.view.DogView;
import javax.swing.JOptionPane;
import org.example.assigment.aung.petassignment.validator.PetValidator;

import java.util.List;

public class DogController {
    private DogService dogService;
    private DogView dogView;

    public DogController(DogService dogService, DogView dogView) {
        this.dogService = dogService;
        this.dogView = dogView;

        this.dogView.saveButton.addActionListener(e -> saveDog());
        this.dogView.updateButton.addActionListener(e -> updateDog());
        this.dogView.deleteButton.addActionListener(e -> deleteDog());

        this.dogView.idField.setEnabled(false);

        this.dogView.table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                populateFormFromTable();
            }
        });
        loadDogs();
    }

    private void loadDogs() {
        dogView.tableModel.setRowCount(0);
        List<Dog> dogs = dogService.getAllDogs();
        for (Dog dog : dogs) {
            dogView.tableModel.addRow(new Object[] {
                    dog.getId(),
                    dog.getName(),
                    dog.getAge(),
                    dog.getColor(),
                    dog.getBreed(),
                    dog.isTrained() ? "Yes" : "No"
            });
        }
    }

    private void saveDog() {
        try {
            String name = dogView.nameField.getText();
            String ageText = dogView.ageField.getText();
            int age = ageText.isEmpty() ? -1 : Integer.parseInt(ageText);
            String color = dogView.colorField.getText();
            String breed = dogView.breedField.getText();
            boolean isTrained = dogView.isTrainedBox.isSelected();
            Dog dog = new Dog(0, name, age, Pet.Type.DOG, color, breed, isTrained);
            PetValidator.validate(dog);
            dogService.save(dog);
            loadDogs();
            cleanForm();
            JOptionPane.showMessageDialog(dogView.panel, "Dog saved successfully");
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(dogView.panel, e.getMessage(), "Validation error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void updateDog() {
        if (dogView.idField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(dogView.panel, "Please select a cat from the table first!", "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            int id = Integer.parseInt(dogView.idField.getText());
            String name = dogView.nameField.getText();
            String ageText = dogView.ageField.getText();
            int age = ageText.isEmpty() ? -1 : Integer.parseInt(ageText);
            String color = dogView.colorField.getText();
            String breed = dogView.breedField.getText();
            boolean isTrained = dogView.isTrainedBox.isSelected();
            Dog dog = new Dog(id, name, age, Pet.Type.DOG, color, breed, isTrained);
            PetValidator.validate(dog);
            dogService.updateDog(dog);
            loadDogs();
            cleanForm();
            JOptionPane.showMessageDialog(dogView.panel, "Dog updated successfully");
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(dogView.panel, e.getMessage(), "Validation error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteDog() {
        if (dogView.idField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(dogView.panel, "Please select a dog from the table first!", "Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }
        int id = Integer.parseInt(dogView.idField.getText());
        dogService.deleteDogById(id);
        loadDogs();
        cleanForm();
    }

    private void cleanForm() {
        dogView.idField.setText("");
        dogView.nameField.setText("");
        dogView.ageField.setText("");
        dogView.colorField.setText("");
        dogView.breedField.setText("");
        dogView.isTrainedBox.setSelected(false);
    }

    private void populateFormFromTable() {
        int row = dogView.table.getSelectedRow();
        if (row < 0 || row >= dogView.tableModel.getRowCount()) {
            return;
        }
        dogView.idField.setText(dogView.tableModel.getValueAt(row, 0).toString());
        dogView.nameField.setText(dogView.tableModel.getValueAt(row, 1).toString());
        dogView.ageField.setText(dogView.tableModel.getValueAt(row, 2).toString());
        dogView.colorField.setText(dogView.tableModel.getValueAt(row, 3).toString());
        dogView.breedField.setText(dogView.tableModel.getValueAt(row, 4).toString());
        dogView.isTrainedBox.setSelected(dogView.tableModel.getValueAt(row, 5).toString().equals("Yes"));
    }
}
