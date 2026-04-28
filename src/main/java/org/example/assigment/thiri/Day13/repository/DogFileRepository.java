package org.example.assigment.thiri.Day13.repository;

import org.example.assigment.thiri.Day13.model.Dog;
import org.example.assigment.thiri.Day13.model.Pet;


public class DogFileRepository extends PetGenericFileRepository<Dog> {
    private static final String FILE_PATH = "src/main/java/org/example/assigment/thiri/Day13/dataFile/dogs.txt";

    public String getFilePath() {
        return FILE_PATH;
    }

        @Override
        public Dog parser(String[] data) {
            return new Dog(

                    Integer.parseInt(data[0]),
                    data[1],
                    Integer.parseInt(data[2]),
                    data[3],
                    Pet.PetType.valueOf(data[4]),
                    data[5],
                    Boolean.parseBoolean(data[6])
            );
        }
    }