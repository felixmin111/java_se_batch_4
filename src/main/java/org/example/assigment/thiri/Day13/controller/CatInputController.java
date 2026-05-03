package org.example.assigment.thiri.Day13.controller;


import org.example.assigment.thiri.Day13.service.CatService;
import org.example.assigment.thiri.Day13.view.CatInputView;
import org.example.assigment.thiri.Day13.view.MainView;
import org.example.assigment.thiri.Day13.view.PetMenuView;

import java.awt.*;

import static org.example.assigment.thiri.Day13.view.CatInputView.resultField;

public class CatInputController {
    CatInputView catInputView;

    public CatInputController(CatInputView catInputView) {
        this.catInputView = catInputView;
        this.catInputView.saveButton.addActionListener(e -> saveCat());
        this.catInputView.backButton.addActionListener(e -> goBack());
    }

    public  void saveCat() {
        System.out.println("Saving product");

        int id = Integer.parseInt(CatInputView.idField.getText());
        String name = CatInputView.nameField.getText();
        int age = Integer.parseInt(CatInputView.ageField.getText());

        String isIndoorStr = CatInputView.option1.isSelected() ? "yes" : "no";

        String furLength = "";
        if (CatInputView.shortF.isSelected()) furLength = "Short";
        else if (CatInputView.mediumF.isSelected()) furLength = "Medium";
        else if (CatInputView.longF.isSelected()) furLength = "Long";

        new CatService();
        CatService.saveCatData(id, name, age, isIndoorStr, furLength);
        setResultMessage("Success: Cat Saved!", Color.GREEN);
        CatInputView.idField.setText("");
        CatInputView.nameField.setText("");
        CatInputView.ageField.setText("");
        CatInputView.buttonGroup1.clearSelection();
        CatInputView.buttonGroup2.clearSelection();
    }

    private void goBack() {
            PetMenuView petMenuView = new PetMenuView();
            MainView.setView(petMenuView.panel);
            new PetMenuController(petMenuView);
        }

    public static void setResultMessage(String message, Color color) {
        resultField.setText(message);
        resultField.setBackground(Color.GRAY);
        resultField.setForeground(color);
    }
}