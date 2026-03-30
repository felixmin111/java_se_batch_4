package org.example.assigment.aung.day_6;

import javax.sound.midi.SysexMessage;

public class StringPractice {

    public static void main(String[] args) {
        display();
    }

    public static void display() {
        /*
        System.out.println("Problem 1");
        System.out.println("------------------");
        Problem1();
        System.out.println("------------------");

        System.out.println("Problem 2");
        System.out.println("------------------");
        Problem2();
        System.out.println("------------------");

        System.out.println("Problem 3");
        System.out.println("------------------");
        Problem3();
        System.out.println("------------------");

        System.out.println("Problem 4");
        System.out.println("------------------");
        Problem4();
        System.out.println("------------------");

        System.out.println("Problem 5");
        System.out.println("------------------");
        Problem5();
        System.out.println("------------------");

        System.out.println("Problem 6");
        System.out.println("------------------");
        Problem6();
        System.out.println("------------------");

        System.out.println("Problem 7");
        System.out.println("------------------");
        Problem7();
        System.out.println("------------------");

        System.out.println("Problem 8");
        System.out.println("------------------");
        Problem8();
        System.out.println("------------------");

        System.out.println("Problem 9");
        System.out.println("------------------");
        Problem9();
        System.out.println("------------------");

        System.out.println("Problem 10");
        System.out.println("------------------");
        Problem10();
        System.out.println("------------------");



        System.out.println("Problem 11");
        System.out.println("------------------");
        Problem11();
        System.out.println("------------------");


        System.out.println("Problem 12");
        System.out.println("------------------");
        Problem12();
        System.out.println("------------------");

        System.out.println("Problem 13");
        System.out.println("------------------");
        Problem13();
        System.out.println("------------------");

        System.out.println("Problem 14");
        System.out.println("------------------");
        Problem14();
        System.out.println("------------------");

        System.out.println("Problem 15");
        System.out.println("------------------");
        Problem15();
        System.out.println("------------------");

        System.out.println("Problem 16");
        System.out.println("------------------");
        Problem16();
        System.out.println("------------------");


        */

        System.out.println("Problem 17");
        System.out.println("------------------");
        Problem17();
        System.out.println("------------------");

        System.out.println("Problem 18");
        System.out.println("------------------");
        Problem18();
        System.out.println("------------------");

        System.out.println("Problem 19");
        System.out.println("------------------");
        Problem19();
        System.out.println("------------------");

        System.out.println("Problem 20");
        System.out.println("------------------");
        Problem20();
        System.out.println("------------------");

        System.out.println("Problem 21");
        System.out.println("------------------");
        Problem21();
        System.out.println("------------------");

        System.out.println("Problem 22");
        System.out.println("------------------");
        Problem22();
        System.out.println("------------------");
        /*

        System.out.println("Problem 23");
        System.out.println("------------------");
        Problem23();
        System.out.println("------------------");

        System.out.println("Problem 24");
        System.out.println("------------------");
        Problem24();
        System.out.println("------------------");

        System.out.println("Problem 25");
        System.out.println("------------------");
        Problem25();
        System.out.println("------------------");

        System.out.println("Problem 26");
        System.out.println("------------------");
        Problem26();
        System.out.println("------------------");

        System.out.println("Problem 27");
        System.out.println("------------------");
        Problem27();
        System.out.println("------------------");

        System.out.println("Problem 28");
        System.out.println("------------------");
        Problem28();
        System.out.println("------------------");

        System.out.println("Problem 29");
        System.out.println("------------------");
        Problem29();
        System.out.println("------------------");

        System.out.println("Problem 30");
        System.out.println("------------------");
        Problem30();
        System.out.println("------------------");
         */
    }

    public static void Problem1() {
        System.out.println("HelloWorld".length());

    }

    public static void Problem2() {
        String Test = "";
        if (Test.isEmpty()) {
            System.out.println("It is empty");

        }
    }


    public static void Problem3() {
        String str = "Java";
        for (int count=0; count<str.length(); count++) {
            System.out.println(str.charAt(count));
        }

    }


    public static void Problem4() {
        String str = "Programming";
        String result = str.charAt(0) + " and " + str.charAt(str.length()-1);
        System.out.println(result);

    }

    public static void Problem5() {
        String str = "Education";
        int vowel = 0;
        for (int count=0; count<str.length(); count++) {
            char character = Character.toLowerCase(str.charAt(count));
            boolean condition = character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
            if (condition) {
                vowel++;

            }
        }
        System.out.println("Vowel count: " + vowel);

    }


