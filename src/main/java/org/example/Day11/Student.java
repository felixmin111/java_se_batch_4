package org.example.Day11;

import javax.print.attribute.standard.MediaSize;

public class Student {
    private int id;
    private String name;
    private int age;
    private String phone;
    private Teacher teacher;
    public Student(int id, String name, int age, String phone, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.teacher = teacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
