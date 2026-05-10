package org.example.assigment.lapyae.day13Pet.service;

import org.example.assigment.lapyae.day13Pet.model.Dog;
import org.example.assigment.lapyae.day13Pet.repository.DogDBRepo;
import java.util.List;

public class DogService {
    private DogDBRepo repo = new DogDBRepo();

    public void addDog(Dog dog) {
        repo.save(dog);
    }

    public List<Dog> getAllDogs() {
        return repo.findAll();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }

    public void update(Dog updatedDog) {
        repo.update(updatedDog);
    }
}
