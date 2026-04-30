package org.example.assigment.yuki.PetInformationFileSystem.Model;

public class Pet {
    private int id;
    private String name;
    private int age;
    private String type;
    private String color;

    public Pet() {}

    public Pet(int id,String name,int age,String type, String color ) {
        this.id = id;
        this.color = color;
        this.type = type;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "id"+ id+"name" +name +"age" +age+"type" +type+ "color" +color ;
    }

    public String toFileString(){
        return String.format("%d %s %d %s %s", id, name, age, type, color);
    }
}
