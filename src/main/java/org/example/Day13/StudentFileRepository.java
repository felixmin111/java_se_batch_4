package org.example.Day13;


import org.example.Day13.model.Student;

import java.io.*;

public class StudentFileRepository extends GenericFileRepository<Student> {
    @Override
    public Student parser(String[] data) {
        Student student=new Student(
                Integer.parseInt(data[0]),
                data[1],
                Integer.parseInt(data[2]),
                Integer.parseInt(data[3])
        );
        return student;
    }
}
