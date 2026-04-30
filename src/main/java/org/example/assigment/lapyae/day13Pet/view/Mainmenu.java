package org.example.assigment.lapyae.day13Pet.view;
import java.util.ArrayList;
import java.util.Scanner;
import org.example.assigment.lapyae.day13Pet.model.Cat;
import org.example.assigment.lapyae.day13Pet.model.Dog;
import org.example.assigment.lapyae.day13Pet.model.Pet;

public class Mainmenu {

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
        System.out.print("Enter id: "); String id = scanner.nextLine();
        System.out.print("Enter name: "); String name = scanner.nextLine();
        System.out.print("Enter age: "); int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter color: "); String color = scanner.nextLine();
        System.out.print("Is indoor cat (true/false): "); boolean isIndoor = Boolean.parseBoolean(scanner.nextLine());
        System.out.print("Enter fur length (LONG, MEDIUM, SHORT): ");
        String furInput = scanner.nextLine().toUpperCase();
        return new Cat(id, name, age, Pet.Type.CAT, color, isIndoor, Cat.FurLength.valueOf(furInput));
    }

    public Dog getDogInput() {
        System.out.println("<<<Dog Data Registration>>>");
        System.out.print("Enter id: "); String id = scanner.nextLine();
        System.out.print("Enter name: "); String name = scanner.nextLine();
        System.out.print("Enter age: "); int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter color: "); String color = scanner.nextLine();
        System.out.print("Enter breed: "); String breed = scanner.nextLine();
        System.out.print("Is trained dog (true/false): "); boolean isTrained = Boolean.parseBoolean(scanner.nextLine());
        return new Dog(id, name, age, Pet.Type.DOG, color, breed, isTrained);
    }

    public void displayPets(ArrayList<Cat> cats, ArrayList<Dog> dogs) {
        System.out.println("\n---Pet List---");
        for (Cat cat : cats) System.out.println(cat.toString());
        for (Dog dog : dogs) System.out.println(dog.toString());
        if(cats.isEmpty() && dogs.isEmpty()) System.out.println("No records found.");
    }
}