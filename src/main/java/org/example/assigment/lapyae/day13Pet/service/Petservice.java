package org.example.assigment.lapyae.day13Pet.service;

import org.example.assigment.lapyae.day13Pet.data.CatfileRepository;
import org.example.assigment.lapyae.day13Pet.data.DogfileRepository;
import org.example.assigment.lapyae.day13Pet.model.Cat;
import org.example.assigment.lapyae.day13Pet.model.Dog;
import java.util.ArrayList;

public class Petservice {
    private CatfileRepository catRepo = new CatfileRepository();
    private DogfileRepository dogRepo = new DogfileRepository();

    private final String CAT_FILE = "cat.txt";
    private final String DOG_FILE = "dog.txt";

    public void addCat(Cat cat) { catRepo.saveToFile(CAT_FILE, cat); }
    public void addDog(Dog dog) { dogRepo.saveToFile(DOG_FILE, dog); }

    public ArrayList<Cat> getCats() { return catRepo.loadFromFile(CAT_FILE); }
    public ArrayList<Dog> getDogs() { return dogRepo.loadFromFile(DOG_FILE); }
}
