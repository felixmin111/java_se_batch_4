package org.example.assigment.lapyae.day13Pet.data;

import org.example.assigment.lapyae.day13Pet.model.Dog;
import org.example.assigment.lapyae.day13Pet.model.Pet;

public class DogfileRepository extends GenericfileRepository<Dog> {
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
