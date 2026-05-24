package org.example.assigment.yuki.PetInformationFileSystem.Controller;

import org.example.assigment.yuki.PetInformationFileSystem.Model.Dog;
import org.example.assigment.yuki.PetInformationFileSystem.Service.DogService;
import org.example.assigment.yuki.PetInformationFileSystem.View.DogView;

public class DogController {

    private DogService service;
    private DogView view;

    public DogController(DogService service, DogView view){
        this.service = service;
        this.view = view;

        this.view.idField.setEnabled(false);

        this.view.saveButton.addActionListener(e -> saveDog());
        this.view.updateButton.addActionListener(e -> updateDog());
        this.view.deleteButton.addActionListener(e -> deleteDog());
        this.view.table.getSelectionModel().addListSelectionListener(e -> {
            if(!e.getValueIsAdjusting()){
                fillFormFromSelectedRow();
            }

        });

        loadDogs();
    }

    private void loadDogs(){
        view.tableModel.setRowCount(0);

        for(Dog dog : service.getAllDogs()){
            view.tableModel.addRow(new Object[]{
                    dog.getId(),
                    dog.getName(),
                    dog.getAge(),
                    dog.getColor(),
                    dog.getBreed(),
                    dog.isTrained() ? "Yes" : "No",
            });
        }
    }

    private void saveDog(){

        String name = view.nameField.getText();
        int age = Integer.parseInt(view.ageField.getText());
        String color = view.colorField.getText();
        boolean trained = view.trainedBox.getSelectedItem().toString().equals("Yes");
        String breed = view.breedField.getText();

        Dog dog = new Dog(null,name,age,color,breed,trained);

        service.saveDog(dog);

        loadDogs();
        cleanForm();

    }

    private void updateDog(){
        int id = Integer.parseInt(view.idField.getText());
        String name = view.nameField.getText();
        int age = Integer.parseInt(view.ageField.getText());
        String color = view.colorField.getText();
        boolean trained = view.trainedBox.getSelectedItem().toString().equals("Yes");
        String breed = view.breedField.getText();
    }

    private void deleteDog(){
        int id = Integer.parseInt(view.idField.getText());
        service.deleteDogById(id);
        loadDogs();
        cleanForm();
    }

    private void fillFormFromSelectedRow(){
        int row = view.table.getSelectedRow();
        if(row < 0 || row >= view.tableModel.getRowCount()){
            return;
        }

        view.idField.setText(view.tableModel.getValueAt(row,0).toString());
        view.nameField.setText(view.tableModel.getValueAt(row,1).toString());

        view.ageField.setText(view.tableModel.getValueAt(row,2).toString());
        view.colorField.setText(view.tableModel.getValueAt(row,3).toString());
        view.breedField.setText(view.tableModel.getValueAt(row,4).toString());
        view.trainedBox.setSelectedItem(view.tableModel.getValueAt(row,5).toString());
    }

    private void cleanForm(){
        view.idField.setText("");
        view.nameField.setText("");
        view.ageField.setText("");
        view.colorField.setText("");
        view.breedField.setText("");
        view.trainedBox.setSelectedIndex(0);

    }
}
