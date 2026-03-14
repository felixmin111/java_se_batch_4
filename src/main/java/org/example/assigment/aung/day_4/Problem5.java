package org.example.assigment.aung.day_4;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Double Effort = null;
        Double Time = null;


        System.out.println("Cocomo Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines of code");
        Double linesOfCode = sc.nextDouble();
        System.out.println("Enter project type:");
        String projectType = sc.nextLine();



        Double Kloc = linesOfCode/ 1000.0;

        if (projectType.equalsIgnoreCase("Organic")){
            Effort = 2.4 * Math.pow(Kloc, 1.05);
            Time = 2.5 * Math.pow(Effort, 0.38);

        }
        else if(projectType.equalsIgnoreCase("Semi-Detached")){
            Effort = 3.0 * Math.pow(Kloc, 1.12);
            Time = 2.5 * Math.pow(Effort, 0.35);
        }
        else if(projectType.equalsIgnoreCase("Embedded")){
            Effort = 3.6 * Math.pow(Kloc, 1.20);
            Time = 2.5 * Math.pow(Effort, 0.32);
        }

        else{
            System.out.println("Invalid project type or invalid lines of code");
        }


        System.out.println("Time: " + Time + " months");
        System.out.println("Person in group" + Effort/Time);


        sc.close();
    }
}
