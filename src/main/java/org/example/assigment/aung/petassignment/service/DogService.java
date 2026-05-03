package org.example.assigment.aung.petassignment.service;

import org.example.assigment.aung.petassignment.model.Dog;
import java.util.ArrayList;
import java.util.List;

public class DogService {
    private static List<Dog> dogs = new ArrayList<>();

    public List<Dog> getAllDogs() {
        return dogs;
    }

    public void save(Dog dog) {
        dogs.add(dog);
    }

    public void deleteDogById(String id) {
        for (Dog dog : dogs) {
            if (dog.getId() == (id)) {
                dogs.remove(dog);
            }
        }
    }

    public void updateDog(Dog updatedDog) {
        dogs.set(dogs.indexOf(updatedDog), updatedDog);
    }
}
