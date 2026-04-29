package org.example.Day12.GenericType;

public class MainApp {
    public static void main(String[] args) {
        MyArray<Integer> integerArray=new MyArray<>(10);
        integerArray.addValue(12);
        integerArray.addValue(13);
        integerArray.addValue(14);
        integerArray.addValue(15);
        integerArray.addValue(16);

        for(int i=0;integerArray.getIndex()>i;i++){
            System.out.println(integerArray.getValue(i));
        }

    }
}
