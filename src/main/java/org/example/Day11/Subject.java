package org.example.Day11;

public class Subject {
    private int id;
    private String name;

    private Teacher[] teachers=new Teacher[10];
    public Subject(int id, String name, Teacher[] teachers) {
        this.id = id;
        this.name = name;
    }
}
