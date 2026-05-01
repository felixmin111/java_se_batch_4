package org.example.assigment.aung.petassignment;

import org.example.assigment.aung.petassignment.controller.MainController;
import org.example.assigment.aung.petassignment.controller.SwingController;
import org.example.assigment.aung.petassignment.service.CatService;
import org.example.assigment.aung.petassignment.view.CatView;

public class Mainapp {
    public static void main(String[] args) {


        CatView catView = new CatView();
        CatService catService = new CatService();
        new SwingController(catView, catService);
        catView.show();
    }
}
