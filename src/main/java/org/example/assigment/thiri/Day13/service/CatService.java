package org.example.assigment.thiri.Day13.service;

import org.example.assigment.thiri.Day13.model.Cat;
import org.example.assigment.thiri.Day13.model.Pet;
import org.example.assigment.thiri.Day13.view.CatDisplayView;

import java.util.ArrayList;
import java.util.List;

public class CatService {
    private static List<Cat> cats = new ArrayList<>();

    static {
        cats.add(new Cat(1, "Thiri", 1, "orange", Pet.PetType.CAT, true, "short"));
        cats.add(new Cat(2, "Soe", 2, "white", Pet.PetType.CAT, false, "long"));
        cats.add(new Cat(3, "Hla", 3, "black", Pet.PetType.CAT, true, "medium"));
    }

    public static List<Cat> getCats() {
        return cats;
    }

    public static void saveCatData(int id, String name, int age, String isIndoorStr, String furLength) {
        boolean isIndoor = isIndoorStr.equalsIgnoreCase("yes");
        Cat newCat = new Cat(id, name, age, "Unknown", Pet.PetType.CAT, isIndoor, furLength);
        cats.add(newCat);
        System.out.println("Service: Model created and saved.");
    }

    public void loadData() {
        CatDisplayView.model.setRowCount(0);

        List<Cat> cats = CatService.getCats();

        for (Cat cat : cats) {
            CatDisplayView.model.addRow(new Object[]{
                    cat.getId(),
                    cat.getName(),
                    cat.getAge(),
                    cat.isIndoor() ? "Yes" : "No",
                    cat.getLength()
            });
        }
    }
}
