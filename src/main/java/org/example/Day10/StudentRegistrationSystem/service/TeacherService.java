package org.example.Day10.StudentRegistrationSystem.service;
import org.example.Day10.StudentRegistrationSystem.model.Teacher;
public interface TeacherService {
    public void registerTeacher(Teacher teacher);
    public  Teacher[] getTeachers();
}
