package org.example.assigment.lapyae.day8;

public class RecursiveProblems {
    public static void main(String[] args) {
        System.out.println(recursivesum(4));
        System.out.println(powercalculation(2,4));
        System.out.println(reversestring("Hello World"));
        System.out.println(countdigits(12345));
        System.out.println(fibonacci(6));
    }

    public static int recursivesum(int n){
        if (n == 1){
            return 1;
        }
        return n + recursivesum(n - 1);

    }

    public static int powercalculation(int a, int b){
        if (b == 0){
            return 1;
        }
        return a * powercalculation(a, b - 1);
    }

    public static String reversestring(String s){
        if(s.isEmpty()){
            return s;
        }
        return s.charAt(s.length() - 1) + reversestring(s.substring(0, s.length()-1));
    }

    public static int countdigits(int n) {
        if (n < 10) {
            return 1;
        }
        return 1 + countdigits(n / 10);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
