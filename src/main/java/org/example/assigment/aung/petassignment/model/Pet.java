package org.example.assigment.aung.petassignment.model;
import org.example.assigment.aung.petassignment.annotation.EmptyField;
import org.example.assigment.aung.petassignment.annotation.NotValidAge;

public abstract class Pet {

    private int id;
    
    @EmptyField(message = "Name is required and cannot be empty!")
    private String name;

    @NotValidAge(message = "Age must be between 0 and 30!")
    private int age;

    public enum Type{
        DOG("Dog"), CAT("Cat");

        private String label;

        Type(String label) {
            this.label = label;
        }
        public String getLabel() {
            return label;
        }
    }

    private Type type;

    @EmptyField(message = "Color is required and cannot be empty!")
    private String color;



    public Pet(int id, String name, int age, Type type, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.type = type;
        this.color = color;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract String toFileFormat();

    public abstract String toString();
}
