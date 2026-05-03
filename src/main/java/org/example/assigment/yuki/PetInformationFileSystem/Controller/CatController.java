package org.example.assigment.yuki.PetInformationFileSystem.Controller;

import org.example.assigment.yuki.PetInformationFileSystem.Model.Cat;
import org.example.assigment.yuki.PetInformationFileSystem.Service.PetService;
import org.example.assigment.yuki.PetInformationFileSystem.View.CatView;

public class CatController {

    private PetService service;
    private CatView view;

    public CatController(PetService service, CatView view){
        this.service = service;
        this.view = view;

        view.saveButton.addActionListener(e -> saveCat());

        loadCats();
    }

    private void loadCats(){
        view.tableModel.setRowCount(0);

        for(Cat cat : service.getCats()){
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
        int id = Integer.parseInt(view.idField.getText());
        String name = view.nameField.getText();
        int age = Integer.parseInt(view.ageField.getText());
        String color = view.colorField.getText();
        double fur = Double.parseDouble(view.furField.getText());

        Cat cat = new Cat(id,name,age,color,true,fur);

        service.saveCat(cat);

        loadCats();
    }
}
