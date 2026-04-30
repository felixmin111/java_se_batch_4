package org.example.assigment.yuki.PetInformationFileSystem.Model;

public class Cat extends Pet{
    private boolean isIndoor;
    private double furLength;

    public Cat(){}
    public Cat(int id,String name, int age, String type, String color, boolean isIndoor, double furLength) {
        super(id,name,age,type,color);
        this.isIndoor = isIndoor;
        this.furLength = furLength;
    }



    @Override
    public String toString(){
        return super.toString() + ",isIndoor: " + isIndoor + ",furLength: " + furLength;
    }
}
