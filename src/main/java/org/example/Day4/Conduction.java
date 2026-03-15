package org.example.Day4;

import org.example.Day5.Person;

import java.util.Scanner;

public class Conduction {
    public static void main(String[] args) {
        //if value is equal they will share the heap address and the same value
//        String gender="sdfsdfsdf";
//        String gender2="male";

        //create new value in heap
        String gender1=new String("male");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender=sc.nextLine();

        if(gender.equalsIgnoreCase( "male")){
            System.out.print("25% discount ");
        }else if(gender.equalsIgnoreCase("female")){
            System.out.print("50% discount ");
        }else{
            System.out.print("Please Enter Valid Gender");
        }

    }

    public static void adding(){
        int total=3+5;
        System.out.println("Total is "+total);
    }
}
