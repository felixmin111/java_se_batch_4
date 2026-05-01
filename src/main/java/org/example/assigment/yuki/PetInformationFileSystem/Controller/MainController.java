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
    private final String DATA_PATH =
            "src/main/java/org/example/assigment/yuki/PetInformationFileSystem/data/";


    public MainController(PetView view, PetService service) {
        this.view = view;
        this.service = service;
        sc = new Scanner(System.in);
        view.setDataPath(DATA_PATH);
    }

    public void start(){
        while(true){
            view.showMenu();
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    view.inputPet();
                    break;
                case 2:
                    view.displayPets();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("invalid option.");
            }
        }

    }




}
