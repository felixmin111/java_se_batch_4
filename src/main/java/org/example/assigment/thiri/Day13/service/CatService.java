package org.example.assigment.thiri.Day13.service;

import org.example.Day17.model.Product;
import org.example.assigment.thiri.Day13.model.Cat;
import org.example.assigment.thiri.Day13.model.Pet;
import org.example.assigment.thiri.Day13.repository.CatRepository;

import java.util.ArrayList;
import java.util.List;

public class CatService {
    private static List<Cat> cats = new ArrayList<>();
    private CatRepository catRepository;

    static {
        cats.add(new Cat(1, "Thiri", 1, "orange", Pet.PetType.CAT, true, "short"));
        cats.add(new Cat(2, "Soe", 2, "white", Pet.PetType.CAT, false, "long"));
        cats.add(new Cat(3, "Hla", 3, "black", Pet.PetType.CAT, true, "medium"));
    }

    public CatService() {this.catRepository = new CatRepository();
    }

    public  List<Cat> getCats() {
        return catRepository.findAll();
    }

    public  void saveCat(Cat cat) {
        catRepository.save(cat);
    }

    public  void updateCat(Cat cat) {
        catRepository.update(cat);
    }

    public Cat getCatById(int id) {
        for (Cat cat : cats) {
            if(cat.getId() == id) {
                return cat;
            }
        }
        return null;
    }

    public void deleteCat(int id) {
        catRepository.deleteById(id);
    }
}


