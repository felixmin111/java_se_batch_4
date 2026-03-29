package org.example.assigment.lapyae.day5;

import java.util.Scanner;


import static org.example.assigment.lapyae.day5.Student.StuCount;


public class StudentReg {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        StuInfo();
    }

    public static void StuInfo() {
        Student[] regList= new Student[100];
        boolean flag = true;
         do {
             regList[StuCount] = getStudentInfo();
             System.out.println("Do you want to continue? (Y/N)");
             String input = sc.nextLine();
             if (!input.equalsIgnoreCase("Y")) {
                 flag = false;
             }
         }while (flag);
         displayStudents(regList);
    }
    public static Student getStudentInfo(){
        System.out.println("---------Enter Student's Information---------");

        System.out.println("Enter the student name: ");
        String Name = sc.nextLine();

        System.out.println("Enter the student age: ");
        int Age = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the student address: ");
        String Address = sc.nextLine();

        System.out.println("Enter the student amount: ");
        double Amount = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter the student email: ");
        String Email = sc.nextLine();


        Student student = new Student(Name, Email, Address);
        student.setAge(Age);
        student.setAmount(Amount);
        return student;
    }
    public static void displayStudents(Student[] students){
        for (int i = 0; i<StuCount; i++){
            students[i].outPut();
        }
    }
}