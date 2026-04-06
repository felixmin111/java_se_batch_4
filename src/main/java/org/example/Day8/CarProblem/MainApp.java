package org.example.Day8.CarProblem;

public class MainApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive(new VEngine());
        car.drive(new FlatEngine());
    }
}
