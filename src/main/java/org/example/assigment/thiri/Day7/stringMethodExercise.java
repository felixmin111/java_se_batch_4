package org.example.assigment.thiri.Day7;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Locale;

public class stringMethodExercise {
    public static void main (String [] args) {
        //1.
        findingStringLength("HelloWorld");
        System.out.println();

        //2.
        checkingEmptyString(" ");
        checkingEmptyString("hi");
        System.out.println();

        //3.
        printingEachChar("Java");
        System.out.println();

        //4.
        printingFirstAndLastChar("Java");
        System.out.println();

        //5.
        countingVowels("Aeroplane");
        System.out.println();

        //6.
        findingFirstOccurrence("banana");
        System.out.println();

        //7.
        findingCharExitsOrNot("apple");
        findingCharExitsOrNot("Zara");
        System.out.println();

        //8.
        findingSecondOccurrence("cover");
        findingSecondOccurrence("apple");
        findingSecondOccurrence("banana");
        System.out.println();

        //9.
        extractingFirstName("Min Maung");
        System.out.println();

        //10.
        extractingDomain("test@gmail.com");
        System.out.println();

        //11.
        extractingMiddlePart("Apple");
        System.out.println();

        //12.
        passwordChecking("admin123");
        passwordChecking("hello");
        System.out.println();

        //13.
        comparingInsensitiveCase("pretty" , "pretty");
        comparingInsensitiveCase("JaVa" , "java");
        comparingInsensitiveCase("APPLE", "Banana");
        System.out.println();

        //14.
        countingLowercaseVowels("HEHE HOHOOO HAHAAAAAA");
        System.out.println();

        //15.
        convertingNameToUpperCase("min maung");
        System.out.println();

        //16.
        checkingWordExistence("Java is interesting.");
        checkingWordExistence("Python is easier.");
        System.out.println();

        //17.
        checkingStartWithVowel("I love you.");
        checkingStartWithVowel("You looks so pretty.");
        System.out.println();

        //18.
        checkingEmailEnding("theerimoetheint.com");
        checkingEmailEnding("TP084523@mail.apu.edu.my");
        System.out.println();

        //19.
        replacingSpaces("My name is Thiri Moe Theint.");
        System.out.println();

        //20.
        hidingVowels("Long Time No See");
        System.out.println();

        //21.
        countingWords("My brother is my favourite existence.");
        System.out.println();

        //22.
        printingWordsLineByLine("Love Flower Perfume");
        System.out.println();

        //23.
        countingEvenNumbers(1, 20);
        System.out.println();

        //24.
        sumOfOddNumbers(1,15);
        System.out.println();

        //25.
        multiplicationTable(5);
        System.out.println();

        //26.
        findingBiggestNumber(11, 12, 19);
        System.out.println();

        //27.
        gradeChecker(80);
        System.out.println();

        //28.
        countingDigits("abc123");
        System.out.println();

        //29.
        countingLetters("a1b2c3");
        System.out.println();

        //30.
        countingUpperCaseLowerCase("JaVa");
    }

    //length()

    //1. Write a program that prints the length of "HelloWorld"
    public static void findingStringLength(String word) {
        int length = word.strip().length();
        System.out.println("1. The length of \"" + word + "\" is " + length + ".");
    }

    //2. Write a program that checks whether a string is empty or not.
    public static void checkingEmptyString(String word) {
        word = word.strip();
        int length = word.length();

        if (length == 0) {
            System.out.println("2a. The string is empty.");
        } else {
            System.out.println("2b. The string exists. It is \"" + word + "\".");}
    }

    //charAt()

    //3. Given "Java", print each character one by one using a loop.
    public static void printingEachChar(String word) {
        System.out.print("3.");

        for (int i = 0; i < word.length() ; i++) {
            if (i == 0) {
                System.out.println(" " + word.charAt(i));
            }else{System.out.println("   " + word.charAt(i));}
        }
    }

    //4. Given a string, print its first and last character.
    public static void printingFirstAndLastChar(String word) {
        word = word.strip();
        int last = word.length() - 1;
        System.out.println("4. Fist Character of \"" + word + "\" is \"" + word.charAt(0) +
                              "\" and last character is \"" + word.charAt(last) + "\".");
    }

