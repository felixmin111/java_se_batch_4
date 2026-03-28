package org.example.assigment.thiri.Day4;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        In_Out();
    }

    public static void In_Out() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Subject 1 mark: ");
        int sub1 = sc.nextInt();

        System.out.println("Enter Subject 2 mark: ");
        int sub2 = sc.nextInt();

        System.out.println("Enter Subject 3 mark: ");
        int sub3 = sc.nextInt();

        System.out.println("Enter Subject 4 mark: ");
        int sub4 = sc.nextInt();

        System.out.println("Enter Subject 5 mark: ");
        int sub5 = sc.nextInt();

        System.out.println("Subject 1 Grade: " + Grade(sub1));
        System.out.println("Subject 2 Grade: " + Grade(sub2));
        System.out.println("Subject 3 Grade: " + Grade(sub3));
        System.out.println("Subject 4 Grade: " + Grade(sub4));
        System.out.println("Subject 5 Grade: " + Grade(sub5));

        sc.close();
    }

    public static String Grade(int mark) {
        if (mark >= 80) {
            return "A+";
        } else if (mark >= 75) {
            return "A";
        }else if (mark >= 65) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}


