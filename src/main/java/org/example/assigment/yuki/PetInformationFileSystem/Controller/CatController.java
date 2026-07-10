package org.example.assigment.yuki.PetInformationFileSystem.Controller;

import org.example.assigment.yuki.PetInformationFileSystem.Model.Cat;
import org.example.assigment.yuki.PetInformationFileSystem.Service.CatService;
import org.example.assigment.yuki.PetInformationFileSystem.View.CatView;

public class CatController {

    private CatService service;
    private CatView view;

    public CatController(CatService service, CatView view){
        this.service = service;
        this.view = view;

        this.view.idField.setEnabled(false);

        view.saveButton.addActionListener(e -> saveCat());
        this.view.updateButton.addActionListener(e -> updateCat());
        this.view.deleteButton.addActionListener(e -> deleteCat());
        this.view.table.getSelectionModel().addListSelectionListener(e -> {
            if(!e.getValueIsAdjusting()){
                fillFormFromSelectedRow();
            }

        });

        loadCats();
    }

    private void loadCats(){
        view.tableModel.setRowCount(0);

        for(Cat cat : service.getAllCats()){
            view.tableModel.addRow(new Object[]{
                    cat.getId(),
                    cat.getName(),
                    cat.getAge(),
                    cat.getColor(),
                    cat.isIndoor() ? "Yes" : "No",
                    cat.getFurLength()
            });
        }
    }

    private void saveCat(){

        String name = view.nameField.getText();
        int age = Integer.parseInt(view.ageField.getText());
        String color = view.colorField.getText();
        boolean indoor = view.indoorBox.getSelectedItem().toString().equals("Yes");
        double fur = Double.parseDouble(view.furField.getText());
        Cat cat = new Cat(null,name,age,color,indoor,fur);
        service.saveCat(cat);
        loadCats();
        cleanForm();

    }

    private void updateCat(){
        int id = Integer.parseInt(view.idField.getText());
        String name = view.nameField.getText();
        int age = Integer.parseInt(view.ageField.getText());
        String color = view.colorField.getText();
        boolean indoor = view.indoorBox.getSelectedItem().toString().equals("Yes");
        double fur = Double.parseDouble(view.furField.getText());
        Cat cat = new Cat(id, name, age, color, indoor, fur);
        service.updateCat(cat);
        loadCats();
        cleanForm();
    }

    private void deleteCat(){
        int id = Integer.parseInt(view.idField.getText());
        service.deleteCatById(id);
        loadCats();
        cleanForm();
    }

    private void fillFormFromSelectedRow(){
        int row = view.table.getSelectedRow();
        if(row < 0 || row >= view.tableModel.getRowCount()){
            return;
        }
        view.idField.setText(view.tableModel.getValueAt(row,0).toString());
        view.nameField.setText(view.tableModel.getValueAt(row,1).toString());
        view.ageField.setText(view.tableModel.getValueAt(row,2).toString());
        view.colorField.setText(view.tableModel.getValueAt(row,3).toString());
        view.indoorBox.setSelectedItem(view.tableModel.getValueAt(row,4).toString());
        view.furField.setText(view.tableModel.getValueAt(row,5).toString());
    }

    private void cleanForm(){
        view.idField.setText("");
        view.nameField.setText("");
        view.ageField.setText("");
        view.colorField.setText("");
        view.furField.setText("");
        view.indoorBox.setSelectedIndex(0);

    }
}
