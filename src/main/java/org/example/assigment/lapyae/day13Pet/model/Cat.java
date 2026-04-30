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

    @Override
    public String toFileFormat() {
        return String.format("%s,%s,%d,%s,%s,%b,%s", getId(), getName(), getAge(), getType(), getColor(), isIndoor, furLength);
    }

    @Override
    public String toString() {
        return "[" + getType() + "]\n" +
                "ID: " + getId() + "\n" +
                "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Color: " + getColor() + "\n" +
                "Indoor: " + isIndoor + "\n" +
                "Fur: " + furLength.name() + "\n";
    }
}
