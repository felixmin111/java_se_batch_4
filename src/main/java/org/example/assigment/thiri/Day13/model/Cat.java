package org.example.assigment.thiri.Day13.model;

import org.example.assigment.thiri.Day13.annotation.NotNullField;

public class Cat extends Pet {
    @NotNullField(message = "Please select is indoor? (Yes or No).")
    private boolean isIndoor;
    @NotNullField(message = "Please select a fur length (Short, Medium, or Long).")
    private String length;

    public Cat(Integer id, String name, int age, String color, PetType type, boolean isIndoor, String length) {
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