    //5. Given a string, count how many vowels are in it.
    public static void countingVowels(String word) {
        String words = word.toLowerCase();
        int count = 0;
        for(int i = 0; i < words.length(); i++) {

            char ch = words.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("5. There are " + count + " vowels in the word of \"" + word + "\".");
    }

    //indexOf()

    //6. Given "banana", find the first position of 'a'.
    public static void findingFirstOccurrence(String word) {
        int firstOccurrence = word.indexOf("a") + 1;
        System.out.println ("6. The first position of 'a' in a given string '" + word +"' is " + firstOccurrence + ".");
    }

    //7. Given a string, check whether 'z' exists in it using indexOf().
    public static void findingCharExitsOrNot(String word) {

        int ch = word.toLowerCase().indexOf("z");
        if (ch >= 0) {
            System.out.println("7a. 'z' exits in in the word '" + word + "'.");
        } else {
            System.out.println("7b. There is no 'z' in the word '" + word + "'.");
        }
    }

    //8. Given "banana", find the second occurrence of 'a'.
    public static void findingSecondOccurrence(String word) {
        word = word.strip();
        int first = word.toLowerCase().indexOf('a');

        if (first == -1) {
            System.out.println("8a. There is no 'a' in the word of '" + word + "'.");
        }

        int second = word.toLowerCase().indexOf('a', first + 1);
        if (second == -1 && first > -1) {
            System.out.println("8b. There is no second 'a' in the word of '" + word + "'.");
        }else if (second > -1 && first > -1) {
            System.out.println("8c. The second occurrence of 'a' in the word of '" + word + "' is " + (second + 1) +".");
        }
    }

    //substring()

    //9. Given "Min Maung", print only "Min".
    public static void extractingFirstName(String word) {
        int space = word.indexOf(" ");
        String first = word.substring(0,space);
        System.out.println("9. The first name of the name '" + word + "' is '" + first + "'.");
    }

    //10. Given "test@gmail.com", print only "gmail.com".
    public static void extractingDomain(String word) {
        int ch = word.indexOf("@");
        String ending = word.substring(ch+1);
        System.out.println("10. The domain of '" + word + "' is '" + ending + "'.");
    }

    //11. Given a string, print 3 characters from the middle.
    public static void extractingMiddlePart(String word) {
        int middle = word.length() /2;
        String middlePart = word.substring(middle-1, middle+2);
        System.out.println("11. 3 characters from the middle of the word '" + word + "' is '" + middlePart + "'.");

    }

    //equals() and
    //12. Write a program that checks whether input is equal to "admin123"
    public static void passwordChecking(String word) {
        String password = "admin123";

        if (word.equals(password)) {
            System.out.println("12a. Password is correct. Welcome to the system");
        } else {
            System.out.println("12b. Password is incorrect.");
        }
    }

    //equalsIgnoreCase()
    //13. Check whether "JAVA" and "java" are equal ignoring case.
    public static void comparingInsensitiveCase(String word1, String word2) {
        if (word1.equals(word2)) {
            System.out.println("13a. '" + word1 + "' and '" + word2 + "' are same words.");}
        else if (word1.equalsIgnoreCase(word2)) {
            System.out.println("13b. '" + word1 + "' and '" + word2 + "' are equal ignoring case");
        }else{System.out.println("13c. '" + word1 + "' and '" + word2 + "' are not same words.");}
    }

    //toLowerCase(),
    //14. Convert the whole string to lowercase first, then count vowels.
    public static void countingLowercaseVowels(String word) {
        System.out.println ("14. The process and result is same with Problem 5. So I called function - countingVowels().");
        countingVowels(word.toLowerCase());
    }

    //toUpperCase()
    //15. Given "min maung", convert it to uppercase.
    public static void convertingNameToUpperCase(String word) {
        String word1 = word.toUpperCase();
        System.out.println("15. The upper case of the word '" + word + "' is '" + word1 + "'.");
    }

    //contains(),
    //16. Given a sentence, check whether it contains "Java".
    public static void checkingWordExistence(String word) {
        if (word.contains("Java")) {
            System.out.println("16a. The sentence '" + word + "' contains the word 'Java'");
        }else{System.out.println("16b. The sentence '" + word + "' does not contain the word 'Java'");
        }
    }

    // startsWith(),
    //17. Check whether a string starts with a vowel.
    public static void checkingStartWithVowel(String word) {
        String word1 = word.toLowerCase();
        if (word1.startsWith("a") || word1.startsWith("e") || word1.startsWith("i") ||
        word1.startsWith("o") || word1.startsWith("u")) {
            System.out.println("17a. The string '" + word + "' starts with a vowel.");
        }else {System.out.println("17b. The string '" + word + "' does not start with a vowel.");
        }
    }

    //endsWith()
    //18. Check whether an email ends with ".com".
    public static void checkingEmailEnding(String word) {

        if (word.endsWith(".com")) {
            System.out.println("18a. The string '" + word + "' ends with '.com'.");
        }else {System.out.println("18b. The string '" + word + "' does not end with '.com'.");
        }
    }

    //replace()

    //19. Replace all spaces in a sentence with "-".
    public static void replacingSpaces(String word) {
        String word1 = word.replace(" ", "-");
        System.out.println("19. The original string is '" + word + "'. \n    " +
                "The new string is '" + word1 + "'.");
    }

    //20. Replace all vowels with '*'.
    public static void hidingVowels(String word) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        String word1 = word;
        for (String vowel : vowels) {
            word1 = word1.replace(vowel, "*");
        }
        System.out.println("20. The original string is '" + word + "'. \n    " +
                "The new string is '" + word1 + "'.");
    }

