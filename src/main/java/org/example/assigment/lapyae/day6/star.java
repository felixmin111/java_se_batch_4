package org.example.assigment.lapyae.day6;

public class star {
    public static void main(String[] args) {
        starEx();
        starEx1();
    }
    public static void starEx() {
        int count=0;
        while (6>count){
            int innerCount=0;
            while (count>innerCount){
                System.out.print("* ");
                innerCount++;
            }
            System.out.println();
            count++;
        }
    }
    public static void starEx1() {
        int count=0;
        while (6>count){
            int innerCount=6;
            while (count<innerCount){
                System.out.print("* ");
                innerCount--;
            }
            System.out.println();
            count++;
        }
    }
}
