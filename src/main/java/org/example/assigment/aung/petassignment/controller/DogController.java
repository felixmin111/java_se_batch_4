package org.example.assigment.aung.petassignment.controller;

import org.example.assigment.aung.petassignment.model.Dog;
import org.example.assigment.aung.petassignment.model.Pet;
import org.example.assigment.aung.petassignment.service.DogService;
import org.example.assigment.aung.petassignment.view.DogView;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
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
        
        this.dogView.tableModel.addTableModelListener(new TableModelActionListener());
        loadDogs();
    }

    private void loadDogs() {
        dogView.tableModel.setRowCount(0);
        List<Dog> dogs = dogService.getAllDogs();
        for (Dog dog : dogs) {
            dogView.tableModel.addRow(new Object[]{
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
        String id = dogView.idField.getText();
        String name = dogView.nameField.getText();
        int age = Integer.parseInt(dogView.ageField.getText());
        String color = dogView.colorField.getText();
        String breed = dogView.breedField.getText();
        boolean isTrained = dogView.isTrainedBox.isSelected();
        Dog dog = new Dog(id, name, age, Pet.Type.DOG, color, breed, isTrained);
        dogService.save(dog);
        loadDogs();
        cleanForm();
    }

    private void updateDog() {
        String id = dogView.idField.getText();
        String name = dogView.nameField.getText();
        int age = Integer.parseInt(dogView.ageField.getText());
        String color = dogView.colorField.getText();
        String breed = dogView.breedField.getText();
        boolean isTrained = dogView.isTrainedBox.isSelected();
        Dog dog = new Dog(id, name, age, Pet.Type.DOG, color, breed, isTrained);
        dogService.updateDog(dog);
        loadDogs();
        cleanForm();
    }

    private void deleteDog() {
        String id = dogView.idField.getText();
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

    public class TableModelActionListener implements TableModelListener {
        @Override
        public void tableChanged(TableModelEvent e) {
            int row = e.getFirstRow();
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
}
