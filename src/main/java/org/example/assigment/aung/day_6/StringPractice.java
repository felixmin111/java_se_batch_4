package org.example.assigment.aung.day_6;

import javax.sound.midi.SysexMessage;

public class StringPractice {

    public static void main(String[] args) {
        display();
    }

    public static void display() {

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

    public static void Problem17() {
        String str = "Apple";
        str = str.toLowerCase();
        boolean vowel_start = str.startsWith("a") || str.startsWith("e") || str.startsWith("i") || str.startsWith("o") || str.startsWith("u");
        if (vowel_start) {
            System.out.println("It starts with a vowel.");
        }
    }

    public static void Problem18() {
        String email = "user@domain.com";
        if (email.endsWith(".com")) {
            System.out.println("It ends with .com");
        }
    }

    public static void Problem19() {
        String sentence = "This is a test sentence.";
        // TODO: Replace all spaces with "-"
        System.out.println(sentence.replace(' ', '-'));
    }

    public static void Problem20() {
        String str = "Hide these vowels";
        str = str.replace('a','*');
        str = str.replace('A','*');
        str = str.replace('e','*');
        str = str.replace('E','*');
        str = str.replace('i','*');
        str = str.replace('I','*');
        str = str.replace('o','*');
        str = str.replace('O','*');
        str = str.replace('u','*');
        str = str.replace('U','*');
        System.out.println(str);
    }

    public static void Problem21() {
        String sentence = "Count how many words are in this sentence.";
        String[] words = sentence.split(" ");
        System.out.println("Word count: " + words.length);
    }

    public static void Problem22() {
        String sentence = "Split this by spaces";
        String[] words = sentence.split(" ");
        for (String lines : words) {
            System.out.println(lines);
        }
    }

    public static void Problem23() {
        int count = 0;
        for (int i=1; i <=20; i++ ) {
            if (i%2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void Problem24() {
        int count = 0;
        for (int i=1; i <=15; i++ ) {
            if (i%2 != 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void Problem25() {
        for (int i=0; i<=12; i++) {
            System.out.println("5 x "+i+" = "+ 5*i);
        }
    }

    public static void Problem26() {
        int a = 10;
        int b = 25;
        int c = 15;
        if (a>b && a>c) {
            System.out.println("The biggest number is "+ a);
        } else if (b>a && b>c) {
            System.out.println("The biggest number is "+ b);
        }
        else {
            System.out.println("The biggest number is "+ c);
        }
    }

    public static void Problem27() {
        int marks = 75;
        if (marks>=80) {
            System.out.println("A");
        } else if (marks>=60) {
            System.out.println("B");
        } else if (marks>=40) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }

    public static void Problem28() {
        String str = "abc123";
        int digits = 0;
        for (int count=0; count<str.length(); count++) {
            boolean check = Character.isDigit(str.charAt(count));
            if (check) {
                digits++;
            }
        }
        System.out.println(digits);
    }

    public static void Problem29() {
        String str = "a1b2c3";
        int letters = 0;
        for (int count=0; count<str.length(); count++) {
            boolean check = Character.isLetter(str.charAt(count));
            if (check) {
                letters++;
            }
        }
        System.out.println(letters);
    }

    public static void Problem30() {
        String str = "JaVa";
        int upper = 0;
        int lower = 0;
        for (int count=0; count<str.length(); count++) {
            boolean check1 = Character.isUpperCase(str.charAt(count));
            boolean check2 = Character.isLowerCase(str.charAt(count));
            if (check1) {
                upper++;
            }
            else if (check2) {
                lower++;
            }
        }
        System.out.println("Upper case letters: "+ upper);
        System.out.println("Lower case letters: "+ lower);
    }
}
