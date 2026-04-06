package org.example.Day8.CarProblem;

public class BEngine extends Engine {
    public BEngine(String name, int speed) {
        super(name, speed);
    }

    @Override
    void start(){
        System.out.println("Car is Strating with B Engine");
    }
}
