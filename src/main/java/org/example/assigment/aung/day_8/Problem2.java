package org.example.assigment.aung.day_8;

public class Problem2 {
    public static void main(String[] args) {

        System.out.println(Power(5, 2));

    }
    public static int Power(int a, int b) {
        if (b==1) {
            return a;
        }
        return a * Power(a,b-1);

    }
}
