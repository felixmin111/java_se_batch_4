package org.example.assigment.yuki.PetInformationFileSystem.FileRepository;

import org.example.assigment.yuki.PetInformationFileSystem.Model.Cat;

public class CatFileRepository extends GenericFileRepository<Cat>{
    @Override
    public Cat parser(String[] data){
        return new Cat(
                Integer.parseInt(data[0]),
                data[1],
                Integer.parseInt(data[2]),
                data[4],
                Boolean.parseBoolean(data[5]),
                Double.parseDouble(data[6])
        );

    }
}
