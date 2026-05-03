package org.example.assigment.thiri.Day13.controller;

import org.example.assigment.thiri.Day13.service.CatService;
import org.example.assigment.thiri.Day13.service.DogService;
import org.example.assigment.thiri.Day13.view.*;

import java.awt.*;

import static org.example.assigment.thiri.Day13.view.CatInputView.resultField;

public class PetMenuController {
    PetMenuView petMenuView;

    public PetMenuController(PetMenuView petMenuView) {
        this.petMenuView = petMenuView;

        petMenuView.button1.addActionListener(e -> {performAction();});
        petMenuView.button2.addActionListener(e -> {clear();});
    }


    public void performAction() {
        if (petMenuView.option1.isSelected()) {
            if (petMenuView.petType1.isSelected()) {
                CatInputView catInputView = new CatInputView();
                new CatInputController(catInputView);
                MainView.setView(catInputView.panel);
            } else if (petMenuView.petType2.isSelected()) {
                    DogInputView dogInputView = new DogInputView();
                    new DogInputController(dogInputView);
                    MainView.setView(dogInputView.panel);
                }
            }

        if (petMenuView.option2.isSelected()) {
            if (petMenuView.petType1.isSelected()) {
                CatDisplayView catDisplayView = new CatDisplayView();
                MainView.setView(catDisplayView.panel);
                new CatDisplayController(catDisplayView);
            }else if (petMenuView.petType2.isSelected()) {
                DogDisplayView dogDisplayView = new DogDisplayView();
                new DogDisplayController(dogDisplayView);
                MainView.setView(dogDisplayView.panel);
            }
        }
    }

    public void clear() {
        petMenuView.buttonGroup1.clearSelection();
        petMenuView.buttonGroup2.clearSelection();
    }

}
