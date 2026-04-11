package org.example.Day10.StudentRegistrationSystem.service;

import org.example.Day10.StudentRegistrationSystem.model.Student;

public class StudentServiceImpl implements StudentService {
    private static Student[] students = new Student[100];
    public static int studentCount;

    @Override
    public void registerStudent(Student student) {
        students[studentCount++] = student;
    }

    @Override
    public Student[] getStudents() {
        return students;
    }
}
