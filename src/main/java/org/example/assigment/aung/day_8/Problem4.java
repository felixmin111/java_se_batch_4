package org.example.assigment.aung.day_8;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println(Digits(1234));
    }
    public static int Digits(int n) {
        if (n<10) {
            return 1;
        }
        return 1 + Digits(n/10);
    }
}
