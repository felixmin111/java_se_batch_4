package org.example.assigment.aung.petassignment.controller;

import org.example.assigment.aung.petassignment.model.Cat;
import org.example.assigment.aung.petassignment.model.Pet;
import org.example.assigment.aung.petassignment.service.CatService;
import org.example.assigment.aung.petassignment.view.CatView;
import javax.swing.*;

public class SwingController {
    private CatView catView;
    private CatService catService;

    public SwingController(CatView catView, CatService catService) {
        this.catView = catView;
        this.catService = catService;

        this.catView.saveButton.addActionListener(e -> saveCat());
    }

    private void saveCat() {
        String id = catView.idField.getText();
        String name = catView.nameField.getText();
        int age = Integer.parseInt(catView.ageField.getText());
        String color = catView.colorField.getText();
        boolean isIndoor = catView.isIndoorBox.isSelected();
        String fur =(String) catView.furlengthBox.getSelectedItem();
        Cat.Furlength furlength = Cat.Furlength.valueOf(fur);

        Cat cat = new Cat(id, name, age,Pet.Type.CAT, color, isIndoor, furlength);
        catService.saveCat(cat);

        catView.idField.setText("");
        catView.nameField.setText("");
        catView.ageField.setText("");
        catView.colorField.setText("");
        catView.isIndoorBox.setSelected(false);
        catView.furlengthBox.setSelectedItem("");


    }
}
