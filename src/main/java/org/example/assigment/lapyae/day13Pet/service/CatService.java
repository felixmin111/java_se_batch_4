package org.example.assigment.lapyae.day13Pet.service;

import org.example.assigment.lapyae.day13Pet.model.Cat; // Added Import
import java.util.ArrayList;
import java.util.List;

public class CatService {
    private List<Cat> catList = new ArrayList<>(); // Changed to Cat

    public void addCat(Cat cat) { catList.add(cat); } // Renamed for clarity

    public List<Cat> getAllCats() { return catList; }

    public void removeCat(String id) {
        catList.removeIf(cat -> cat.getId().equals(id));
    }
}
