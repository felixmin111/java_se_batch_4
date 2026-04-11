package org.example.Day10.StudentRegistrationSystem.controller;

import org.example.Day10.StudentRegistrationSystem.service.StudentServiceImpl;
import org.example.Day10.StudentRegistrationSystem.service.TeacherServiceImpl;
import org.example.Day10.StudentRegistrationSystem.view.MainMenuView;
import org.example.Day10.StudentRegistrationSystem.view.StudentView;
import org.example.Day10.StudentRegistrationSystem.view.TeacherView;

public class MainController {
    MainMenuView mainMenuView;
    public void start() {
        mainMenuView = new MainMenuView();
        while (true) {
           int choose=mainMenuView.displayMenu();
           switch (choose) {
               case 1:
                   studentManagement();
                   break;
               case 2:
                   teacherManagement();
                   break;
               case 3:
                   return;
           }

        }
    }
    private void studentManagement(){
        StudentServiceImpl studentService = new StudentServiceImpl();
        StudentView studentView = new StudentView();
        StudentController studentController = new StudentController(studentService, studentView);
        studentController.start();
    }
    private void teacherManagement(){
        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        TeacherView teacherView = new TeacherView();
        TeacherController teacherController = new TeacherController(teacherService, teacherView);
        teacherController.start();
    }
}
