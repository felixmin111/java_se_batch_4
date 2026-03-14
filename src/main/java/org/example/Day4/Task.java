package org.example.Day4;

import java.util.Scanner;

public class Task {
//    public static void adding(){
//        int total=3+4;
//        System.out.println("Total is "+total);
//    }
    public static void adding(int num1,int num2,int num3){
        int total=num1+num2+num3;
        System.out.println("Total is "+total);
    }

    public static void multiplicationTable(int multipiiler){
        System.out.println("<-----------------Multiplication Table For "+multipiiler+"------------------->");
        System.out.println("1 * " + multipiiler+"="+(1*multipiiler));
        System.out.println("2 * " + multipiiler+"="+(2*multipiiler));
        System.out.println("3 * " + multipiiler+"="+(3*multipiiler));
        System.out.println("4 * " + multipiiler+"="+(4*multipiiler));
        System.out.println("5 * " + multipiiler+"="+(5*multipiiler));
        System.out.println("6 * " + multipiiler+"="+(6*multipiiler));
        System.out.println("7 * " + multipiiler+"="+(7*multipiiler));
        System.out.println("8 * " + multipiiler+"="+(8*multipiiler));
        System.out.println("9 * " + multipiiler+"="+(9*multipiiler));
        System.out.println("10 * " + multipiiler+"="+(10*multipiiler));
    }
    public static void main(String[] args) {
      adding(1,2,4);
      multiplicationTable(2);
      multiplicationTable(3);
      multiplicationTable(4);
    }
}
