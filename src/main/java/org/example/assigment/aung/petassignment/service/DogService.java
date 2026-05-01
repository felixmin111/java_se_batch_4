package org.example.assigment.aung.petassignment.service;

import org.example.assigment.aung.petassignment.repository.DogFileRepository;
import org.example.assigment.aung.petassignment.model.Dog;

import java.util.ArrayList;

public class DogService {
    private DogFileRepository dogRepo = new DogFileRepository();

    public void saveDog(Dog dog) {
        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.add(dog);
        dogRepo.saveToFile("src/main/java/org/example/assigment/aung/petassignment/data/dog.txt", dogList);
    }

    public ArrayList<Dog> getAllDogs() {
        return dogRepo.loadFromFile("src/main/java/org/example/assigment/aung/petassignment/data/dog.txt");
    }
}
