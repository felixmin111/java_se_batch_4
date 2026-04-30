package org.example.assigment.lapyae.day13Pet.model;

public class Dog extends Pet {
    private String breed;
    private boolean isTrained;

    public Dog(String id, String name, int age, Type type, String color, String breed, boolean isTrained) {
        super(id, name, age, type, color);
        this.breed = breed;
        this.isTrained = isTrained;
    }

    public String getBreed() {
        return breed;
    }
    public boolean isTrained() {
        return isTrained;
    }

    @Override
    public String toFileFormat() {
        return getId() + "," + getName() + "," + getAge() + "," + getType() + "," + getColor() + "," + breed + "," + isTrained;
    }

    @Override
    public String toString() {
        return "[" + getType() + "]\n" +
                "ID: " + getId() + "\n" +
                "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Color: " + getColor() + "\n" +
                "Breed: " + breed + "\n" +
                "Trained: " + isTrained + "\n";
    }
}
