package org.example.Day10.StudentRegistrationSystem.model;

public class Teacher {
   private String name;
   private String phone;
   private String email;
   private int age;
   private String course;
   private String position;

    public Teacher(String name, String phone, String email, int age) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
       return "Name :"+ this.name+" |"+
               "Age :"+ this.age+"  |"+
               "Email :"+this.email+" |"+
               "Phone :"+this.phone+" |"+
               "Course :"+this.course+" |"+
               "Position :"+this.position;
    }

}
