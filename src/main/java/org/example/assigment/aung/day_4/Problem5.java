package org.example.assigment.aung.day_4;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        double Effort = 0;
        double Time = 0;


        System.out.println("Cocomo Calculator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines of code");
        double linesOfCode = sc.nextDouble();
        System.out.println("Enter project type:");
        String projectType = sc.nextLine();



        double kloc = linesOfCode/ 1000.0;

        if (projectType.equalsIgnoreCase("Organic")){
            Calculator(kloc, 2.4, 1.05, 0.38);

        }
        else if(projectType.equalsIgnoreCase("Semi-Detached")){
            Calculator(kloc, 3.0, 1.12, 0.35);
        }
        else if(projectType.equalsIgnoreCase("Embedded")){
            Calculator(kloc, 3.6, 1.20, 0.32);
        }

        else{
            System.out.println("Invalid project type or invalid lines of code");
        }





        sc.close();
    }
    public static void Calculator(Double Kloc, double a, double b, double c) {
        double Effort = a * Math.pow(Kloc,b );
        double Time = 2.5 * Math.pow( Effort, c);
        System.out.println("Time: " + Time + " months");
        System.out.println("Person in group" + Effort/Time);
    }
}
