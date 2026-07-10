package org.example.assigment.yuki.PetInformationFileSystem.Service;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Cat;
import org.example.assigment.yuki.PetInformationFileSystem.FileRepository.CatRepository;

import java.util.List;

public class CatService {

    private CatRepository repository;

    public CatService() {
        this.repository = new CatRepository();
    }

    public List<Cat> getAllCats() {
        return repository.findAll();
    }

    public void saveCat(Cat cat) {
        repository.save(cat);
    }

    public void updateCat(Cat cat) {
        repository.update(cat);
    }

    public void deleteCatById(int id) {
        repository.deleteById(id);
    }

}
