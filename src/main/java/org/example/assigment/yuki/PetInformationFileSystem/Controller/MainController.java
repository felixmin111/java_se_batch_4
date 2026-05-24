package org.example.assigment.yuki.PetInformationFileSystem.Controller;
import org.example.assigment.yuki.PetInformationFileSystem.Service.CatService;
import org.example.assigment.yuki.PetInformationFileSystem.Service.DogService;
import org.example.assigment.yuki.PetInformationFileSystem.View.CatView;
import org.example.assigment.yuki.PetInformationFileSystem.View.DogView;
import org.example.assigment.yuki.PetInformationFileSystem.View.MainView;
public class MainController {

    private MainView mainFrame;

    public MainController(MainView mainFrame) {
        this.mainFrame = mainFrame;

        mainFrame.catMenuItem.addActionListener(e -> showCatPage());
        mainFrame.dogMenuItem.addActionListener(e -> showDogPage());
    }

    public void showCatPage(){
        CatView view = new CatView();
        CatService service = new CatService();

        new CatController(service, view);

        mainFrame.setView(view.panel);
    }

    public void showDogPage(){
        DogView view = new DogView();
        DogService service = new DogService();

        new DogController(service, view);

        mainFrame.setView(view.panel);
    }
}
