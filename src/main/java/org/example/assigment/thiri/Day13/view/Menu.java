package org.example.assigment.thiri.Day13.view;

import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);

    public static int displayMenu() {
        int input1 = 0;
        boolean condition = true;

        System.out.println("=".repeat(40));
        System.out.println("Choose the Menu to manage Pet Data");
        System.out.println("=".repeat(40));
        System.out.println("""
                1. Input Pet Data
                2. Display Pet Data
                3. Exit""");
        System.out.println("=".repeat(40));

        while (condition) {
            try {
                System.out.print("Choose option: ");
                input1 = sc.nextInt();
                sc.nextLine();

                if (input1 >= 1 && input1 <= 3) {
                    condition = false;
                } else {
                    System.out.println("Error: Please enter a number between 1 and 3");
                }

            } catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter a number (1, 2, or 3)");
                sc.nextLine();
            }
        }
        return input1;
    }

    public static int displayType() {

        int input2 = 0;
        boolean condition = true;

        System.out.println("=".repeat(40));
        System.out.println("Choose pet type to input data");
        System.out.println("=".repeat(40));
        System.out.println("""
                1. Cat
                2. Dog""");
        System.out.println("=".repeat(40));

        while(condition){
            try {
                System.out.println("Choose type: ");
                input2 = sc.nextInt();
                sc.nextLine();

                if (input2 == 1 || input2 == 2) {
                    condition = false;
                } else {
                    System.out.println("Error: Please enter a number 1 or 2");
                }

            }catch (Exception e) {
                System.out.println("Error: Invalid input. Please enter a number (1 or 2)");
                sc.nextLine();
            }
        }
        return input2;
    }
}

