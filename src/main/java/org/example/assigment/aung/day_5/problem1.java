package org.example.assigment.aung.day_5;

import java.util.Scanner;

import static org.example.assigment.aung.day_5.Student.studentCount;

public class problem1 {
    public static void main(String[] args) {
        //Set up array
        Student[] registrationList= new Student[100];
        boolean running = true;
        String check;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the student Registration System");
        // User input
        while (running) {

            System.out.println("Enter Student name:");
            String studentName;
            studentName = sc.nextLine();

            System.out.println("Enter Student age:");
            int age;
            age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Student address:");
            String address;
            address = sc.nextLine();


            System.out.println("Enter Payment Amount:");
            double amount;
            amount = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter Student email:");
            String email;
            email = sc.nextLine();


            //Construct new object and set it into the array
            Student student = new Student(studentName, address, email);
            student.setAge(age);
            student.setAmount(amount);

            registrationList[studentCount - 1] = student;

            for (int i = 0; i<studentCount; i++){
                registrationList[i].output();
            }

            System.out.println("To continue press anything other than 1. Press 1 to exit.");
            check = sc.next();

            if (check.equalsIgnoreCase("1")) {
                running = false;
            }

        }
    }
}