package org.example.assigment.aung.petassignment.model;

public class Dog extends Pet {
    private String breed;
    private boolean isTrained;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setisTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

    public Dog(String id, String name,int age, Type type, String color, String breed, boolean isTrained) {
        super(id, name, age, type, color);
        this.breed = breed;
        this.isTrained = isTrained;

    }

    @Override
    public String toFileFormat() {
        return getId() + "," + getName() + "," + getAge() + "," + getType() + "," + getColor() + "," + getBreed() + "," + isTrained();

    }

    @Override
    public String toString() {
        return "["+getType()+"]\n"+
                "ID: "+getId()+"\n"+
                "Name: "+getName()+"\n"+
                "Age: "+getAge()+"\n"+
                "Type: "+getType()+"\n"+
                "Color: "+getColor()+"\n"+
                "Breed: "+getBreed()+"\n"+
                "isTrained: "+isTrained()+"\n";

    }

}
