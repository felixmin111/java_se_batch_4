package org.example.Day7.Inheritance;

public class Human {
    private String name;
    private int age;
    private String gender;
    private int height;

    public void eat(){
        System.out.println("eating ---!");
    }
    public  void sleep(){
        System.out.println("sleeping ---!");
    }
    public void professional(){
        System.out.println("Non professional");
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height);
    }
}
