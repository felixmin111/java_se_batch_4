package org.example.assigment.lapyae.day6;

public class StringExercises {
    public static void main(String[] args) {
        display();
    }
    public static void display() {
        System.out.println("--- Exercise 1 ---");
        ex1();
        System.out.println();

        System.out.println("--- Exercise 2 ---");
        ex2();
        System.out.println();

        System.out.println("--- Exercise 3 ---");
        ex3();
        System.out.println();

        System.out.println("--- Exercise 4 ---");
        ex4();
        System.out.println();

        System.out.println("--- Exercise 5 ---");
        ex5();
        System.out.println();

        System.out.println("--- Exercise 6 ---");
        ex6();
        System.out.println();

        System.out.println("--- Exercise 7 ---");
        ex7();
        System.out.println();

        System.out.println("--- Exercise 8 ---");
        ex8();
        System.out.println();

        System.out.println("--- Exercise 9 ---");
        ex9();
        System.out.println();

        System.out.println("--- Exercise 10 ---");
        ex10();
        System.out.println();

        System.out.println("--- Exercise 11 ---");
        ex11();
        System.out.println();

        System.out.println("--- Exercise 12 ---");
        ex12();
        System.out.println();

        System.out.println("--- Exercise 13 ---");
        ex13();
        System.out.println();

        System.out.println("--- Exercise 14 ---");
        ex14();
        System.out.println();

        System.out.println("--- Exercise 15 ---");
        ex15();
        System.out.println();

        System.out.println("--- Exercise 16 ---");
        ex16();
        System.out.println();

        System.out.println("--- Exercise 17 ---");
        ex17();
        System.out.println();

        System.out.println("--- Exercise 18 ---");
        ex18();
        System.out.println();

        System.out.println("--- Exercise 19 ---");
        ex19();
        System.out.println();

        System.out.println("--- Exercise 20 ---");
        ex20();
        System.out.println();

        System.out.println("--- Exercise 21 ---");
        ex21();
        System.out.println();

        System.out.println("--- Exercise 22 ---");
        ex22();
        System.out.println();

        System.out.println("--- Exercise 23 ---");
        ex23();
        System.out.println();

        System.out.println("--- Exercise 24 ---");
        ex24();
        System.out.println();

        System.out.println("--- Exercise 25 ---");
        ex25();
        System.out.println();

        System.out.println("--- Exercise 26 ---");
        ex26();
        System.out.println();

        System.out.println("--- Exercise 27 ---");
        ex27();
        System.out.println();

        System.out.println("--- Exercise 28 ---");
        ex28();
        System.out.println();

        System.out.println("--- Exercise 29 ---");
        ex29();
        System.out.println();

        System.out.println("--- Exercise 30 ---");
        ex30();
        System.out.println();
    }

    public static void ex1() {
        String text = "HelloWorld";
        System.out.println(text.length());
    }

    public static void ex2() {
        String text = "";
        System.out.println(text.isEmpty());
    }

    public static void ex3() {
        String text = "Java";

        for (int i = 0; i < text.length(); i++) {

            System.out.println(text.charAt(i));
        }
    }

    public static void ex4() {
        String text = "Programming";
        char first = text.charAt(0);
        char last = text.charAt(text.length() - 1);

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
    }

