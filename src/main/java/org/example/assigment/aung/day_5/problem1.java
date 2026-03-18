package org.example.assigment.aung.day_5;

import java.util.Objects;
import java.util.Scanner;

import static org.example.assigment.aung.day_5.Student.studentCount;

public class problem1 {
    public static void main(String[] args) {
        studentCreator();
    }
    public static void studentCreator() {
        //Set up array
        Student[] registrationList= new Student[100];
        boolean running = true;
        String check;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the student Registration System");
        // User input
        while (running) {

            System.out.println("Enter Student name:");
            String studentName = sc.nextLine();


            System.out.println("Enter Student age:");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Student address:");
            String address = sc.nextLine();


            System.out.println("Enter Payment Amount:");
            double amount = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter Student email:");
            String email = sc.nextLine();


            //Construct new object and set it into the array
            Student student = new Student(studentName, address, email);
            student.setAge(age);
            student.setAmount(amount);

            registrationList[studentCount - 1] = student;

            for (int i = 0; i<studentCount; i++){
                registrationList[i].output();
            }

            System.out.println("Student count: "+ studentCount);

            System.out.println("To continue press 1.");
            check = sc.nextLine();

            if (!Objects.equals(check, "1")) {
                running = false;
            }

        }
    }

}