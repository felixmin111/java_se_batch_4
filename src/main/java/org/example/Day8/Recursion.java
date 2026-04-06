package org.example.Day8;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorialWithLoop(4));
        System.out.println(factorial(4));

        printNumber(5);
        // 1, 2, 3, 4, 5
    }
    public static int factorialWithLoop(int n) {
        int result = 1;
        while (n>1){
            result = result * n;
            n--;
        }
        return result;
    }
    public static int factorial(int n) {
        if(n==1){
            return 1;
        }
        return n* factorial(n-1);
    }
    public static void printNumber(int num){
        if(num==0){
            return;
        }else{
            printNumber(num-1);
        }
        System.out.println(num);

    }
}
