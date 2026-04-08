package org.example.assigment.yuki.Day8;

public class PowerCalculation {
    public static int power(int n, int pw){
        if(pw==1){
            return n;
        }
        return n+power(n,pw-1);
    }
    public static void main(String[] args) {
        int n = 2;
        int pw = 4;
        System.out.println(power(n,pw));
    }
}
