package org.example.assigment.thiri.Day8;

public class recursiveVisualization {
    public static void main(String[] args) {

        System.out.println(recursiveSum(5));
        System.out.println(powerCalculation(2, 4));
        System.out.println(reverseString("hello"));
        System.out.println(countDigit(12345));
        System.out.println(fibonacciNumber(6));

    }

    public static int recursiveSum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + recursiveSum(num - 1);
    }

    public static int powerCalculation(int num1, int num2) {
        if (num2 == 1) {
            return num1;
        }
        return num1 * powerCalculation(num1, num2 - 1);
    }

   public static String reverseString(String word) {
        if (!word.isEmpty() && !word.contains(" ") && word.length() <= 100) {
            if (word.length() == 1) {
                return word;
            }

        }else{return("Invalid Output");}
        return word.charAt(word.length()-1) + reverseString(word.substring(0,word.length()-1));
   }
    public static int countDigit(int num) {

        if (num / 10 <= 0) {
            return 1;
        }
        return 1 + countDigit(num / 10);
    }

    public static int fibonacciNumber(int count) {

        if (count == 0) {
            return 0;
        }else if (count == 1){
            return 1;
        }
        return fibonacciNumber(count - 1) + fibonacciNumber(count - 2);
    }
}


