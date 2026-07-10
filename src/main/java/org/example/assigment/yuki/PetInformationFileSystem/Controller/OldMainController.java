//package org.example.assigment.yuki.PetInformationFileSystem.Controller;

//public class OldMainController {
//    private PetMenu view;
//    private PetService service;
//    private Scanner sc;
//    private final String DATA_PATH =
//            "src/MainProgram/java/org/example/assigment/yuki/PetInformationFileSystem/data/";
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
