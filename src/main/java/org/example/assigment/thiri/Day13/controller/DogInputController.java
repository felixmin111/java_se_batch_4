package org.example.assigment.thiri.Day13.controller;

import org.example.assigment.thiri.Day13.service.DogService;
import org.example.assigment.thiri.Day13.view.DogInputView;
import org.example.assigment.thiri.Day13.view.MainView;
import org.example.assigment.thiri.Day13.view.PetMenuView;

import java.awt.*;

public class DogInputController {
    static DogInputView dogInputView;

    public DogInputController(DogInputView dogInputView) {
        DogInputController.dogInputView = dogInputView;
        DogInputController.dogInputView.saveButton.addActionListener(e -> saveDog());
        DogInputController.dogInputView.backButton.addActionListener(e -> goBack());
    }

    public void saveDog() {
        System.out.println("Saving Dog");

        int id = Integer.parseInt(DogInputView.idField.getText());
        String name = DogInputView.nameField.getText();
        int age = Integer.parseInt(DogInputView.ageField.getText());

        String breed = DogInputView.breedField.getText();
        String isTrainedStr = dogInputView.option1.isSelected() ? "yes" : "no";

        new DogService();
        DogService.saveDogData(id, name, age, breed, isTrainedStr);
        setResultMessage1("Success: Dog Saved!", Color.GREEN);
        DogInputView.idField.setText("");
        DogInputView.nameField.setText("");
        DogInputView.ageField.setText("");
        DogInputView.breedField.setText("");
        DogInputView.buttonGroup.clearSelection();
    }

    private void goBack() {
        PetMenuView petMenuView = new PetMenuView();
        MainView.setView(petMenuView.panel);
        new PetMenuController(petMenuView);
    }

    public static void setResultMessage1(String message, Color color) {
        dogInputView.resultField1.setText(message);
        dogInputView.resultField1.setBackground(Color.GRAY);
        dogInputView.resultField1.setForeground(color);
    }

}