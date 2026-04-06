package org.example.Day8.InterfaceExample;

public class Snake implements Animal {
    @Override
    public void eat() {
        System.out.println("Eating like Snake");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping Snake 4 or 6 month");
    }

    @Override
    public void walk() {
        System.out.println("Walking like Snake");
    }
}
