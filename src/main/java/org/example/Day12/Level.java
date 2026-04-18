package org.example.Day12;

public enum Level {
    BASIC(1,"Basic Level"),INTERMEDIATE(2,"Intermediate Level"),ADVANCE(3,"Advance Level");
    private  int code;
    private String lable;
    Level(int code, String lable) {
        this.code = code;
        this.lable = lable;
    }
    public int getCode() {
        return code;
    }
    public String getLable() {
        return lable;
    }

}
