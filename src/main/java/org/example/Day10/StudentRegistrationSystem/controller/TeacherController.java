package org.example.Day10.StudentRegistrationSystem.controller;

import org.example.Day10.StudentRegistrationSystem.model.Teacher;
import org.example.Day10.StudentRegistrationSystem.service.TeacherServiceImpl;
import org.example.Day10.StudentRegistrationSystem.view.TeacherView;

public class TeacherController {
    private TeacherServiceImpl teacherService;
    private TeacherView teacherView;
    public TeacherController(TeacherServiceImpl teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }
    public void start(){
        while(true){
            int choose=teacherView.displayMenu();
            switch(choose){
                case 1:
                    Teacher teacher=teacherView.getTeacherInfo();
                    teacherService.registerTeacher(teacher);
                    break;
                case 2:
                    Teacher[] teachers=teacherService.getTeachers();
                    teacherView.displayAllTeachers(teachers);
                    break;
                case 3:
                   return;
            }
        }
    }
}
