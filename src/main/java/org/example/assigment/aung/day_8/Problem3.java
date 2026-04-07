package org.example.assigment.aung.day_8;

public class Problem3 {

    public static void main(String[] args) {
        String word = "hello";
        System.out.println(Reverse(word,word.length()-1));

    }
    public static String Reverse(String str, int i) {
        if (i==0) {
            return str.charAt(0) +"";
        }
        return str.charAt(i) + Reverse(str, i-1);


    }
}
