package org.example.assigment.yuki.StudentRegistrationSystem.Model;

public class Student {
    private int id;
    private String name;
    private String major;
    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Major: " + major;

    }

}
