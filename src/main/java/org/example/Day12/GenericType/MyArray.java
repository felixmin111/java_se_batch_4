package org.example.Day12.GenericType;

public class MyArray<T>{
    private Object[] values;
    private int index=0;
    public MyArray(int size){
        this.values=new Object[size];
    }
    public void addValue(T value){
        values[index++]=value;
    }
    public T getValue(int currentIndex){
        return (T)values[currentIndex];
    }

    public Object[] getValues() {
        return values;
    }

    public void setValues(Object[] values) {
        this.values = values;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
