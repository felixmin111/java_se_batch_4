package org.example.assigment.yuki.PetInformationFileSystem.Controller;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Cat;
import org.example.assigment.yuki.PetInformationFileSystem.Model.Pet;
import org.example.assigment.yuki.PetInformationFileSystem.Service.PetService;
import org.example.assigment.yuki.PetInformationFileSystem.View.PetView;

import javax.swing.text.View;
import java.util.Scanner;

public class MainController {
    private PetView view;
    private PetService service;
    private Scanner sc;
    public MainController(PetView view, PetService service) {
        this.view = view;
        this.service = service;
        sc = new Scanner(System.in);
    }

    public void start(){
        while(true){
            view.showMenu();
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    inputPet();
                    break;
                case 2:
//                    displayPet();
                    break;
                case 3:
                    System.out.println("Exiting...");
                case 4:
                    System.out.println("invalid option.");
            }
        }

    }

    public void inputPet(){
        view.showPetTypeMenu();
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
            String type = "Cat";
            System.out.print("Is it an indoor cat? (true/false): ");
            boolean isIndoor = sc.nextBoolean(); sc.nextLine();
            System.out.print("Enter fur length:(cm): ");
            double furLength = sc.nextDouble(); sc.nextLine();

            Cat cat = new Cat(id, name, age, type, color, isIndoor, furLength);
            service.savePet("cats.txt", cat.toString());
            view.showMessage("Pet saved successfully!");
        }

        if (typeChoice == 2){
            System.out.println("this is dog ");
        }

    }


}
