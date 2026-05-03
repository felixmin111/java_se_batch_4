package org.example.assigment.lapyae.day13Pet.model;

public class Cat extends Pet {
    private boolean isIndoor;
    public enum FurLength { LONG, MEDIUM, SHORT }
    private FurLength furLength;

    public Cat(String id, String name, int age, Type type, String color, boolean isIndoor, FurLength furLength) {
        super(id, name, age, type, color);
        this.isIndoor = isIndoor;
        this.furLength = furLength;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public FurLength getFurLength() {
        return furLength;
    }

    @Override
    public String toFileFormat() {
        return String.format("%s,%s,%d,%s,%s,%b,%s", getId(), getName(), getAge(), getType(), getColor(), isIndoor, furLength);
    }

    @Override
    public String toString() {
        return "[" + getType() + "]\nID: " + getId() + "\nName: " + getName() + "\nAge: " + getAge() + "\n";
    }
}
