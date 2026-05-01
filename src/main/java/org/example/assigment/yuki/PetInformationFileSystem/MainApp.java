package org.example.assigment.yuki.PetInformationFileSystem;


import org.example.assigment.yuki.PetInformationFileSystem.Controller.MainController;
import org.example.assigment.yuki.PetInformationFileSystem.Service.PetService;
import org.example.assigment.yuki.PetInformationFileSystem.View.PetView;

public class MainApp {
    public static void main(String[] args) {
        PetService service = new PetService();
        PetView view = new PetView(service);
        MainController controller = new MainController(view, service);
        controller.start();

    }
}
