package org.example.Day13;

import org.example.Day13.model.Student;
import org.example.Day13.model.Teacher;

import java.io.IOException;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
//      StudentFileRepository studentFileRepository = new StudentFileRepository();
//      Student[] students = new Student[3];
//      students[0]=new Student(11,"Felix",25);
//      students[1]=new Student(12,"Felix1",25);
//      students[2]=new Student(13,"Felix2",25);
//
//
//      studentFileRepository.saveToFile(
//              "src/main/java/org/example/Day13/dataFile/students.txt",students);
//      Student[] studentsOut=studentFileRepository.loadFromFile(
//              "src/main/java/org/example/Day13/dataFile/students.txt");
//      System.out.println("<---Displaying the File Reading Data--->");
//      for (Student student : studentsOut) {
//          if(student!=null){
//              System.out.println(student);
//          }
//      }

        TeacherFileRepository teacherFileRepository = new TeacherFileRepository();
        Teacher[] teachers = new Teacher[3];
        teachers[0]=new Teacher(11,"Felix",25,"BCSC","DBMS");
        teachers[1]=new Teacher(12,"Felix1",25,"BCSC","DBMS");
        teachers[2]=new Teacher(13,"Felix2",25,"BCSC","DBMS");


        teacherFileRepository.saveToFile(
                "src/main/java/org/example/Day13/dataFile/teachers.txt",teachers);
        ArrayList<Teacher> teachersOut=teacherFileRepository.loadFromFile(
                "src/main/java/org/example/Day13/dataFile/teachers.txt");
        System.out.println("<---Displaying the File Reading Data--->");
        for (Teacher student : teachersOut) {
            if(student!=null){
                System.out.println(student);
            }
        }
    }

}
