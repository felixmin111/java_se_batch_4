package org.example.assigment.lapyae.day6;

public class star {
    public static void main(String[] args) {
        starEx();
        starEx1();
        starEx2();
        starEx3();
        starEx4();
        starEx5();
    }

    public static void starEx() {
        int count = 0;
        while (6 > count) {
            int innerCount = 0;
            while (count > innerCount) {
                System.out.print("* ");
                innerCount++;
            }
            System.out.println();
            count++;
        }
    }

    public static void starEx1() {
        int count = 0;
        while (6 > count) {
            int innerCount = 6;
            while (count < innerCount) {
                System.out.print("* ");
                innerCount--;
            }
            System.out.println();
            count++;
        }
    }

    public static void starEx2() {
        int count = 1;
        while (5 >= count) {
            int spaceCount = 1;
            while (spaceCount <= 5 - count) {
                System.out.print(" ");
                spaceCount++;
            }
            int innerCount = 1;
            while (innerCount <= (2 * count - 1)) {
                System.out.print("*");
                innerCount++;
            }
            System.out.println();
            count++;
        }
    }

    public static void starEx3() {
        int count = 5;
        int n = 5;
        while (count > 0) {

            int spaceCount = 0;
            while (spaceCount < (n - count)) {
                System.out.print(" ");
                spaceCount++;
            }

            int innerCount = 0;
            while (innerCount < (2 * count - 1)) {
                System.out.print("*");
                innerCount++;
            }
            System.out.println();
            count--;
        }
    }
    public static void starEx4() {
        int n = 5;

        System.out.println("* ");

        int count = 2;
        while (count < n) {
            System.out.print("* ");
            int spaceCount = 1;
            while (spaceCount <= (count - 2)) {
                System.out.print("  ");
                spaceCount++;
            }
            System.out.println("* ");
            count++;
        }

        int baseCount = 1;
        while (baseCount <= n) {
            System.out.print("* ");
            baseCount++;
        }
        System.out.println();
    }

    public static void starEx5() {
        int n = 5;

        int baseCount = 1;
        while (baseCount <= n) {
            System.out.print("* ");
            baseCount++;
        }
        System.out.println();

        int count = n - 1;
        while (count >= 2) {

            System.out.print("* ");

            int spaceCount = 1;
            while (spaceCount <= (count - 2)) {
                System.out.print("  ");
                spaceCount++;
            }

            System.out.println("* ");
            count--;
        }

        System.out.println("* ");
    }


}
