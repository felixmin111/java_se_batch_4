package org.example.assigment.thiri.Day13.service;

import org.example.assigment.thiri.Day13.model.Cat;
import org.example.assigment.thiri.Day13.model.Dog;
import org.example.assigment.thiri.Day13.model.Pet;
import org.example.assigment.thiri.Day13.repository.CatFileRepository;
import org.example.assigment.thiri.Day13.repository.DogFileRepository;

import java.util.ArrayList;
import static org.example.assigment.thiri.Day13.view.Menu.sc;

public class PetServiceImpl implements PetService {
    private final CatFileRepository catFileRepository = new CatFileRepository();
    private final DogFileRepository dogFileRepository = new DogFileRepository();
    String CAT_FILE = catFileRepository.getFilePath();
    String DOG_FILE = dogFileRepository.getFilePath();

    @Override
    public void input(int input2) {

        System.out.print("Enter id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter color: ");
        String color = sc.nextLine();

        if (input2 == 1) {
            System.out.print("Is indoor (true/false): ");
            boolean indoor = sc.nextBoolean();
            sc.nextLine();

            System.out.print("Enter fur length: ");
            String len = sc.nextLine();

            Cat cat = new Cat(id, name, age, color, Pet.PetType.CAT, indoor, len);
            addCat(cat);
            System.out.println("Cat data saved successfully!!!");

        } else if (input2 == 2) {
            System.out.print("Enter breed: ");
            String breed = sc.nextLine();

            System.out.print("Is trained (true/false): ");
            boolean trained = sc.nextBoolean();
            sc.nextLine();

            Dog dog = new Dog(id, name, age, color, Pet.PetType.DOG, breed, trained);
            addDog(dog);
            System.out.println("Dog data saved successfully!!!");
        }
    }

    public void addCat(Cat newCat) {

        ArrayList<Cat> cats = catFileRepository.loadFromFile(CAT_FILE);
        cats.add(newCat);

        // Save all cats back to file
        catFileRepository.saveCollectionToFile(CAT_FILE, cats);
    }

    public void addDog(Dog newDog) {

        ArrayList<Dog> dogs = dogFileRepository.loadFromFile(DOG_FILE);
        dogs.add(newDog);

        dogFileRepository.saveCollectionToFile(DOG_FILE, dogs);
    }

    @Override
    public void display(int input2) {
        if (input2 == 1) {
            displayCats();
        } else if (input2 == 2) {
            displayDogs();
        }
    }

    private void displayCats() {
        ArrayList<Cat> cats = catFileRepository.loadFromFile(CAT_FILE);

        if (cats.isEmpty()) {
            System.out.println("\nNo cat data available.");
            return;
        }

        System.out.println("\n------ Cat List ------");
        for (Cat cat : cats) {
            System.out.println("ID: " + cat.getId());
            System.out.println("Name: " + cat.getName());
            System.out.println("Age: " + cat.getAge());
            System.out.println("Type: " + cat.getType().getType());
            System.out.println("Color: " + cat.getColor());
            System.out.println("Indoor: " + cat.isIndoor());
            System.out.println("Fur Length: " + cat.getLength());
            System.out.println("---------------------");
        }
    }

    private void displayDogs() {
        ArrayList<Dog> dogs = dogFileRepository.loadFromFile(DOG_FILE);

        if (dogs.isEmpty()) {
            System.out.println("\nNo dog data available.");
            return;
        }

        System.out.println("\n------ Dog List ------");
        for (Dog dog : dogs) {
            System.out.println("ID: " + dog.getId());
            System.out.println("Name: " + dog.getName());
            System.out.println("Age: " + dog.getAge());
            System.out.println("Type: " + dog.getType().getType());
            System.out.println("Color: " + dog.getColor());
            System.out.println("Breed: " + dog.getBreed());
            System.out.println("Trained: " + dog.isTrained());
            System.out.println("---------------------");
        }
    }

    @Override
    public boolean exit() {
        boolean condition = false;
        System.out.println("Exiting system. Goodbye!");
        return condition;
    }
}