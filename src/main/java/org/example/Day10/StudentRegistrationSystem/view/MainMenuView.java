package org.example.Day10.StudentRegistrationSystem.view;

import java.util.Scanner;

public class MainMenuView {
    public static Scanner scanner = new Scanner(System.in);
    public int displayMenu(){
        System.out.println("Choose the process you want to do\n"+
                "(1) Student Management\n" +
                "(2) Teacher Management\n"+
                "(3) Exit");
        int choose=scanner.nextInt();scanner.nextLine();
        return choose;
    }
}
