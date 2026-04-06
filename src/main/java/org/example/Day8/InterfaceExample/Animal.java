package org.example.Day8.InterfaceExample;

interface Animal {
    public static final int  constantNum=1000;
    public int  constantNum1=1000;
    void eat();
    void sleep();
    void walk();

    private void helper(){
        System.out.println("HELLO");
    }

    public static void display(){
        System.out.println("I am an animal");
    }

    default void print(){
        System.out.println("I am an animal");
    }
}
