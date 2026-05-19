package org.example.assigment.aung.zoo.model;

public class Animal {
    private int id;
    private  String name;
    private int age;
    private String ownerName;
    private int weight;
    private boolean tame;


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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isTame() {
        return tame;
    }

    public void setTame(boolean tame) {
        this.tame = tame;
    }

    public Animal(int ID, String name, int age, String owner_name, int weight, boolean tame) {
        this.id = ID;
        this.name = name;
        this.age = age;
        this.ownerName = owner_name;
        this.weight = weight;
        this.tame = tame;
    }

    public Animal(String name, String owner_name, int weight, boolean tame) {
        this.name = name;
        this.ownerName = owner_name;
        this.weight = weight;
        this.tame = tame;
    }

}
