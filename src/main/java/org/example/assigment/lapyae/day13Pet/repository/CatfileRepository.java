package org.example.assigment.lapyae.day13Pet.repository;

import org.example.assigment.lapyae.day13Pet.model.Cat;
import org.example.assigment.lapyae.day13Pet.model.Pet;

public class CatfileRepository extends GenericfileRepository<Cat> {
    @Override
    public Cat parser(String[] data) {
        return new Cat(
                data[0], data[1], Integer.parseInt(data[2]),
                Pet.Type.valueOf(data[3]), data[4],
                Boolean.parseBoolean(data[5]),
                Cat.FurLength.valueOf(data[6])
        );
    }
}
