package org.example.assigment.aung.petassignment.view;

import org.example.assigment.aung.petassignment.model.Cat;
import org.example.assigment.aung.petassignment.model.Dog;
import org.example.assigment.aung.petassignment.model.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    private Scanner scanner = new Scanner(System.in);

    public int displayMainMenu() {
        System.out.println("\nChoose the Menu to manage Pet Data");
        System.out.println("1. Input Pet Data");
        System.out.println("2. Display Pet Data");
        System.out.println("3. Exit");
        System.out.print("Choose option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public int petTypeMenu() {
        System.out.println("Choose pet type to input data:");
        System.out.println("1. Cat");
        System.out.println("2. Dog");
        System.out.print("Choose type: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    public Cat getCatInput() {
        System.out.println("<<<Cat Data Registration>>>");

        System.out.print("Enter id: ");
        String id = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Is indoor cat: ");
        boolean isIndoor = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("Enter fur length (LONG, MEDIUM, SHORT): ");
        String furInput = scanner.nextLine().toUpperCase();
        Cat.Furlength furLength = Cat.Furlength.valueOf(furInput);

        System.out.println("Cat data saved successfully.!!!");

        return new Cat(id, name, age, Pet.Type.CAT, color, isIndoor, furLength);
    }

    public Dog getDogInput() {
        System.out.println("<<<Dog Data Registration>>>");

        System.out.print("Enter id: ");
        String id = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        System.out.print("Enter breed: ");
        String breed = scanner.nextLine();

        System.out.print("Is trained dog: ");
        boolean isTrained = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Dog data saved successfully.!!!");

        return new Dog(id, name, age, Pet.Type.DOG, color, breed, isTrained);
    }

    public void displayPets(ArrayList<Cat> cats, ArrayList<Dog> dogs) {
        System.out.println("\n---Pet List---");
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }
    }
}