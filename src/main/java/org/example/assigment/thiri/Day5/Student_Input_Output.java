package org.example.assigment.thiri.Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Input_Output {
      public static void main(String[] args) {
            askStudentInfo();
      }

      public static void askStudentInfo() {
            while (true) {
                  Scanner sc = new Scanner(System.in);

                  Student_Registration_System student = new Student_Registration_System();

                  System.out.println("---------Fill Student Information---------");

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

                  student.display();

                  while (true) {
                        System.out.println("Do you want to put another student (yes or no); ");
                        String ans = sc.nextLine();

                        if ((ans.equalsIgnoreCase("yes"))) {
                              break;
                        } else if (ans.equalsIgnoreCase("no")) {
                              System.out.println("------------Thank you for registration------------");
                              System.exit(0);

                        } else {
                              System.out.println("--------------------------------------------------");
                              System.out.println("               !!!Invalid Input!!!                ");
                              System.out.println("           Please fill \"yes\" or \"no\"          ");
                              System.out.println("--------------------------------------------------");
                        }
                  }
            }
      }
}