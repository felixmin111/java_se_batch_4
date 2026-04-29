package org.example.assigment.aung.petassignment.data;

import org.example.assigment.aung.petassignment.model.Cat;
import org.example.assigment.aung.petassignment.model.Pet;

public class CatFileRepository extends GenericFileRepository<Cat> {

    @Override
    public Cat parser(String[] data) {
        return new Cat(
                data[0],
                data[1],
                Integer.parseInt(data[2]),
                Pet.Type.valueOf(data[3]),
                data[4],
                Boolean.parseBoolean(data[5]),
                Cat.Furlength.valueOf(data[6])
        );
    }
}