package org.example.Day10.StudentRegistrationSystem.controller;

import org.example.Day10.StudentRegistrationSystem.view.StudentView;
import org.example.Day10.StudentRegistrationSystem.model.Student;
import org.example.Day10.StudentRegistrationSystem.service.StudentServiceImpl;

public class StudentController {
    private StudentServiceImpl studentService;
    private StudentView studentView;
    public StudentController(StudentServiceImpl studentService, StudentView studentView) {
        this.studentService = studentService;
        this.studentView = studentView;
    }
    public void start(){
        while(true){
            int choose=studentView.displayMenu();
            switch(choose){
                case 1:
                    Student student=studentView.getStudentInfo();
                    studentService.registerStudent(student);
                    break;
                case 2:
                    Student[] students=studentService.getStudents();
                    studentView.displayAllStudents(students);
                    break;
                case 3:
                   return;
            }
        }
    }
}
