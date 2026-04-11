package org.example.Day10.StudentRegistrationSystem.view;

import org.example.Day10.StudentRegistrationSystem.model.Student;
import org.example.Day10.StudentRegistrationSystem.service.StudentServiceImpl;

import java.util.Scanner;

public class StudentView {

    public static Scanner scanner = new Scanner(System.in);

    public Student getStudentInfo() {
        System.out.println("Enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Enter student age: ");
        int age = scanner.nextInt();scanner.nextLine();
        System.out.println("Enter student email: ");
        String email = scanner.nextLine();
        System.out.println("Enter student phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Enter student Student Id: ");
        String id = scanner.nextLine();
        System.out.println("Enter student Faculty: ");
        String faculty = scanner.nextLine();
        Student student=new Student(name,phone,email,age,id,faculty);
        return student;
    }
    public int displayMenu(){
        System.out.println("Choose the process you want to do\n"+
                "(1) Register Student\n" +
                "(2) Display All Students\n"+
                "(3) Exit");
        int choose=scanner.nextInt();scanner.nextLine();
        return choose;
    }

    public void displayAllStudents(Student[] students) {
        for (int i = 0; i < StudentServiceImpl.studentCount; i++) {
            System.out.println(students[i]);
        }
    }

}
