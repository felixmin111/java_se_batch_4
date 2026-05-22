package org.example.assigment.yuki.StudentRegistrationSystem.Service;
import org.example.assigment.yuki.StudentRegistrationSystem.Model.Student;

import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> studentList = new ArrayList<>();
    public void saveStudent(Student student) {
        studentList.add(student);

    }

    public ArrayList<Student> getAllStudents() {
        return studentList;
    }

}
