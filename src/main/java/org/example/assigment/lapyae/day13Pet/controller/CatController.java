package org.example.assigment.lapyae.day13Pet.controller;

import org.example.assigment.lapyae.day13Pet.model.Cat;
import org.example.assigment.lapyae.day13Pet.model.Pet;
import org.example.assigment.lapyae.day13Pet.service.CatService;
import org.example.assigment.lapyae.day13Pet.view.CatView;

public class CatController {
    private CatView view;
    private CatService service;

    public CatController(CatView view, CatService service) {
        this.view = view;
        this.service = service;

        this.view.saveBtn.addActionListener(e -> {
            try {
                Cat cat = new Cat(
                        view.idField.getText(),
                        view.nameField.getText(),
                        Integer.parseInt(view.ageField.getText()),
                        Pet.Type.CAT,
                        view.colorField.getText(),
                        view.indoorBox.isSelected(),
                        Cat.FurLength.valueOf(view.furBox.getSelectedItem().toString())
                );
                service.addCat(cat);
                refreshTable();
            } catch (NumberFormatException ex) {
                System.out.println("Invalid age format!");
            }
        });
    }

    private void refreshTable() {
        view.tableModel.setRowCount(0);
        for (Cat c : service.getAllCats()) {
            view.tableModel.addRow(new Object[]{
                    c.getId(),
                    c.getName(),
                    c.getAge(),
                    c.isIndoor() ? "Yes" : "No",
                    c.getFurLength()
            });
        }
    }
}
