package org.example.Day12;

public class ObjectDataType {
    public static void main(String[] args) {
        Object[] objects = new Object[10];
        objects[0] = "Snake";
        objects[1] = 12;
        objects[2] = 12.55;
        objects[3] = 'C';
        objects[4] = 'B';

        for (int i = 0; i < objects.length; i++) {
           String value=(String)objects[i];
           System.out.println(value);

        }
    }
}