    public static void Problem6() {
        String str = "banana";
        char a = 'a';
        System.out.println("First occurrence of A: position "+ str.indexOf('a'));
    }


    public static void Problem7() {
        String str = "zebra";
        if (str.indexOf('z') != -1) {
            System.out.println("Z exists");
        }
    }

    public static void Problem8() {
        String str = "banana";
        int first_occurence = str.indexOf('a');
        int second_occurence = str.indexOf('a', first_occurence+1);
        System.out.println("Second occurrence: " + second_occurence);
    }

    public static void Problem9() {
        String name = "Min Maung";
        String substring = name.substring(0,3);
        System.out.println(substring);
    }


    public static void Problem10() {
        String email = "test@gmail.com";
        String substring = email.substring(5);
        System.out.println(substring);
    }

    public static void Problem11() {
        String str = "abcdefg";
        int middle = str.length()/2;
        System.out.println(str.substring(middle-1,middle+2));

    }

    public static void Problem12() {
        String input = "admin123";
        boolean check = input.equals("admin123");
        if (check) {
            System.out.println("Correct Password");
        }
        else {
            System.out.println("Incorrect Password");
        }
    }

    public static void Problem13() {
        String str1 = "JAVA";
        String str2 = "java";
        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("same string but different case");
        }
        else {
            System.out.println("Different");
        }
    }

    public static void Problem14() {
        String str = "SoMe MiXeD CaSe StRiNg";
        str = str.toLowerCase();
        int vowel = 0;
        for (int count=0; count<str.length(); count++) {
            char character = str.charAt(count);
            boolean condition = character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
            if (condition) {
                vowel++;

            }
        }
        System.out.println("Vowel count: " + vowel);
    }

    public static void Problem15() {
        String name = "min maung";
        String upper = name.toUpperCase();
        System.out.println(upper);
    }

    public static void Problem16() {
        String sentence = "I am learning Java.";
        if (sentence.contains("Java")){
            System.out.println("It contains Java.");
        }
        else {
            System.out.println("It doesn't contain Java.");
        }
    }

    // Problem 17: Starts with vowel
    public static void Problem17() {
        String str = "Apple";
        // TODO: Check whether string starts with a vowel
    }

    // Problem 18: Check email
    public static void Problem18() {
        String email = "user@domain.com";
        // TODO: Check whether email ends with ".com"
    }

    // --- 8. Problems using replace() ---

    // Problem 19: Replace spaces
    public static void Problem19() {
        String sentence = "This is a test sentence.";
        // TODO: Replace all spaces with "-"
    }

    // Problem 20: Hide vowels
    public static void Problem20() {
        String str = "Hide these vowels";
        // TODO: Replace all vowels with '*'
    }

    // --- 9. Problems using split() ---

    // Problem 21: Count words
    public static void Problem21() {
        String sentence = "Count how many words are in this sentence.";
        // TODO: Count how many words it has
    }

    // Problem 22: Print words line by line
    public static void Problem22() {
        String sentence = "Split this by spaces";
        // TODO: Split by spaces and print each word in a new line
    }

    // --- 10. Problems using loop + condition ---

    // Problem 23: Count even numbers
    public static void Problem23() {
        // TODO: Print how many even numbers are between 1 and 20
    }

    // Problem 24: Sum of odd numbers
    public static void Problem24() {
        // TODO: Find the sum of all odd numbers from 1 to 15
    }

    // Problem 25: Multiplication table
    public static void Problem25() {
        // TODO: Print multiplication table of 5
    }

    // Problem 26: Find biggest number
    public static void Problem26() {
        int a = 10;
        int b = 25;
        int c = 15;
        // TODO: Given 3 numbers, find the biggest one using if-else
    }

    // Problem 27: Grade checker
    public static void Problem27() {
        int marks = 75;
        // TODO: Print A(>=80), B(>=60), C(>=40), or Fail
    }

    // --- 11. Problems using Character methods ---

    // Problem 28: Count digits
    public static void Problem28() {
        String str = "abc123";
        // TODO: Count how many digits are in the string
    }

    // Problem 29: Count letters
    public static void Problem29() {
        String str = "a1b2c3";
        // TODO: Count how many letters are in it
    }

    // Problem 30: Count uppercase and lowercase
    public static void Problem30() {
        String str = "JaVa";
        // TODO: Count uppercase and lowercase letters separately
    }
}
