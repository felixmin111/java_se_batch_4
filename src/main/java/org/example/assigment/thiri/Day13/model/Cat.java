package org.example.assigment.thiri.Day13.model;

public class Cat extends Pet {
    private boolean isIndoor;
    private String length;

    public Cat(int id, String name, int age, String color, PetType type, boolean isIndoor, String length) {
        super(id,name, age, color, type);
        this.isIndoor=isIndoor;
        this.length=length;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        isIndoor = indoor;
    }
    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return super.toString()+","+this.isIndoor+","+this.length;
    }

}


