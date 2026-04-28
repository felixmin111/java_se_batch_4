package org.example.assigment.thiri.Day13.model;

public class Pet {


    public enum PetType {
        CAT(1, "Cat"), DOG(2, "Dog");

        private final int num;
        private final String type;
        PetType(int num, String type) {
            this.num = num;
            this.type=type;
        }
        public int getNum() {
            return num;
        }

        public String getType() {
            return type;
        }
    }

    private int id;
    private String name;
    private int age;
    private String color;
    private final PetType type;

    public Pet(int id, String name, int age, String color, PetType type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.color = color;
        this.type = type;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PetType getType() {
        return type;
    }

    public String toString() {
        return this.id+","+this.name+","+this.age+","+this.color+","+this.type;
    }

}
