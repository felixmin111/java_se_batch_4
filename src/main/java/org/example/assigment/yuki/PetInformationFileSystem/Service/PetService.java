package org.example.assigment.yuki.PetInformationFileSystem.Service;
import org.example.assigment.yuki.PetInformationFileSystem.FileRepository.CatFileRepository;
import org.example.assigment.yuki.PetInformationFileSystem.FileRepository.DogFileRepository;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Cat;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Dog;
import java.io.*;
import java.util.List;

public class PetService {
    private CatFileRepository catRepo;
    private DogFileRepository dogRepo;
    public PetService() {
        catRepo = new CatFileRepository();
        dogRepo = new DogFileRepository();
    }

    public void saveCat(String path, Cat cat){
        catRepo.saveToFile(path, new Cat[]{cat});
    }

    public void saveDog(String path, Dog dog){
        dogRepo.saveToFile(path, new Dog[]{dog});
    }

    public List<Cat> getCats(String path){
        return catRepo.loadFromFile(path);
    }

    public List<Dog> getDogs(String path){
        return dogRepo.loadFromFile(path);

    }

//    public void savePet(String fileName, String data) {
//        try (FileWriter fw = new FileWriter(fileName, true)) {
//            fw.write(data + "\n");
//        } catch (IOException e) {
//            System.out.println("Error saving file.");
//        }
//
//    }
//
//    public List<String> readPets(String fileName) {
//        List<String> pets = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                pets.add(line);
//            }
//        } catch (IOException e) {
//            System.out.println("Error reading file.");
//        }
//        return pets;
//
//    }


}
