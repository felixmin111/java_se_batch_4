package org.example.assigment.aung.petassignment.controller;

import org.example.assigment.aung.petassignment.model.Cat;
import org.example.assigment.aung.petassignment.model.Pet;
import org.example.assigment.aung.petassignment.service.CatService;
import org.example.assigment.aung.petassignment.view.CatView;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import java.util.List;

public class CatController {
    private CatService catService;
    private CatView catView;

    public CatController(CatService catService, CatView catView) {
        this.catService = catService;
        this.catView = catView;

        this.catView.saveButton.addActionListener(e -> saveCat());
        this.catView.updateButton.addActionListener(e -> updateCat());
        this.catView.deleteButton.addActionListener(e -> deleteCat());

        this.catView.tableModel.addTableModelListener(new TableModelActionListener());
        loadCats();
    }

    private void loadCats() {
        catView.tableModel.setRowCount(0);
        List<Cat> cats = catService.getAllCats();
        for (Cat cat : cats) {
            catView.tableModel.addRow(new Object[] {
                    cat.getId(),
                    cat.getName(),
                    cat.getAge(),
                    cat.getColor(),
                    cat.isIndoor() ? "Yes" : "No",
                    cat.getFurlength().getLabel()
            });
        }
    }

    private void saveCat() {
        String id = catView.idField.getText();
        String name = catView.nameField.getText();
        int age = Integer.parseInt(catView.ageField.getText());
        String color = catView.colorField.getText();
        boolean isIndoor = catView.isIndoorBox.isSelected();
        String furString = catView.furLengthBox.getSelectedItem().toString().toUpperCase();
        Cat.Furlength furLength = Cat.Furlength.valueOf(furString);

        Cat cat = new Cat(id, name, age, Pet.Type.CAT, color, isIndoor, furLength);
        catService.save(cat);
        loadCats();
        cleanForm();
    }

    private void updateCat() {
        String id = catView.idField.getText();
        String name = catView.nameField.getText();
        int age = Integer.parseInt(catView.ageField.getText());
        String color = catView.colorField.getText();
        boolean isIndoor = catView.isIndoorBox.isSelected();
        String furString = catView.furLengthBox.getSelectedItem().toString().toUpperCase();
        Cat.Furlength furLength = Cat.Furlength.valueOf(furString);

        Cat cat = new Cat(id, name, age, Pet.Type.CAT, color, isIndoor, furLength);
        catService.updateCat(cat);
        loadCats();
        cleanForm();
    }

    private void deleteCat() {
        String id = catView.idField.getText();
        catService.deleteCatById(id);
        loadCats();
        cleanForm();
    }

    private void cleanForm() {
        catView.idField.setText("");
        catView.nameField.setText("");
        catView.ageField.setText("");
        catView.colorField.setText("");
        catView.isIndoorBox.setSelected(false);
        catView.furLengthBox.setSelectedIndex(0);
    }

    public class TableModelActionListener implements TableModelListener {
        @Override
        public void tableChanged(TableModelEvent e) {
            int row = e.getFirstRow();
            if (row < 0 || row >= catView.tableModel.getRowCount()) {
                return;
            }
            catView.idField.setText(catView.tableModel.getValueAt(row, 0).toString());
            catView.nameField.setText(catView.tableModel.getValueAt(row, 1).toString());
            catView.ageField.setText(catView.tableModel.getValueAt(row, 2).toString());
            catView.colorField.setText(catView.tableModel.getValueAt(row, 3).toString());
            catView.isIndoorBox.setSelected(catView.tableModel.getValueAt(row, 4).toString().equals("Yes"));

            String fur = catView.tableModel.getValueAt(row, 5).toString();
            catView.furLengthBox.setSelectedItem(fur.toUpperCase());
        }
    }
}
