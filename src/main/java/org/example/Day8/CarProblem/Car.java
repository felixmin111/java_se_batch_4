package org.example.Day8.CarProblem;

public class Car {
    private Engine engine;
    public void drive(Engine engine ) {
        this.engine = engine;
        this.engine.start();
    }
}
