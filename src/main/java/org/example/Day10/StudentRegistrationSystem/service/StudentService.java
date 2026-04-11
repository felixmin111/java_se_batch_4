package org.example.Day10.StudentRegistrationSystem.service;

import org.example.Day10.StudentRegistrationSystem.model.Student;

public interface StudentService {
    public void registerStudent(Student student);
    public  Student[] getStudents();
}
