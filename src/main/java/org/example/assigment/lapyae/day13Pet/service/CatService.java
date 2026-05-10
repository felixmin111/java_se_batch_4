package org.example.assigment.lapyae.day13Pet.service;

import org.example.assigment.lapyae.day13Pet.model.Cat;
import org.example.assigment.lapyae.day13Pet.repository.CatDBRepo;
import java.util.List;

public class CatService {
    private CatDBRepo repo = new CatDBRepo();

    public void addCat(Cat cat) {
        repo.save(cat);
    }

    public List<Cat> getAllCats() {
        return repo.findAll();
    }

    public void removeCat(String id) {
        repo.deleteById(id);
    }
}