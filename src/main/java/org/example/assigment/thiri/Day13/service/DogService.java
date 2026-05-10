package org.example.assigment.thiri.Day13.service;

import org.example.assigment.thiri.Day13.model.Cat;
import org.example.assigment.thiri.Day13.model.Dog;
import org.example.assigment.thiri.Day13.model.Pet;
import org.example.assigment.thiri.Day13.repository.DogRepository;

import java.util.ArrayList;
import java.util.List;

public class DogService {
    // Static list to persist Dog data
    private static List<Dog> dogs = new ArrayList<>();
    private static DogRepository dogRepository = new DogRepository();

    static {
        // Initial sample data for Dogs
        dogs.add(new Dog(1, "Lucky", 3, "Golden", Pet.PetType.DOG, "Golden Retriever", true));
        dogs.add(new Dog(2, "Rocky", 5, "Black", Pet.PetType.DOG, "German Shepherd", false));
        dogs.add(new Dog(3, "Mochi", 2, "White", Pet.PetType.DOG, "Poodle", false));
    }

    public DogService() {this.dogRepository = new DogRepository();}

    public  List<Dog> getDogs() {
        return dogRepository.findAll();
    }

    public  void saveDog(Dog dog) {
        dogRepository.save(dog);
    }

    public void updateDog(Dog dog) {

        dogRepository.update(dog);
    }

    public Dog getDogById(int id) {
        for (Dog dog : dogs) {
            if(dog.getId() == id) {
                return dog;
            }
        }
        return null;
    }

    public void deleteDog(int id) {
        dogRepository.deleteById(id);
    }

}
