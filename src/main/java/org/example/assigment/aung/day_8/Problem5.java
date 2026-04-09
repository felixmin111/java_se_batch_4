package org.example.assigment.aung.day_8;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(Fib(6));
    }
    public static int Fib(int n) {
        if (n==0) {return 0;}
        if (n==1) {return 1;}

        return Fib(n-2) + Fib(n-1);
    }
}