    public static void ex5() {
        String text = "Education";
        int count = 0;

        String lowerText = text.toLowerCase();

        for (int i = 0; i < lowerText.length(); i++) {
            char c = lowerText.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println("Vowel count: " + count);
    }

    public static void ex6() {
        String text = "banana";

        int index = text.indexOf('a');
        System.out.println("First 'a' is at index: " + index);
    }

    public static void ex7() {
        String text = "banana";

        if (text.indexOf('z') != -1) {
            System.out.println("'z' exists in the string.");
        } else {
            System.out.println("'z' does not exist.");
        }
    }

    public static void ex8() {
        String text = "banana";

        int first = text.indexOf('a');

        int second = text.indexOf('a', first + 1);

        System.out.println("Second 'a' is at index: " + second);
    }

    public static void ex9() {
        String name = "Lin Lin";

        String firstName = name.substring(0, 3);
        System.out.println(firstName);
    }

    public static void ex10() {
        String email = "lapyaea.30@gmail.com";

        int atPosition = email.indexOf('@');

        String domain = email.substring(atPosition + 1);
        System.out.println(domain);
    }

    public static void ex11() {
        String text = "abcdefg";
        int middle = text.length() / 2;

        String midPart = text.substring(middle - 1, middle + 2);
        System.out.println(midPart);
    }

    public static void ex12() {
        String input = "admin123";

        if (input.equals("admin123")) {
            System.out.println("Correct Password");
        }
    }

    public static void ex13() {
        String s1 = "JAVA";
        String s2 = "java";

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("They are the same word!");
        }
    }

    public static void ex14() {
        String text = "SoMe MiXeD CaSe StRiNg";

        String lower = text.toLowerCase();

        int vowelCount = 0;
        for (int i = 0; i < lower.length(); i++) {
            char c = lower.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Vowel count: " + vowelCount);
    }

    public static void ex15() {
        String name = "min maung";

        String upperName = name.toUpperCase();

        System.out.println(upperName);
    }

    public static void ex16() {
        String sentence = "I am learning Java.";

        if (sentence.contains("Java")) {
            System.out.println("It contains Java.");
        } else {
            System.out.println("It doesn't contain Java.");
        }
    }

    public static void ex17() {
        String str = "Apple";
        String lower = str.toLowerCase();


        if (lower.startsWith("a") || lower.startsWith("e") ||
                lower.startsWith("i") || lower.startsWith("o") ||
                lower.startsWith("u")) {
            System.out.println("It starts with a vowel.");
        }
    }

    public static void ex18() {
        String email = "user@domain.com";

        if (email.endsWith(".com")) {
            System.out.println("It ends with .com");
        }
    }

    public static void ex19() {
        String sentence = "This is a test sentence.";

        String result = sentence.replace(' ', '-');
        System.out.println(result);
    }

    public static void ex20() {
        String str = "Hide these vowels";

        String result = str.replace('a', '*')
                .replace('e', '*')
                .replace('i', '*')
                .replace('o', '*')
                .replace('u', '*')
                .replace('A', '*')
                .replace('E', '*')
                .replace('I', '*')
                .replace('O', '*')
                .replace('U', '*');
        System.out.println(result);
    }

    public static void ex21() {
        String sentence = "Count how many words are in this sentence.";

        String[] words = sentence.split(" ");

        System.out.println("Word count: " + words.length);
    }

    public static void ex22() {
        String sentence = "Split this by spaces";
        String[] words = sentence.split(" ");


        for (String w : words) {
            System.out.println(w);
        }
    }

    public static void ex23() {
        int count = 0;

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Even numbers count: " + count);
    }

    public static void ex24() {
        int sum = 0;

        for (int i = 1; i <= 15; i++) {

            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of odd numbers: " + sum);
    }

    public static void ex25() {
        int number = 5;

        for (int i = 1; i <= 12; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }

    public static void ex26() {
        int a = 10, b = 25, c = 15;

        if (a >= b && a >= c) {
            System.out.println("The biggest number is " + a + ".");
        }

        else if (b >= a && b >= c) {
            System.out.println("The biggest number is " + b + ".");
        }

        else {
            System.out.println("The biggest number is " + c + ".");
        }
    }

    public static void ex27() {
        int marks = 75;

        if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    public static void ex28() {
        String str = "abc123";
        int digits = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                digits++;
            }
        }
        System.out.println("Digits count: " + digits);
    }

    public static void ex29() {
        String str = "a1b2c3";
        int letters = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            }
        }
        System.out.println("Letters count: " + letters);
    }

    public static void ex30() {
        String str = "JaVa";
        int upper = 0;
        int lower = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            }
        }
        System.out.println("Upper case letters: " + upper);
        System.out.println("Lower case letters: " + lower);
    }
}
