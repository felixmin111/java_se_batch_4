package org.example.assigment.aung.petassignment.service;
import org.example.assigment.aung.petassignment.repository.DogDatabaseRepository;
import org.example.assigment.aung.petassignment.model.Dog;
import java.util.ArrayList;
import java.util.List;

public class DogService {
    private DogDatabaseRepository repo;
    public DogService() {
        this.repo = new DogDatabaseRepository();
    }

    public List<Dog> getAllDogs() {
        return repo.findAll();
    }
    public void save(Dog dog){
        repo.save(dog);
    }
    public void updateDog(Dog dog){
        repo.update(dog);
    }
    public void deleteDogById(String id) {
        repo.deleteById(id);
    }


}
