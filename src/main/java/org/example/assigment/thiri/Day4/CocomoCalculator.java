package org.example.assigment.thiri.Day4;

import java.util.Scanner;

public class CocomoCalculator {
    public static void main(String[] args) {
        askingInput();
    }

    public static void askingInput() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Code Line: ");
        float num = sc.nextFloat();

        System.out.println("Choose Project Type");
        System.out.println("1. Organic");
        System.out.println("2. Semi-Detached");
        System.out.println("3. Embedded");

        System.out.println("Enter Project Type No: ");
        int type = sc.nextInt();

        cocomo(num, type);

        sc.close();
    }

    public static void cocomo(float num, int type) {
        double effort;
        double time;
        double kloc = num / 1000;

        if (type == 1) {
            effort = 2.4 * Math.pow(kloc, 1.05);
            time = 2.5 * Math.pow(effort, 0.38);
        } else if (type == 2) {
            effort = 2.4 * Math.pow(kloc, 1.05);
            time = 2.5 * Math.pow(effort, 0.38);
        } else if (type == 3) {
            effort = 2.4 * Math.pow(kloc, 1.05);
            time = 2.5 * Math.pow(effort, 0.38);
        } else {
            System.out.println("Enter Valid Input");
            return;
        }

        float people = (float) (effort / time);


        System.out.println("Effort (Person-Month): "+ effort);
        System.out.println("Time (Months): "+ time);
        System.out.println("People Required: "+ people);

    }
}


