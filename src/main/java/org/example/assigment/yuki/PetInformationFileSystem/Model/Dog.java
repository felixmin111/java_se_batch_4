package org.example.assigment.yuki.PetInformationFileSystem.Model;

public class Dog extends Pet {
    private String breed;
    private boolean isTrained;

    public Dog(){}
    public Dog(int id,String name, int age, String type, String color, String breed, boolean isTrained) {
        super(id,name,age,type,color);
        this.breed = breed;
        this.isTrained = isTrained;
    }
}
