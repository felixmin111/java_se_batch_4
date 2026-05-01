package org.example.assigment.aung.petassignment.service;

import org.example.assigment.aung.petassignment.repository.CatFileRepository;
import org.example.assigment.aung.petassignment.model.Cat;


import java.util.ArrayList;

public class CatService {
    private CatFileRepository catRepo = new CatFileRepository();

    public void saveCat(Cat cat) {
        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(cat);
        catRepo.saveToFile("src/main/java/org/example/assigment/aung/petassignment/data/cat.txt", catList);
    }

    public ArrayList<Cat> getAllCats() {
        return catRepo.loadFromFile("src/main/java/org/example/assigment/aung/petassignment/data/cat.txt");
    }
}
