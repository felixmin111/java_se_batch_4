package org.example.assigment.lapyae.day5;

import java.util.Objects;
import java.util.Scanner;


import static org.example.assigment.aung.day_5.Student.studentCount;
import static org.example.assigment.lapyae.day5.Stu_in_Out.StuCount;


public class StudentReg {
    public static void main(String[] args) {
        StuInfo();
    }

    public static void StuInfo() {

        Stu_in_Out[] regList= new Stu_in_Out[100];
        boolean running = true;
        String check;
        Scanner sc = new Scanner(System.in);


        while (true) {
            Scanner scan = new Scanner(System.in);


            System.out.println("---------Enter Student's Information---------");

            System.out.println("Enter the student name: ");
            String Name = scan.nextLine();

            System.out.println("Enter the student age: ");
            int Age = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter the student address: ");
            String Address = scan.nextLine();

            System.out.println("Enter the student amount: ");
            double Amount = scan.nextDouble();
            scan.nextLine();

            System.out.println("Enter the student email: ");
            String Email = scan.nextLine();


            Stu_in_Out student = new Stu_in_Out(Name, Email, Address);
            student.setAge(Age);
            student.setAmount(Amount);

            regList[StuCount - 1] = student;

            for (int i = 0; i<StuCount; i++){
                regList[i].output();
            }




            while (true) {
                System.out.println("Do you want to put another student's information? (yes or no); ");
                String choice = scan.nextLine();

                if ((choice.equalsIgnoreCase("yes"))) {
                    break;
                } else if (choice.equalsIgnoreCase("no")) {
                    System.out.println("------------Thank you for registration------------");
                    scan.close();
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