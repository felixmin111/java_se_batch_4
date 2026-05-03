package org.example.assigment.thiri.Day13.controller;

import org.example.assigment.thiri.Day13.service.CatService;
import org.example.assigment.thiri.Day13.view.CatDisplayView;
import org.example.assigment.thiri.Day13.view.MainView;
import org.example.assigment.thiri.Day13.view.PetMenuView;

public class CatDisplayController {
    public CatDisplayView view;
    public CatService service;

    public CatDisplayController(CatDisplayView view) {
        this.view = view;
        this.service = new CatService();

        service.loadData();

        this.view.backButton.addActionListener(e -> goBack());
        this.view.deleteButton.addActionListener(e -> deleteCat());
    }

    private void deleteCat() {
        int selectedRow = view.table.getSelectedRow();
        if (selectedRow != -1) {
            CatDisplayView.model.removeRow(selectedRow);
        }
    }

    private void goBack() {
        PetMenuView menuView = new PetMenuView();
        new PetMenuController(menuView);
        MainView.setView(menuView.panel);
    }
}