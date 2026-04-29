package org.example.Day13.model;

import org.example.Day5.Person;

public class Teacher extends Member {
    private String degree;
    private String subject;
    public Teacher(int id, String name, int age, String degree, String subject) {
        super(id, name, age);
        this.degree = degree;
        this.subject = subject;
    }
    @Override
    public String toString() {
        return super.toString() + "," + degree+","+subject;
    }
}
