package org.example.assigment.aung.day_4;
import java.util.Scanner;


public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject 1 mark: ");
        int subject1 = sc.nextInt();
        System.out.println("Enter Subject 2 mark: ");
        int subject2 = sc.nextInt();
        System.out.println("Enter Subject 3 mark: ");
        int subject3 = sc.nextInt();
        System.out.println("Enter Subject 4 mark: ");
        int subject4 = sc.nextInt();
        System.out.println("Enter Subject 5 mark: ");
        int subject5 = sc.nextInt();
        System.out.println("Enter Subject 6 mark: ");
        int subject6 = sc.nextInt();

        String subject1status = Grading(subject1);
        String subject2status = Grading(subject2);
        String subject3status = Grading(subject3);
        String subject4status = Grading(subject4);
        String subject5status = Grading(subject5);
        String subject6status = Grading(subject6);



        System.out.println("Grade subject1:" + subject1status);
        System.out.println("Grade subject2:" + subject2status);
        System.out.println("Grade subject3:" + subject3status);
        System.out.println("Grade subject4:" + subject4status);
        System.out.println("Grade subject5:" + subject5status);
        System.out.println("Grade subject6:" + subject6status);

        sc.close();
    }
    public static String Grading(int mark){
        if (mark<40) {
            return "D";
        }
        else if (mark<60) {
            return  "C";
        }
        else if (mark<80) {
            return "B";
        }
        else if (mark<=100) {
            return "A";
        }
        else {
            System.out.println("Invalid mark");
            return "Invalid";
        }
    }
}
