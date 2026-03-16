package org.example.assigment.aung.day_5;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        //Set up array
        Student[] registrationList= new Student[100];

        System.out.println("Welcome to the student Registration System");
        // User input
        Scanner sc = new Scanner(System.in);
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


        //Construct new object
        Student student = new Student(studentName, address, email);
        student.setAge(age);
        student.setAmount(amount);

        registrationList[Student.studentCount -1] = student;

    }
}