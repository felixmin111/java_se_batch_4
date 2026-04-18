package org.example.Day10.StudentRegistrationSystem.model;


public class Student extends User {
    private String id;
    private String faculty;

    public Student(String name, String phone, String email, int age, String id, String faculty) {
        super(name, phone, email, age);
        this.id = id;
        this.faculty = faculty;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        String userInfo=super.toString();
        return userInfo
                +"\n"+ "Faculty: "+faculty
                +"\n"+ "ID: "+id;
    }
}
