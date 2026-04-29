package org.example.Day13.model;

public class Student extends Member {
    private int gpa;
    public Student(int id, String name, int age, int gpa) {
        super(id, name, age);
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        return super.toString() + "," + gpa;
    }
}
