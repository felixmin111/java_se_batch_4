package org.example.assigment.yuki.PetInformationFileSystem.Controller;
import org.example.assigment.yuki.PetInformationFileSystem.Service.PetService;
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
        PetService service = new PetService();

        new CatController(service, view);

        mainFrame.setView(view.panel);
    }

    public void showDogPage(){
        DogView view = new DogView();
        PetService service = new PetService();

        new DogController(service, view);

        mainFrame.setView(view.panel);
    }
}

//public class MainController {
//    private PetMenu view;
//    private PetService service;
//    private Scanner sc;
//    private final String DATA_PATH =
//            "src/main/java/org/example/assigment/yuki/PetInformationFileSystem/data/";
//    private final String CAT_FILE = DATA_PATH + "cat.txt";
//    private final String DOG_FILE = DATA_PATH + "dog.txt";
//
//
//    public MainController(PetMenu view, PetService service) {
//        this.view = view;
//        this.service = service;
//        sc = new Scanner(System.in);
//    }
//
//    public MainController(MainView frame) {
//        this.view = new PetMenu();
//    }
//
//    public void start(){
//        while(true){
//            view.showMenu();
//            int choice = sc.nextInt();
//            switch (choice){
//                case 1:
//                    Pet pet = view.inputPet();
//                    if (pet != null) {
//                        if (pet instanceof Cat) {
//                            service.saveCat(CAT_FILE, (Cat) pet);
//                        } else if (pet instanceof Dog) {
//                            service.saveDog(DOG_FILE, (Dog) pet);
//                        }
//                        view.showMessage("Pet saved successfully!");
//                    }
//                    break;
//                case 2:
//                    List<Cat> cats = service.getCats(CAT_FILE);
//                    List<Dog> dogs = service.getDogs(DOG_FILE);
//                    view.displayCats(cats);
//                    view.displayDogs(dogs);
//                    break;
//                case 3:
//                    System.out.println("Exiting...");
//                    return;
//                default:
//                    System.out.println("invalid option.");
//            }
//        }
//
//    }
//
//
//
//
//}
