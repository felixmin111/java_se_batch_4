package org.example.assigment.lapyae.day13Pet.service;

import org.example.assigment.lapyae.day13Pet.model.Dog;
import java.util.ArrayList;
import java.util.List;

public class DogService {
    private List<Dog> dogs = new ArrayList<>();
    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> getAllDogs() {
        return dogs;
    }

    public void delete(String id) {
        dogs.removeIf(d -> d.getId().equals(id));
    }

    public void update(Dog updatedDog) {
        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getId().equals(updatedDog.getId())) {
                dogs.set(i, updatedDog);
                return;
            }
        }
    }
}
