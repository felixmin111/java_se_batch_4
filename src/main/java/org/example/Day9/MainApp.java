package org.example.Day9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner =null;
        String admin="Felix";
        int adminAge=25;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Please enter name: ");
            String name = scanner.nextLine();
            System.out.println("Please enter age: ");
            int age = scanner.nextInt();

            if (name.equals(admin)&&age==adminAge) {
                System.out.println("You are admin..You can do next step!");
            }else {
                throw new UserNotFoundException("You are not admin");
            }
            System.out.println("1. Create User");
            System.out.println("2. Delete User");


        }catch (InputMismatchException | IllegalArgumentException e){
            System.out.println("Please enter a number in age..!");
        }finally {
            System.out.println("Goodbye! I am closing the scanner--!");
            scanner.close();
        }

    }

}
