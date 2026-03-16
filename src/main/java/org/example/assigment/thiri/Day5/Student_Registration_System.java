package org.example.assigment.thiri.Day5;

public class Student_Registration_System {
    String name;
    private int age;
    String address;
    private double amount;
    private String email;
    public static int studentCount;

    //setAge & getAge
    public void setAge(int age) {
        if (age > 0 && age < 200) {
            this.age = age;
        }
    }
    public int getAge() {return this.age;}

    //setAmount & getAmount
    public void setAmount(double amount) {
        if (amount >0) {
            this.amount = amount;
        }
    }
    public double getAmount() {
        return amount;
    }

    //setEmail & getEmail
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student_Registration_System (String name, String address) {
        System.out.println("Student Registration");
        studentCount += 1;
        this.name = name;
        this.address = address;
    }

    public void display() {
            System.out.println("---------Student Registration Confirmation--------");
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Address: " + this.address);
            System.out.println("Amount: " + this.amount);
            System.out.println("Email: " + this.email);
    }

}
