package org.example.assigment.aung.petassignment.repository;

import org.example.assigment.aung.petassignment.model.Dog;
import org.example.assigment.aung.petassignment.model.Pet;

public class DogFileRepository extends GenericFileRepository<Dog> {

    @Override
    public Dog parser(String[] data) {
        return new Dog(
                data[0],
                data[1],
                Integer.parseInt(data[2]),
                Pet.Type.valueOf(data[3]),
                data[4],
                data[5],
                Boolean.parseBoolean(data[6])
        );
    }
}