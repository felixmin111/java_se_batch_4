package org.example.assigment.yuki.PetInformationFileSystem;


import org.example.assigment.yuki.PetInformationFileSystem.Controller.MainController;
import org.example.assigment.yuki.PetInformationFileSystem.Service.PetService;
import org.example.assigment.yuki.PetInformationFileSystem.View.PetView;

public class MainApp {
    public static void main(String[] args) {
        PetView view = new PetView();
        PetService service = new PetService();
        MainController controller = new MainController(view, service);
        controller.start();

    }
}
