package org.example.assigment.yuki.PetInformationFileSystem.Controller;

import org.example.assigment.yuki.PetInformationFileSystem.Model.Dog;
import org.example.assigment.yuki.PetInformationFileSystem.Service.PetService;
import org.example.assigment.yuki.PetInformationFileSystem.View.DogView;

public class DogController {

    private PetService service;
    private DogView view;

    public DogController(PetService service, DogView view){
        this.service = service;
        this.view = view;

        view.saveButton.addActionListener(e -> saveDog());

        loadDogs();
    }

    private void loadDogs(){
        view.tableModel.setRowCount(0);

        for(Dog dog : service.getDogs()){
            view.tableModel.addRow(new Object[]{
                    dog.getId(),
                    dog.getName(),
                    dog.getAge(),
                    dog.getColor(),
                    dog.getBreed(),
                    dog.isTrained() ? "Yes" : "No"
            });
        }
    }

    private void saveDog(){
        int id = Integer.parseInt(view.idField.getText());
        String name = view.nameField.getText();
        int age = Integer.parseInt(view.ageField.getText());
        String color = view.colorField.getText();
        String breed = view.breedField.getText();

        Dog dog = new Dog(id,name,age,color,breed,true);

        service.saveDog(dog);

        loadDogs();
    }
}
