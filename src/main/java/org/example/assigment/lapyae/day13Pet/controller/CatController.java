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
                        Cat.FurLength.valueOf(view.furBox.getSelectedItem().toString()));
                
                // --- VALIDATION ADDED HERE ---
                org.example.assigment.lapyae.day13Pet.validator.BasicValidator.validatePet(cat);
                
                service.addCat(cat);
                refreshTable();
            } catch (NumberFormatException ex) {
                javax.swing.JOptionPane.showMessageDialog(view, "Age must be a valid number!");
            } catch (Exception ex) {
                // Catch validation errors and show them!
                javax.swing.JOptionPane.showMessageDialog(view, ex.getMessage());
            }
        });

        this.view.deleteBtn.addActionListener(e -> {
            // Get the row the user clicked on
            int selectedRow = view.table.getSelectedRow();

            if (selectedRow != -1) { // -1 means no row is selected
                // Grab the ID from the first column (index 0)
                String id = view.tableModel.getValueAt(selectedRow, 0).toString();

                // Tell the service to delete it from the DB
                service.removeCat(id);

                // Refresh the table so it disappears from the screen
                refreshTable();
            } else {
                // Warn the user if they didn't select a row
                javax.swing.JOptionPane.showMessageDialog(view, "Please select a cat from the table to delete!");
            }
        });
        refreshTable();
    }

    private void refreshTable() {
        view.tableModel.setRowCount(0);
        for (Cat c : service.getAllCats()) {
            view.tableModel.addRow(new Object[] {
                    c.getId(),
                    c.getName(),
                    c.getAge(),
                    c.isIndoor() ? "Yes" : "No",
                    c.getFurLength()
            });
        }
    }
}
