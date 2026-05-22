package org.example.assigment.yuki.PetInformationFileSystem.Service;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Dog;

import org.example.assigment.yuki.PetInformationFileSystem.FileRepository.DogRepository;

import java.util.List;

public class DogService {

    private DogRepository repository;

    public DogService() {
        this.repository = new DogRepository();
    }

    public List<Dog> getAllDogs() {
        return repository.findAll();
    }

    public void saveDog(Dog dog) {
        repository.save(dog);
    }

    public void updateDog(Dog dog) {
        repository.update(dog);
    }

    public void deleteDogById(int id) {
        repository.deleteById(id);
    }

}
