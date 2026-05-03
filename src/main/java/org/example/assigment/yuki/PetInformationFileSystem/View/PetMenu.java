package org.example.assigment.yuki.PetInformationFileSystem.View;

import org.example.assigment.yuki.PetInformationFileSystem.Model.Cat;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Dog;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Pet;

import java.util.List;
import java.util.Scanner;

public class PetMenu {
    Scanner sc = new Scanner(System.in);

    public Pet inputPet(){
        showPetTypeMenu();
        int typeChoice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter pet id: ");
        int id = sc.nextInt(); sc.nextLine();

        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt(); sc.nextLine();

        System.out.print("Enter pet color: ");
        String color = sc.nextLine();

        if (typeChoice == 1){
            System.out.print("Is it an indoor cat? (true/false): ");
            boolean isIndoor = sc.nextBoolean(); sc.nextLine();

            System.out.print("Enter fur length: ");
            double furLength = sc.nextDouble(); sc.nextLine();

            Cat cat = new Cat(id, name, age, color, isIndoor, furLength);
            return cat;

        } else if (typeChoice == 2){
            System.out.print("Enter breed: ");
            String breed = sc.nextLine();

            System.out.print("Is it trained? (true/false): ");
            boolean isTrained = sc.nextBoolean(); sc.nextLine();

            Dog dog = new Dog(id, name, age, color, breed, isTrained);
            return dog;
        }
        return null;
    }

    public void displayCats(List<Cat> cats){
        System.out.println("Cats:");
        cats.forEach(System.out::println);
    }

    public void displayDogs(List<Dog> dogs){
        System.out.println("Dogs:");
        dogs.forEach(System.out::println);
    }

    public void showMenu(){
        System.out.println("Choose Options below:");
        System.out.println("To input pet data: choose 1 ");
        System.out.println("To display pet data: choose 2 ");
        System.out.println("To exit: choose 3");
        System.out.print("Enter your choice: ");

    }

    public void showPetTypeMenu(){
        System.out.println("Choose Pet Type:");
        System.out.println("1. Cat");
        System.out.println("2. Dog");
    }

    public void showMessage(String message){
        System.out.println(message);
    }



}

