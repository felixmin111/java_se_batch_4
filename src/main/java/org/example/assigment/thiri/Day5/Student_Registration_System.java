package org.example.assigment.thiri.Day5;

public class Student_Registration_System {

    //Initialization
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
    public double getAmount() {return amount;}

    //setEmail & getEmail
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {return email;}

    //Constructor
    public Student_Registration_System () {
        studentCount += 1;
    }

    //display output
    public void display() {
            System.out.println("--------------------------------------------------");
            System.out.println("Name: " + name);
            System.out.println("Age: " + this.age);
            System.out.println("Address: " + address);
            System.out.println("Amount: " + this.amount);
            System.out.println("Email: " + this.email);
            System.out.println("Student Count: " + studentCount);
            System.out.println("--------------------------------------------------");
    }

}
