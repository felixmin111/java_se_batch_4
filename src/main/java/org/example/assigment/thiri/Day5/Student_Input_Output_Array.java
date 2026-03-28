package org.example.assigment.thiri.Day5;

import java.util.ArrayList;
import java.util.Scanner;

import static org.example.assigment.thiri.Day5.Student_Registration_System.studentCount;

public class Student_Input_Output_Array {
    public static void main(String[] args) {
        askStudentInfo();
    }

    public static void askStudentInfo() {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student_Registration_System> students = new ArrayList<>();
        boolean registration = true;

        while (registration) {

            Student_Registration_System student = new Student_Registration_System();

            System.out.println("------------Fill Student Information-----------");

            System.out.println("Enter student name: ");
            student.name = sc.nextLine();

            System.out.println("Enter student age: ");
            int age = sc.nextInt();
            student.setAge(age);
            sc.nextLine();

            System.out.println("Enter student address: ");
            student.address = sc.nextLine();

            System.out.println("Enter student amount: ");
            double amount = sc.nextDouble();
            student.setAmount(amount);
            sc.nextLine();

            System.out.println("Enter student email: ");
            String email = sc.nextLine();
            student.setEmail(email);

            students.add(student);

            while (true) {
                System.out.println("Do you want to put another student (yes or no); ");
                String ans = sc.nextLine();

                if ((ans.equalsIgnoreCase("yes"))) {
                    break;
                } else if (ans.equalsIgnoreCase("no")) {
                    System.out.println("------------Thank you for registration------------");
                    registration = false;
                    break;

                } else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("               !!!Invalid Input!!!                ");
                    System.out.println("           Please fill \"yes\" or \"no\"          ");
                    System.out.println("--------------------------------------------------");
                }
            }

        }

        System.out.println("\n---------Student Registration Confirmation--------");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("\nStudent " + (i + 1));
            students.get(i).display();
        }
        sc.close();
    }
}