package org.example.Day10.StudentRegistrationSystem.view;

import org.example.Day10.StudentRegistrationSystem.model.Teacher;
import org.example.Day10.StudentRegistrationSystem.service.TeacherServiceImpl;

import java.util.Scanner;

public class TeacherView {

    public static Scanner scanner = new Scanner(System.in);

    public Teacher getTeacherInfo() {
        System.out.println("Enter Teacher name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Teacher age: ");
        int age = scanner.nextInt();scanner.nextLine();
        System.out.println("Enter Teacher email: ");
        String email = scanner.nextLine();
        System.out.println("Enter Teacher phone number: ");
        String phone = scanner.nextLine();
        Teacher teacher=new Teacher(name,phone,email,age);
        return teacher;
    }
    public int displayMenu(){
        System.out.println("Choose the process you want to do\n"+
                "(1) Register Teacher\n" +
                "(2) Display All Teacher\n"+
                "(3) Exit");
        int choose=scanner.nextInt();scanner.nextLine();
        return choose;
    }

    public void displayAllTeachers(Teacher[] teachers) {
        for (int i = 0; i < TeacherServiceImpl.teacherCount; i++) {
            System.out.println(teachers[i]);
        }
    }

}
