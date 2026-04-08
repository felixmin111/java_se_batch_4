package org.example.assigment.yuki.Day8;

public class RecursiveSum {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args){
        int n = 4;
        for(int i = 1; i<=n; i++){
            System.out.println(sum(i));
        }
    }

}
