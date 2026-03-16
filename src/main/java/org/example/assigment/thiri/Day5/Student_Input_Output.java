package org.example.assigment.thiri.Day5;

public class Student_Input_Output {
    public static void main(String[] args) {
        Student_Registration_System student = new Student_Registration_System("Thiri", "Yangon");
        student.setAge(10);
        student.setAmount(100);
        student.setEmail("theerimoetheint@gmail.com");
        student.display();
    }
}
