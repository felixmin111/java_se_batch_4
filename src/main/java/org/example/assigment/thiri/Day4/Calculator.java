package org.example.assigment.thiri.Day4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        float N1 = sc.nextFloat();

        System.out.println("Enter Number 2: ");
        float N2 = sc.nextFloat();


        System.out.println("Choose Process");
        System.out.println("Process 1: ADD");
        System.out.println("Process 2: Substraction");
        System.out.println("Process 3: Multiply");
        System.out.println("Process 4: Division");
        System.out.println("Enter Process No: ");
        int process = sc.nextInt();

        System.out.println("Result: " + maths(N1, N2, process));
    }

    public static float maths(float num1, float num2, int process) {
        if (process == 1) {
            return num1 + num2;
        } else if (process == 2) {
            return num1 - num2;
        } else if (process == 3) {
            return num1 * num2;
        } else if (process == 4) {
            return num1 / num2;
        } else {
            System.out.println("Invalid Process");
            return 0;
        }
    }
}
