package org.example.assigment.aung.zoo;

import org.example.assigment.aung.zoo.model.Animal;
import org.example.assigment.aung.zoo.repo.*;

import java.sql.SQLException;

public class Main {
    //name, age, owner_name, weight, tame
    public static void main(String[] args) {
        AnimalRepo animalRepo = new AnimalRepo();
        animalRepo.getAllAnimals();
    }
}
