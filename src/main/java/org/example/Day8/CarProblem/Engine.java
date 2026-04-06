package org.example.Day8.CarProblem;

abstract class Engine {
    public String name;
    public int speed;
    public Engine(){

    }
    public Engine(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    abstract void start();
    public static void stop(){
        System.out.println("stop...!");
    }
}
