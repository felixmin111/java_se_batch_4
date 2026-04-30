package org.example.assigment.yuki.PetInformationFileSystem.View;

public class PetView {

        public void showMenu(){
            System.out.println("Choose Options below:");
            System.out.println("To input pet data: choose 1 ");
            System.out.println("To display pet data: choose 2 ");
            System.out.println("To exit: choose 3");
            System.out.print("Enter your choice: ");

        }

        public void showPetTypeMenu(){
            System.out.println("Choose Pet Type:");
            System.out.println("1. Cat");
            System.out.println("2. Dog");
        }

        public void showMessage(String message){
            System.out.println(message);
        }

//        public void showPet(String petData){
//            System.out.println(petData);
//        }


    }

