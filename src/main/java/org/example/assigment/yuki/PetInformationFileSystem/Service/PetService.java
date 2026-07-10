package org.example.assigment.yuki.PetInformationFileSystem.Service;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Cat;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Dog;

import java.util.ArrayList;
import java.util.List;

public class PetService {

    private static List<Cat> cats = new ArrayList<>();
    private static List<Dog> dogs = new ArrayList<>();

    public List<Cat> getCats(){
        return cats;
    }

    public List<Dog> getDogs(){
        return dogs;
    }

    public void saveCat(Cat cat){
        cats.add(cat);
    }

    public void saveDog(Dog dog){
        dogs.add(dog);
    }

    public void updateCat(Cat cat) {
    }
}

