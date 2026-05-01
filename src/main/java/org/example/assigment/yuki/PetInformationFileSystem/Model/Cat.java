package org.example.assigment.yuki.PetInformationFileSystem.Model;

public class Cat extends Pet{
    private boolean isIndoor;
    private double furLength;

    public Cat(){}
    public Cat(int id, String name, int age, String color,
               boolean isIndoor, double furLength) {
        super(id, name, age, "Cat", color);
        this.isIndoor = isIndoor;
        this.furLength = furLength;
    }


    @Override
    public String toFileString() {
        return super.toFileString() + "," + isIndoor + "," + furLength;
    }

    @Override
    public String toString() {
        return "[Cat]\n" +
                super.toString() +
                "\nIndoor: " + isIndoor +
                "\nFur Length: " + furLength +
                "\n---------------------";
    }
}
