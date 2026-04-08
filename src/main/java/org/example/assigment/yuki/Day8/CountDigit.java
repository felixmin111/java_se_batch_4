package org.example.assigment.yuki.Day8;

public class CountDigit {
    public static int countDigit(int n){
        if(n==0){
            return 1;
        }
        return countDigit(n/10) + 1;
    }
    static void main(String[] args) {
        int n = 12345;
        System.out.println(countDigit(n));
    }
}