    //split()

    //21. Given a sentence, count how many words it has.
    public static void countingWords(String sentence) {
        String[] word1 = sentence.split(" ");
        int count = 0;
        for (String word: word1) {
            count++;
        }
        System.out.println("21. There are " + count + " words in the sentence of '" + sentence + "'.");
    }

    //22. Split a sentence by spaces and print each word in a new line.
    public static void printingWordsLineByLine(String sentence) {
        String[] words = sentence.split(" ");
        System.out.print("22. ");

        for (String word : words) {
            if (word.equals(words[0])) {
                System.out.println(word);
            } else {
                System.out.println("    " + word);
            }
        }
    }

    // loop + condition

    //23. Print how many even numbers are between 1 and 20.
    public static void countingEvenNumbers(int num1, int num2) {

        int first = Math.min(num1, num2);
        int second = Math.max(num1, num2);
        int count = 0;

        for (int i = first+1 ; i < second; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        System.out.println("23. There are " + count + " even numbers between " + num1 + " and " + num2 + ".(exclusive)");
    }

    //24. Find the sum of all odd numbers from 1 to 15.
    public static void sumOfOddNumbers(int num1, int num2) {
        int first = Math.min(num1, num2);
        int second = Math.max(num1, num2);
        int sum = 0;

        for (int i = first ; i < second+1; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("24. The sum of all odd numbers from " + num1 + " to " + num2 + " is "+  sum + ".");
    }

    //25. Print multiplication table of 5.
    public static void multiplicationTable(int num) {
        int num1;
        System.out.println("25. Multiplication Table of " + num);
        for (int i=1; i <= 10; i++) {
            num1 = num * i;
            System.out.println("    " + num + " * " + i + " = " + num1);
        }
    }

    //26. Given 3 numbers, find the biggest one using if-else.
    public static void findingBiggestNumber(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }else if (num3 > max) {
            max = num3;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("26. The biggest number is "+  max + " among " + num1 + ", "+ num2 + " and "+ num3 +".");
    }

    //27. Given marks, print:
    //A if 80 and above
    //B if 60 and above
    //C if 40 and above
    //Fail otherwise
    public static void gradeChecker(int mark) {

        if (mark >= 80) {
            System.out.println("27. The student got " + mark + " marks which is eqalvilant to Grade 'A'.");
        }else if (mark >= 60) {
            System.out.println("27. The student got " + mark + " marks which is eqalvilant to Grade 'B'.");
        }else if (mark >= 40) {
            System.out.println("27. The student got " + mark + " marks which is eqalvilant to Grade 'C'.");
        }else {
            System.out.println("27. The student got " + mark + " marks. !!! Fail !!!");
        }
    }

    // Character methods

    //28. Given "abc123", count how many digits are in the string.
    public static void countingDigits(String word) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                count++;
            }
        }
        System.out.println("28. There are " + count + " digits in the string of '" + word +"'.");
    }

    //29. Given "a1b2c3", count how many letters are in it.
    public static void countingLetters(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                count++;
            }
        }
        System.out.println("29. There are " + count + " letters in the string of '" + word +"'.");
    }

    //30. Given "JaVa", count uppercase and lowercase letters separately.
    public static void countingUpperCaseLowerCase(String word) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < word.length(); i++) {

            if (Character.isUpperCase(word.charAt(i))) {
                count1++;
            }

            if (Character.isLowerCase(word.charAt(i))) {
                count2++;
            }
        }
        System.out.println("30. There are " + count1 + " upper case and " +count2 + " lower case letters in the string of '" + word +"'.");
    }
}
