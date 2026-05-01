package org.example.assigment.yuki.PetInformationFileSystem.Model;

public class Dog extends Pet {
    private String breed;
    private boolean isTrained;

    public Dog(){}
    public Dog(int id, String name, int age, String color,
               String breed, boolean isTrained) {
        super(id, name, age, "Dog", color);
        this.breed = breed;
        this.isTrained = isTrained;
    }

    @Override
    public String toString() {
        return "[Dog]\n" +
                super.toString() +
                "\nBreed: " + breed +
                "\nIs Trained: " + isTrained +
                "\n---------------------";
    }

    @Override
    public String toFileString() {
        return super.toFileString() + "," + breed + "," + isTrained;
    }


}
