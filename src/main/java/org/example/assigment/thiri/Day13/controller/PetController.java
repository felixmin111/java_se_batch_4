//package org.example.assigment.thiri.Day13.controller;
//
//import org.example.assigment.thiri.Day13.service.PetServiceImpl;
//import org.example.assigment.thiri.Day13.view.Menu;
//
//public class PetController {
//
//    public void start() {
//        Menu menu = new Menu();
//        PetServiceImpl serviceImpl = new PetServiceImpl();
//        boolean condition = true;
//
//        while (condition) {
//            int input1 = Menu.displayMenu();
//            int input2;
//
//            switch (input1) {
//                case 1:
//                    input2 = Menu.displayType();
//                    serviceImpl.input(input2);
//                    break;
//                case 2:
//                    input2 = Menu.displayType();
//                    serviceImpl.display(input2);
//                    break;
//                case 3:
//                    condition = serviceImpl.exit();
//                    break;
//                default:
//                    System.out.println("Invalid Option. Please Try Again!");
//            }
//        }
//    }
//}
//
