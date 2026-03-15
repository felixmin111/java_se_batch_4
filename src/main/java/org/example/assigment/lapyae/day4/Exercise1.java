package org.example.assigment.lapyae.day4;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Subject 1 mark : ");
        int m1 = scanner.nextInt();

        System.out.print("Enter Subject 2 mark : ");
        int m2 = scanner.nextInt();

        System.out.print("Enter Subject 3 mark : ");
        int m3 = scanner.nextInt();

        System.out.print("Enter Subject 4 mark : ");
        int m4 = scanner.nextInt();

        System.out.print("Enter Subject 5 mark : ");
        int m5 = scanner.nextInt();

        System.out.println();

        if (m1 >= 80)
            System.out.println("Grade Subject 1 :A");
        else if (m1 >= 70)
            System.out.println("Grade Subject 1 :B");
        else if (m1 >= 60)
            System.out.println("Grade Subject 1 :C");
        else if (m1 >= 50)
            System.out.println("Grade Subject 1 :D");
        else
            System.out.println("Grade Subject 1 :E");


        if (m2 >= 80)
            System.out.println("Grade Subject 2 :A");
        else if (m2 >= 70)
            System.out.println("Grade Subject 2 :B");
        else if (m2 >= 60)
            System.out.println("Grade Subject 2 :C");
        else if (m2 >= 50)
            System.out.println("Grade Subject 2 :D");
        else
            System.out.println("Grade Subject 2 :E");


        if (m3 >= 80)
            System.out.println("Grade Subject 3 :A");
        else if (m3 >= 70)
            System.out.println("Grade Subject 3 :B");
        else if (m3 >= 60)
            System.out.println("Grade Subject 3 :C");
        else if (m3 >= 50)
            System.out.println("Grade Subject 3 :D");
        else
            System.out.println("Grade Subject 3 :E");


        if (m4 >= 80)
            System.out.println("Grade Subject 4 :A");
        else if (m4 >= 70)
            System.out.println("Grade Subject 4 :B");
        else if (m4 >= 60)
            System.out.println("Grade Subject 4 :C");
        else if (m4 >= 50)
            System.out.println("Grade Subject 4 :D");
        else
            System.out.println("Grade Subject 4 :E");


        if (m5 >= 80)
            System.out.println("Grade Subject 5 :A");
        else if (m5 >= 70)
            System.out.println("Grade Subject 5 :B");
        else if (m5 >= 60)
            System.out.println("Grade Subject 5 :C");
        else if (m5 >= 50)
            System.out.println("Grade Subject 5 :D");
        else
            System.out.println("Grade Subject 5 :E");

        scanner.close();
    }
}
