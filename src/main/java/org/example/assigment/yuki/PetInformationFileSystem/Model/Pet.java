package org.example.assigment.yuki.PetInformationFileSystem.Model;

public class Pet {
    private Integer id;
    private String name;
    private int age;
    private String type;
    private String color;

    public Pet() {}

    public Pet(Integer id,String name,int age,String type, String color ) {
        this.id = id;
        this.color = color;
        this.type = type;
        this.age = age;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {this.id = id;}

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
        return "ID: " + id +
                "\nName: " + name +
                "\nAge: " + age +
                "\nType: " + type +
                "\nColor: " + color;
    }

    public String toFileString(){
        return String.format("%d,%s,%d,%s,%s", id, name, age, type, color);
    }
}
