package org.example.Day7;

public class BrakeAndContinue {
    public static void main(String[] args) {
       continueTest();
        int length=findStringLength("Java");
        System.out.println("length-->"+length);
    }
    public static void breakTest() {
        for (int i = 0; i < 10; i++) {
            int j=0;
            while(i>=j) {
                System.out.println(j+"== while root running !!!!");
                if (i == 4 || i ==6) {
                    System.out.println("Brake done!");
                    break;
                }
                j++;
            }
            System.out.println(i);
        }
    }
    public static void continueTest() {
        for (int i = 0; i < 10; i++) {
            int j=0;
            while(i>=j) {
                j++;
                if (i == 4 || i ==6) {
                    System.out.println("Continue done!");
                    continue;
                }
                System.out.println(j+"== while root running !!!!");
            }
            System.out.println(i);
        }
    }
    public static int findStringLength(String str) {
        return str.length();
    }
}
