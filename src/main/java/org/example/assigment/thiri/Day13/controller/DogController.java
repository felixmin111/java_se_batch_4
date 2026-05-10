package org.example.assigment.thiri.Day13.controller;


import org.example.assigment.thiri.Day13.model.Dog;
import org.example.assigment.thiri.Day13.model.Pet;
import org.example.assigment.thiri.Day13.service.DogService;
import org.example.assigment.thiri.Day13.validator.NullValidator;
import org.example.assigment.thiri.Day13.view.DogView;

import java.util.List;

public class DogController {
        private DogService dogService;
        private DogView dogView;

        public DogController(DogService dogService, DogView dogView) {
            this.dogService = dogService;
            this.dogView = dogView;
            loadDog();
            this.dogView.saveButton.addActionListener(e -> {saveDog();});
            this.dogView.updateButton.addActionListener(e ->   {updateDog();});
            this.dogView.deleteButton.addActionListener(e -> {deleteDog();});
            this.dogView.table.getSelectionModel().addListSelectionListener(e -> {
                if (!e.getValueIsAdjusting()) {
                    fillFormFromSelectedRow();
                }
            });
        }

        private void loadDog() {
            dogView.tableModel.setRowCount(0); //Clean Old data

            List<Dog> dogs = dogService.getDogs();
            for (Dog dog : dogs) {
                dogView.tableModel.addRow(new Object[]{
                        dog.getId(),
                        dog.getName(),
                        dog.getAge(),
                        dog.getColor(),
                        dog.getBreed(),
                        dog.isTrained() ? "Yes" : "No",
                });
            }
        }

        private void saveDog() {
            System.out.println("Saving dog...");
            Integer id = this.dogView.idField.getText().hashCode();
            String name = this.dogView.nameField.getText();
            int age = Integer.parseInt(this.dogView.ageField.getText());
            String color = this.dogView.colorField.getText();
            String breed = this.dogView.breedField.getText();
            String isTrainedStr = dogView.option1.isSelected() ? "yes" : "no";

            Dog dog  = new Dog(id, name, age, color, Pet.PetType.CAT, breed, isTrainedStr.equals("yes"));
            dogService.saveDog(dog);
            loadDog();
            clearForm();
        }

        private void clearForm() {
            dogView.idField.setText("");
            dogView.nameField.setText("");
            dogView.ageField.setText("");
            dogView.colorField.setText("");
            dogView.breedField.setText("");
            dogView.buttonGroup.clearSelection();
        }

        private void updateDog() {
            System.out.println("Updating dog...");
            String idText = this.dogView.idField.getText();
            if (idText == null || idText.isEmpty()) {
                System.out.println("Error: ID is empty. Please select a cat from the table first.");
                return;
            }
            int id = Integer.parseInt(idText);
            String name = this.dogView.nameField.getText();
            int age = Integer.parseInt(this.dogView.ageField.getText());
            String color = this.dogView.colorField.getText();
            String breed = this.dogView.breedField.getText();
            String isTrainedStr = dogView.option1.isSelected() ? "yes" : "no";

            Dog dog  = new Dog(id, name, age, color, Pet.PetType.CAT, breed, isTrainedStr.equals("yes"));
            NullValidator.validate(dog);
            dogService.updateDog(dog);
            loadDog();
            clearForm();
        }

        private void deleteDog() {
            System.out.println("Deleting dog...");
            int id = Integer.parseInt(this.dogView.idField.getText());
            dogService.deleteDog(id);
            loadDog();
            clearForm();
        }

        private void fillFormFromSelectedRow() {
            int row = dogView.table.getSelectedRow();

            // FIX: If no row is selected (row is -1), exit the method immediately
            if (row < 0) {
                return;
            }
            System.out.println("Filling form...");

            String id = dogView.table.getValueAt(row, 0).toString();
            String name = dogView.table.getValueAt(row, 1).toString();
            String age = dogView.table.getValueAt(row, 2).toString();
            String color = dogView.table.getValueAt(row, 3).toString();
            String breed = dogView.table.getValueAt(row, 4).toString();
            String train = dogView.table.getValueAt(row, 5).toString();

            // Set text fields
            dogView.idField.setText(id);
            dogView.nameField.setText(name);
            dogView.ageField.setText(age);
            dogView.colorField.setText(color);
            dogView.breedField.setText(breed);

            if (train.equalsIgnoreCase("Yes")) {
                dogView.option1.setSelected(true);
            } else {
                dogView.option2.setSelected(true);
            }
        }
}
