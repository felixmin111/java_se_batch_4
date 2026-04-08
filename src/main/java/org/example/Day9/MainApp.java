package org.example.Day9;

public class MainApp {
    public static void main(String[] args) {

            checkAge(13);
            System.out.println("I am still working!!");

    }
    public static void checkAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Age must be at least 18");
        }
    }
}
