package org.example.Day6;

public class LoopExercise {
    public static void main(String[] args) {
    starSquare();
    }
    public static void starSquare() {
        int count=0;
        while (20>count) {
            int innerCount=0;
            while(count>innerCount) {
                System.out.print("* ");
                innerCount++;
            }
            System.out.println();
            count++;
        }
        count=10;
        while (0<count) {
            int innerCount=0;
            while(count>innerCount) {
                System.out.print("* ");
                innerCount++;
            }
            System.out.println();
            count--;
        }
    }
}
