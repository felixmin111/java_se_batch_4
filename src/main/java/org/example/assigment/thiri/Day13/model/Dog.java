package org.example.assigment.thiri.Day13.model;

import org.example.assigment.thiri.Day13.annotation.NotNullField;

public class Dog extends Pet {

    @NotNullField(message = "Dog breed cannot be empty.")
    private String breed;

    @NotNullField(message = "Please select is trained? (Yes or No).")
    private boolean isTrained;

    public Dog(Integer id, String name, int age, String color, PetType type, String breed, boolean isTrained) {
        super(id,name,age,color, type);
        this.breed=breed;
        this.isTrained=isTrained;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    @Override
    public String toString() {
        return super.toString()+","+this.breed+","+this.isTrained;
    }
}
