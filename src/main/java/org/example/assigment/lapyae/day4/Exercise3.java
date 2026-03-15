package org.example.assigment.lapyae.day4;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Number Of Code Line: ");
        double linesOfCode = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Project Type (Organic, Semi-Detached, Embedded): ");
        String projectType = scanner.nextLine();


        double kloc = linesOfCode / 1000.0;
        double effort = 0;
        double time = 0;


        if (projectType.equalsIgnoreCase("Organic")) {
            effort = 2.4 * Math.pow(kloc, 1.05);
            time = 2.5 * Math.pow(effort, 0.38);
        }
        else if (projectType.equalsIgnoreCase("Semi-Detached")) {
            effort = 3.0 * Math.pow(kloc, 1.12);
            time = 2.5 * Math.pow(effort, 0.35);
        }
        else if (projectType.equalsIgnoreCase("Embedded")) {
            effort = 3.6 * Math.pow(kloc, 1.20);
            time = 2.5 * Math.pow(effort, 0.32);
        }
        else {
            System.out.println("Invalid project type entered.");
            scanner.close();
            return;
        }


        double persons = effort / time;


        System.out.println("\nTime --> " + (int)time + " month");
        System.out.println("Person In Group --> " + (int)persons);

        scanner.close();
    }
}
