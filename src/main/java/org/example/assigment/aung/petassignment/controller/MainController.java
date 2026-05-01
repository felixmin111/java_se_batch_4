package org.example.assigment.aung.petassignment.controller;

import org.example.assigment.aung.petassignment.model.Cat;
import org.example.assigment.aung.petassignment.model.Dog;
import org.example.assigment.aung.petassignment.service.CatService;
import org.example.assigment.aung.petassignment.service.DogService;
import org.example.assigment.aung.petassignment.view.MainMenu;

import java.util.ArrayList;

public class MainController {
    private MainMenu view = new MainMenu();
    private CatService catService = new CatService();
    private DogService dogService = new DogService();

    public void start() {
        while (true) {
            int choice = view.displayMainMenu();

            switch (choice) {
                case 1:
                    handleInput();
                    break;
                case 2:
                    handleDisplay();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private void handleInput() {
        int typeChoice = view.petTypeMenu();

        switch (typeChoice) {
            case 1:
                Cat newCat = view.getCatInput();
                catService.saveCat(newCat);
                break;
            case 2:
                Dog newDog = view.getDogInput();
                dogService.saveDog(newDog);
                break;
            default:
                System.out.println("Invalid pet type.");
        }
    }

    private void handleDisplay() {
        ArrayList<Cat> loadedCats = catService.getAllCats();
        ArrayList<Dog> loadedDogs = dogService.getAllDogs();

        view.displayPets(loadedCats, loadedDogs);
    }
}