package org.example.Day6;

public class MethodOverloading {
    public static void main(String[] args) {
        sum(1,2);
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

}
