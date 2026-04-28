package org.example.assigment.thiri.Day13.model;

public class Dog extends Pet {
    private String breed;
    private boolean isTrained;

    public Dog(int id, String name, int age, String color, PetType type, String breed, boolean isTrained) {
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
