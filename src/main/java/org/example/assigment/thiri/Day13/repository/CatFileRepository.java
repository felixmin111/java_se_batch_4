package org.example.assigment.thiri.Day13.repository;

import org.example.assigment.thiri.Day13.model.Cat;
import org.example.assigment.thiri.Day13.model.Pet;

public class CatFileRepository extends PetGenericFileRepository<Cat> {
    private static final String FILE_PATH = "src/main/java/org/example/assigment/thiri/Day13/dataFile/cats.txt";

    public String getFilePath() {
        return FILE_PATH;
    }

    @Override
    public Cat parser(String[] data) {
        return new Cat(
                Integer.parseInt(data[0]),
                data[1],
                Integer.parseInt(data[2]),
                data[3],
                Pet.PetType.valueOf(data[4]),
                Boolean.parseBoolean(data[5]),
                data[6]
        );
    }
}