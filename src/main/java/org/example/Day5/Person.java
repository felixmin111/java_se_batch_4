package org.example.Day5;

public class Person {
    //instance variable
    private String name;
    private String address;
    private int age;
    private double balance;

    //static variable
    private static String schoolName;
    public static int studentCount;

   //constructor over loading
    public Person(String name, String address) {
        System.out.println("2 args Working Person Constructor");
        studentCount+=1;
        this.name = name;
        this.address = address;
    }

    public Person() {
        System.out.println("Default Working Person Constructor");
        studentCount+=1;
    }

    public void setAge(int age){
        if(age > 0 && age <= 200){
            this.age = age;
        }
    }
    public int getAge(){
       return this.age;
    }

    public void setBalance(double balance){
        if(balance > 0){
            this.balance = balance;
        }
    }

    public double getBalance(){
        return this.balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display(){
        System.out.println("---------Display Person Data------");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Age: " + this.age);
        System.out.println("Balance: " + this.balance);
        System.out.println("School Name: " + this.schoolName);
        System.out.println("Student Count: " + this.studentCount);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
