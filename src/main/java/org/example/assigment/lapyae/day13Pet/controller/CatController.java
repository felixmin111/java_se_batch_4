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

                org.example.assigment.lapyae.day13Pet.validator.BasicValidator.validatePet(cat);
                
                service.addCat(cat);
                refreshTable();
            } catch (NumberFormatException ex) {
                javax.swing.JOptionPane.showMessageDialog(view, "Age must be a valid number!");
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(view, ex.getMessage());
            }
        });

        this.view.table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = view.table.getSelectedRow();
                if (selectedRow != -1) {
                    view.idField.setText(view.tableModel.getValueAt(selectedRow, 0).toString());
                    view.nameField.setText(view.tableModel.getValueAt(selectedRow, 1).toString());
                    view.ageField.setText(view.tableModel.getValueAt(selectedRow, 2).toString());
                    view.colorField.setText(view.tableModel.getValueAt(selectedRow, 3).toString());
                    view.indoorBox.setSelected(view.tableModel.getValueAt(selectedRow, 4).toString().equals("Yes"));
                    view.furBox.setSelectedItem(view.tableModel.getValueAt(selectedRow, 5).toString());
                }
            }
        });

        this.view.updateBtn.addActionListener(e -> {
            try {
                if (view.idField.getText().isEmpty()) {
                    javax.swing.JOptionPane.showMessageDialog(view, "Please select a cat from the table to update!");
                    return;
                }
                Cat cat = new Cat(
                        view.idField.getText(),
                        view.nameField.getText(),
                        Integer.parseInt(view.ageField.getText()),
                        Pet.Type.CAT,
                        view.colorField.getText(),
                        view.indoorBox.isSelected(),
                        Cat.FurLength.valueOf(view.furBox.getSelectedItem().toString()));

                org.example.assigment.lapyae.day13Pet.validator.BasicValidator.validatePet(cat);
                service.updateCat(cat);
                refreshTable();
            } catch (NumberFormatException ex) {
                javax.swing.JOptionPane.showMessageDialog(view, "Age must be a valid number!");
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(view, ex.getMessage());
            }
        });

        this.view.deleteBtn.addActionListener(e -> {
            int selectedRow = view.table.getSelectedRow();

            if (selectedRow != -1) { // -1 means no row is selected
                String id = view.tableModel.getValueAt(selectedRow, 0).toString();
                service.removeCat(id);
                refreshTable();
            } else {
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
                    c.getColor(),
                    c.isIndoor() ? "Yes" : "No",
                    c.getFurLength()
            });
        }
    }
}
