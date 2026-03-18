package org.example.assigment.aung.day_5;
// student class
public class Student {
    public String name;
    private int age;
    public String address;
    private double amount;
    public String email;

    public static int studentCount;

    public String studentId;

    //student class constructor
    public Student(String name, String address, String email) {
        System.out.println("Student recorded");
        this.name = name;
        this.address = address;
        this.email = email;
        studentCount+=1;
        this.studentId = "Student " + studentCount;
    }

    // getter and setter for safety
    public void setAge(int age) {
        if (age > 0 && age <= 100) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
    }
    public int getAge() {
        return this.age;
    }

    public void setAmount (double amount) {
        if (amount>0) {
            this.amount = amount;
        }
        else {
            this.amount = 0;
        }
    }

    public double getAmount(){
        return this.amount;
    }

    public void output() {
        System.out.println("-----------------");
        System.out.println("Student name: "+ this.name );
        System.out.println("Student address: " + this.address);
        System.out.println("Student email: " + this.email);
        System.out.println("Student age: " + getAge());
        System.out.println("Student amount: " + getAmount());
        System.out.println("-----------------");
    }
}

