package org.example.assigment.yuki.StudentRegistrationSystem;

import org.example.assigment.yuki.StudentRegistrationSystem.Controller.StudentController;
import org.example.assigment.yuki.StudentRegistrationSystem.Service.StudentService;
import org.example.assigment.yuki.StudentRegistrationSystem.View.StudentView;

public class MainApp {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        StudentService service = new StudentService();
        StudentController controller = new StudentController(view, service);
    }
}
