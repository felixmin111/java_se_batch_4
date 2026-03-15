package org.example.assigment.lapyae.day4;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Number 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter Number 2: ");
        int num2 = scanner.nextInt();

        System.out.println("Choose" + "\nProcess 1 Add");
        System.out.println("Process 2 Subtract");
        System.out.println("Process 3 Multiple");
        System.out.print("Process 4 Division"+"\nEnter your choice: ");

        int choice = scanner.nextInt();


        System.out.println("\nYour Number 1 is: " + num1);
        System.out.println("Your Number 2 is: " + num2);


        if (choice == 1) {
            System.out.println("1 For Add " + (num1 + num2));
        }
        else if (choice == 2) {
            System.out.println("2 For Subtract " + (num1 - num2));
        }
        else if (choice == 3) {
            System.out.println("3 For Multiple " + (num1 * num2));
        }
        else if (choice == 4) {
            if (num2 != 0) {
                System.out.println("4 For Division " + (num1 / (double)num2));
            } else {
                System.out.println("Error: Cannot divide by zero.");
            }
        }
        else {
            System.out.println("Invalid selection.");
        }

        scanner.close();
    }
}
