package org.example.assigment.lapyae.day13Pet.model;

public abstract class Pet {
    private String id;
    private String name;
    private int age;
    public enum Type { CAT, DOG }
    private Type type;
    private String color;

    public Pet(String id, String name, int age, Type type, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
        this.color = color;
    }

    public String getId() {

        return id;
    }
    public String getName() {

        return name;
    }
    public int getAge() {

        return age;
    }
    public Type getType() {

        return type;
    }
    public String getColor() {

        return color;
    }

    public abstract String toFileFormat();
}

