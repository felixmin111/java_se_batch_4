package org.example.assigment.aung.day_4;
<<<<<<< HEAD

=======
>>>>>>> 84327f7f199cafb674366d2af7639c5b9ff25841
import java.util.Scanner;


public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject 1 mark: ");
        int subject1;
        subject1 = sc.nextInt();
        System.out.println("Enter Subject 2 mark: ");
        int subject2;
        subject2 = sc.nextInt();
        System.out.println("Enter Subject 3 mark: ");
        int subject3;
        subject3 = sc.nextInt();
        System.out.println("Enter Subject 4 mark: ");
        int subject4;
        subject4 = sc.nextInt();
        System.out.println("Enter Subject 5 mark: ");
        int subject5;
        subject5 = sc.nextInt();
        System.out.println("Enter Subject 6 mark: ");
        int subject6;
        subject6 = sc.nextInt();

        String subject1status;
        if (subject1<40) {
            subject1status = "D";
        }
        else if (subject1<60) {
            subject1status = "C";
        }
        else if (subject1<80) {
            subject1status = "B";
        }
        else if (subject1<=100) {
            subject1status = "A";
        }
        else {
            System.out.println("Invalid mark");
            subject1status = "Invalid";
        }

        String subject2status;
        if (subject2<40) {
            subject2status = "D";
        }
        else if (subject2<60) {
            subject2status = "C";
        }
        else if (subject2<80) {
            subject2status = "B";
        }
        else if (subject2<=90) {
            subject2status = "A";
        }
        else {
            System.out.println("Invalid mark");
            subject2status = "Invalid";
        }

        String subject3status;
        if (subject3<40) {
            subject3status = "D";
        }
        else if (subject3<60) {
            subject3status = "C";
        }
        else if (subject3<80) {
            subject3status = "B";
        }
        else if (subject3<=100) {
            subject3status = "A";
        }
        else {
            System.out.println("Invalid mark");
            subject3status = "Invalid";
        }

        String subject4status;
        if (subject4<40) {
            subject4status = "D";
        }
        else if (subject4<60) {
            subject4status = "C";
        }
        else if (subject4<80) {
            subject4status = "B";
        }
        else if (subject4<=100) {
            subject4status = "A";
        }
        else {
            System.out.println("Invalid mark");
            subject4status = "Invalid";
        }

        String subject5status;
        if (subject5<40) {
            subject5status = "D";
        }
        else if (subject5<60) {
            subject5status = "C";
        }
        else if (subject5<80) {
            subject5status = "B";
        }
        else if (subject5<=100) {
            subject5status = "A";
        }
        else {
            System.out.println("Invalid mark");
            subject5status = "Invalid";
        }

        String subject6status;
        if (subject6<40) {
            subject6status = "D";
        }
        else if (subject6<60) {
            subject6status = "C";
        }
        else if (subject6<80) {
            subject6status = "B";
        }
        else if (subject6<=100) {
            subject6status = "A";
        }
        else {
            System.out.println("Invalid mark");
            subject6status = "Invalid";
        }

        System.out.println("Grade subject1:" + subject1status);
        System.out.println("Grade subject2:" + subject2status);
        System.out.println("Grade subject3:" + subject3status);
        System.out.println("Grade subject4:" + subject4status);
        System.out.println("Grade subject5:" + subject5status);
        System.out.println("Grade subject6:" + subject6status);

        sc.close();
    }
}
