package org.example.assigment.yuki.PetInformationFileSystem.FileRepository;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Dog;
public class DogFileRepository extends GenericFileRepository<Dog> {

    @Override
    public Dog parser(String[] data){
        return new Dog(
                Integer.parseInt(data[0]),
                data[1],
                Integer.parseInt(data[2]),
                data[4],
                data[5],
                Boolean.parseBoolean(data[6])
        );
    }
}
