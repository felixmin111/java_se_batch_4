package org.example.assigment.aung.petassignment.model;

public class Cat extends Pet{
    private boolean isIndoor;
    public enum Furlength{
        LONG, MEDIUM, SHORT
    }
    private Furlength furlength;

    public Cat(String id, String name, int age, Type type, String color,boolean isIndoor, Furlength furlength ) {
        super(id, name, age, type, color);
        this.isIndoor = isIndoor;
        this.furlength = furlength;

    }

    public boolean isIndoor() {
        return isIndoor;
    }


    public Furlength getFurlength() {
        return furlength;
    }

    public void setFurlength(Furlength furlength) {
        this.furlength = furlength;
    }

    public void setisIndoor(boolean indoor) {isIndoor = indoor;}

    @Override
    public String toFileFormat() {
        return getId() + "," + getName() + "," + getAge() + "," + getType() + "," + getColor() + "," + isIndoor + "," + furlength.name();
    }

    @Override
    public String toString() {
       return "["+getType()+"]\n"+
               "ID: "+getId()+"\n"+
               "Name: "+getName()+"\n"+
               "Age: "+getAge()+"\n"+
               "Type: "+getType()+"\n"+
               "Color: "+getColor()+"\n"+
               "Indoor: "+isIndoor()+"\n"+
               "Furlength: "+getFurlength().name()+"\n";

    }



}
