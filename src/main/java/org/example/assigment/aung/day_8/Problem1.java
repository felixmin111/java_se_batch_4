package org.example.assigment.aung.day_8;

public class Problem1 {
    public static void main(String[] args) {

        System.out.println(Sum(5));

    }
    public static int Sum(int n) {
        if (n==0) {
            return 0;
        }
        return n + Sum(n-1);

    }
}
