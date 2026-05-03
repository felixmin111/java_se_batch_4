package org.example.assigment.thiri.Day13.controller;

import org.example.assigment.thiri.Day13.service.DogService;
import org.example.assigment.thiri.Day13.view.DogDisplayView;
import org.example.assigment.thiri.Day13.view.MainView;
import org.example.assigment.thiri.Day13.view.PetMenuView;

public class DogDisplayController {
    private DogDisplayView view;
    private DogService service;

    public DogDisplayController(DogDisplayView view) {
        this.view = view;
        this.service = new DogService();

        service.loadData();

        this.view.backButton.addActionListener(e -> goBack());
        this.view.deleteButton.addActionListener(e -> deleteDog());
    }

    private void deleteDog() {
        int selectedRow = view.table.getSelectedRow();
        if (selectedRow != -1) {
            DogDisplayView.model.removeRow(selectedRow);
        }
    }

    private void goBack() {
        // Return to the Pet Management Menu
        PetMenuView menuView = new PetMenuView();
        new PetMenuController(menuView);
        MainView.setView(menuView.panel);
    }
}