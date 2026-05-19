package org.example.assigment.aung.zoo.model;

public class Animal {
    private int id;
    private  String name;
    private int age;
    private String species;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
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

    public Animal(String name, int age, String species, int weight, boolean tame) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.weight = weight;
        this.tame = tame;
    }

    public Animal(int id,  String name, int age, String species, int weight, boolean tame) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.species = species;
            this.weight = weight;
            this.tame = tame;
        }


}
