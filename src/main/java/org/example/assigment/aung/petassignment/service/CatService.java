package org.example.assigment.aung.petassignment.service;

import org.example.assigment.aung.petassignment.model.Cat;
import java.util.ArrayList;
import java.util.List;

public class CatService {
    private static List<Cat> cats = new ArrayList<>();

    public List<Cat> getAllCats() {
        return cats;
    }

    public void save(Cat cat) {
        cats.add(cat);
    }

    public void deleteCatById(String id) {
        for (Cat cat: cats) {
            if (cat.getId()==(id)) {
                cats.remove(cat);
            }
        }
    }

    public void updateCat(Cat updatedCat) {
        cats.set(cats.indexOf(updatedCat), updatedCat);
    }
}
