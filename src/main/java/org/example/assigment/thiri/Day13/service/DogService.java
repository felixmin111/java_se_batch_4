package org.example.assigment.thiri.Day13.service;

import org.example.assigment.thiri.Day13.model.Dog;
import org.example.assigment.thiri.Day13.model.Pet;
import org.example.assigment.thiri.Day13.view.DogDisplayView; // You'll need this view

import java.util.ArrayList;
import java.util.List;

public class DogService {
    // Static list to persist Dog data
    private static List<Dog> dogs = new ArrayList<>();

    static {
        // Initial sample data for Dogs
        dogs.add(new Dog(1, "Lucky", 3, "Golden", Pet.PetType.DOG, "Golden Retriever", true));
        dogs.add(new Dog(2, "Rocky", 5, "Black", Pet.PetType.DOG, "German Shepherd", false));
        dogs.add(new Dog(3, "Mochi", 2, "White", Pet.PetType.DOG, "Poodle", false));
    }

    public static List<Dog> getDogs() {
        return dogs;
    }

    public static void saveDogData(int id, String name, int age, String breed, String isTrainedStr) {
        boolean isTrained = isTrainedStr.equalsIgnoreCase("yes");
        Dog newDog = new Dog(id, name, age, "Unknown", Pet.PetType.DOG, breed, isTrained);
        dogs.add(newDog);
        System.out.println("Dog Service: Model created and saved.");
    }

    public void loadData() {
        DogDisplayView.model.setRowCount(0);

        List<Dog> dogList = DogService.getDogs();

        for (Dog dog : dogList) {
            DogDisplayView.model.addRow(new Object[]{
                    dog.getId(),
                    dog.getName(),
                    dog.getAge(),
                    dog.getBreed(),
                    dog.isTrained() ? "Yes" : "No"
            });
        }
    }
}