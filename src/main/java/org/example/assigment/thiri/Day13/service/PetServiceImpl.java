//package org.example.assigment.thiri.Day13.service;
//
//import org.example.assigment.thiri.Day13.model.Cat;
//import org.example.assigment.thiri.Day13.model.Dog;
//import org.example.assigment.thiri.Day13.model.Pet;
//import org.example.assigment.thiri.Day13.repository.CatFileRepository;
//import org.example.assigment.thiri.Day13.repository.DogFileRepository;
//import org.example.assigment.thiri.Day13.view.Menu;
//
//import java.util.ArrayList;
//import static org.example.assigment.thiri.Day13.view.Menu.sc;
//
//public class PetServiceImpl{
//    private final CatFileRepository catFileRepository = new CatFileRepository();
//    private final DogFileRepository dogFileRepository = new DogFileRepository();
//    String CAT_FILE = catFileRepository.getFilePath();
//    String DOG_FILE = dogFileRepository.getFilePath();
//
//    public void input(int input2) {
//
//        boolean condition1 = true;
//        int id = 0;
//        while(condition1) {
//            try {
//                System.out.print("Enter id: ");
//                id = Menu.sc.nextInt();
//                sc.nextLine();
//                condition1 = false;
//            } catch (Exception e) {
//                System.out.println("Invalid Input! Enter a number.");
//                sc.nextLine();
//            }
//        }
//
//        System.out.print("Enter name: ");
//        String name = sc.nextLine();
//
//        boolean condition2 = true;
//        int age = 0;
//
//        while(condition2) {
//            try {
//                System.out.print("Enter age: ");
//                age = Menu.sc.nextInt();
//                sc.nextLine();
//                condition2 = false;
//            } catch (Exception e) {
//                System.out.println("Invalid Input! Enter a number.");
//                sc.nextLine();
//            }
//        }
//
//        System.out.print("Enter color: ");
//        String color = sc.nextLine();
//
//        if (input2 == 1) {
//            boolean condition3 = true;
//            boolean indoor = false;
//            while(condition3) {
//                try {
//                    System.out.print("Is indoor (true/false): ");
//                    indoor = Menu.sc.nextBoolean();
//                    sc.nextLine();
//                    condition3 = false;
//                } catch (Exception e) {
//                    System.out.println("Invalid Input! Enter true or false.");
//                    sc.nextLine();
//                }
//            }
//
//            System.out.print("Enter fur length: ");
//            String len = sc.nextLine();
//
//            Cat cat = new Cat(id, name, age, color, Pet.PetType.CAT, indoor, len);
//            addCat(cat);
//            System.out.println("Cat data saved successfully!!!");
//
//        } else if (input2 == 2) {
//            System.out.print("Enter breed: ");
//            String breed = sc.nextLine();
//
//            boolean trained = false;
//            boolean condition4 = true;
//            while(condition4) {
//                try {
//                    System.out.print("Is trained (true/false): ");
//                    trained = Menu.sc.nextBoolean();
//                    sc.nextLine();
//                    condition4 = false;
//                } catch (Exception e) {
//                    System.out.println("Invalid Input! Enter true or false.");
//                    sc.nextLine();
//                }
//            }
//
//            Dog dog = new Dog(id, name, age, color, Pet.PetType.DOG, breed, trained);
//            addDog(dog);
//            System.out.println("Dog data saved successfully!!!");
//        }
//    }
//
//    public void addCat(Cat newCat) {
//
//        ArrayList<Cat> cats = catFileRepository.loadFromFile(CAT_FILE);
//        cats.add(newCat);
//
//        // Save all cats back to file
//        catFileRepository.saveCollectionToFile(CAT_FILE, cats);
//    }
//
//    public void addDog(Dog newDog) {
//
//        ArrayList<Dog> dogs = dogFileRepository.loadFromFile(DOG_FILE);
//        dogs.add(newDog);
//
//        dogFileRepository.saveCollectionToFile(DOG_FILE, dogs);
//    }
//
//
//    public void display(int input2) {
//        if (input2 == 1) {
//            displayCats();
//        } else if (input2 == 2) {
//            displayDogs();
//        }
//    }
//
//    private void displayCats() {
//        ArrayList<Cat> cats = catFileRepository.loadFromFile(CAT_FILE);
//
//        if (cats.isEmpty()) {
//            System.out.println("\nNo cat data available.");
//            return;
//        }
//
//        System.out.println("\n------ Cat List ------");
//        for (Cat cat : cats) {
//            System.out.println("ID: " + cat.getId());
//            System.out.println("Name: " + cat.getName());
//            System.out.println("Age: " + cat.getAge());
//            System.out.println("Type: " + cat.getType().getType());
//            System.out.println("Color: " + cat.getColor());
//            System.out.println("Indoor: " + cat.isIndoor());
//            System.out.println("Fur Length: " + cat.getLength());
//            System.out.println("---------------------");
//        }
//    }
//
//    private void displayDogs() {
//        ArrayList<Dog> dogs = dogFileRepository.loadFromFile(DOG_FILE);
//
//        if (dogs.isEmpty()) {
//            System.out.println("\nNo dog data available.");
//            return;
//        }
//
//        System.out.println("\n------ Dog List ------");
//        for (Dog dog : dogs) {
//            System.out.println("ID: " + dog.getId());
//            System.out.println("Name: " + dog.getName());
//            System.out.println("Age: " + dog.getAge());
//            System.out.println("Type: " + dog.getType().getType());
//            System.out.println("Color: " + dog.getColor());
//            System.out.println("Breed: " + dog.getBreed());
//            System.out.println("Trained: " + dog.isTrained());
//            System.out.println("---------------------");
//        }
//    }
//
//    public boolean exit() {
//        boolean condition = false;
//        System.out.println("Exiting system. Goodbye!");
//        return condition;
//    }
//}