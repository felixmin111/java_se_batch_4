package org.example.assigment.aung.petassignment.model;

public abstract class Pet {
    private String id;
    private String name;
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

    public void setId(String id) {
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
