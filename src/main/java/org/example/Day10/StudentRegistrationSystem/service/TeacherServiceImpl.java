package org.example.Day10.StudentRegistrationSystem.service;
import org.example.Day10.StudentRegistrationSystem.model.Teacher;

public class TeacherServiceImpl implements TeacherService {
    private static Teacher[] teachers = new Teacher[100];
    public static int teacherCount;
    @Override
    public void registerTeacher(Teacher teacher) {
        teachers[teacherCount++] = teacher;
    }
    @Override
    public Teacher[] getTeachers() {
        return teachers;
    }
}
