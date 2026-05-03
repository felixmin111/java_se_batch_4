package org.example.assigment.yuki.PetInformationFileSystem.Service;
import org.example.assigment.yuki.PetInformationFileSystem.FileRepository.CatFileRepository;
import org.example.assigment.yuki.PetInformationFileSystem.FileRepository.DogFileRepository;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Cat;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Dog;
import java.io.*;
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
}
//public class PetService {
//    private CatFileRepository catRepo;
//    private DogFileRepository dogRepo;
//    public PetService() {
//        catRepo = new CatFileRepository();
//        dogRepo = new DogFileRepository();
//    }
//
//    public void saveCat(String path, Cat cat){
//        catRepo.saveToFile(path, new Cat[]{cat});
//    }
//
//    public void saveDog(String path, Dog dog){
//        dogRepo.saveToFile(path, new Dog[]{dog});
//    }
//
//    public List<Cat> getCats(String path){
//        return catRepo.loadFromFile(path);
//    }
//
//    public List<Dog> getDogs(String path){
//        return dogRepo.loadFromFile(path);
//
//    }
//

//}
