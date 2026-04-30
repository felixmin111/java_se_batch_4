package org.example.assigment.aung.petassignment.service;

import org.example.assigment.aung.petassignment.repository.CatFileRepository;
import org.example.assigment.aung.petassignment.repository.DogFileRepository;
import org.example.assigment.aung.petassignment.model.Cat;
import org.example.assigment.aung.petassignment.model.Dog;

import java.util.ArrayList;

public class PetService {
    private CatFileRepository catRepo = new CatFileRepository();
    private DogFileRepository dogRepo = new DogFileRepository();

    public void saveCat(Cat cat) {
        ArrayList<Cat> catList = new ArrayList<>();
        catList.add(cat);
        catRepo.saveToFile("src/main/java/org/example/assigment/aung/petassignment/data/cat.txt", catList);
    }

    public void saveDog(Dog dog) {
        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.add(dog);
        dogRepo.saveToFile("src/main/java/org/example/assigment/aung/petassignment/data/dog.txt", dogList);
    }

    public ArrayList<Cat> getAllCats() {
        return catRepo.loadFromFile("src/main/java/org/example/assigment/aung/petassignment/data/cat.txt");
    }

    public ArrayList<Dog> getAllDogs() {
        return dogRepo.loadFromFile("src/main/java/org/example/assigment/aung/petassignment/data/dog.txt");
    }
}