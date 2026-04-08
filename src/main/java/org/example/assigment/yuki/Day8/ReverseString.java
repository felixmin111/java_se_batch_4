package org.example.assigment.yuki.Day8;

public class ReverseString {
    public static String reverse(String str){
        if(str.length()==0){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));
    }
}
