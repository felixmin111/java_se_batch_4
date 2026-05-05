package org.example.assigment.aung.petassignment.service;

import org.example.assigment.aung.petassignment.repository.CatDatabaseRepository;
import org.example.assigment.aung.petassignment.model.Cat;
import java.util.ArrayList;
import java.util.List;

public class CatService {
    private CatDatabaseRepository repo;

    public CatService() {
        this.repo = new CatDatabaseRepository();
    }

    public List<Cat> getAllCats() {
        return repo.findAll();
    }

    public void save(Cat cat) {
        repo.save(cat);
    }

    public void update(Cat cat) {
        repo.update(cat);
    }

    public void deleteById(String id) {
        repo.deleteById(id);
    }
}
