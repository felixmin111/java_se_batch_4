package org.example.assigment.lapyae.day6;

public class starFor {
    public static void main(String[] args) {

        starFor1(5);


        starFor2(5);


        starFor3(5);


        starFor4(5);


        starFor5(5);


        starFor6(5);


        starFor7(5);


        starFor8(5);


        starFor9(5);


        starFor10(5);
    }
    public static void starFor1(int n) {
        System.out.println("Left Angled Triangle");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void starFor2(int n) {

        System.out.println("---------------------");
        System.out.println("Inverted Left Angled Triangle");
        for (int i = 1; i<=n; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void starFor3(int n) {

        System.out.println("---------------------");
        System.out.println("Pyramid");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) System.out.print(" ");
            for (int j = 1; j <= (2 * i - 1); j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void starFor4(int n) {

        System.out.println("---------------------");
        System.out.println("Inverted Pyramid");
        for (int i = n; i >= 1; i--) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void starFor5(int n) {

        System.out.println("---------------------");
        System.out.println("Left Angled Hollow Triangle");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void starFor6(int n) {

        System.out.println("---------------------");
        System.out.println("Inverted Left Angled Hollow Triangle");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void starFor7(int n) {

        System.out.println("---------------------");
        System.out.println("Hollow Pyramid");
        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {

                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void starFor8(int n) {

        System.out.println("---------------------");
        System.out.println("Inverted Hollow Pyramid");
        for (int i = n; i >= 1; i--) {
           
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {

                if (i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void starFor9(int n) {

        System.out.println("---------------------");
        System.out.println("Vertical Rectangle");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void starFor10(int n) {

        System.out.println("---------------------");
        System.out.println("X Pattern");
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
