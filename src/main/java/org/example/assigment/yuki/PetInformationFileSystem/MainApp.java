package org.example.assigment.yuki.PetInformationFileSystem;
import org.example.assigment.yuki.PetInformationFileSystem.Controller.MainController;
import org.example.assigment.yuki.PetInformationFileSystem.View.MainView;

public class MainApp {
    public static void main(String[] args) {
//        PetService service = new PetService();
//        PetMenu view = new PetMenu();
//        MainController controller = new MainController(view, service);
//        controller.start();
//        MainView frame = new MainView();
//        new MainController(frame);
//        frame.show();
        MainView frame = new MainView();
        new MainController(frame);
        frame.show();

    }
}
