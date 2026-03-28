package org.example.Day6;

public class ForExercise {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i=i+2) {
            for (int j = i; j >0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
