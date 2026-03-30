package org.example.assigment.lapyae.day6;

public class star {
    public static void main(String[] args) {
        starEx();
        starEx1();
        starEx2();
        starEx3();
        starEx4();
        starEx5();
        starEx6();
        starEx7();
        starEx8();
        starEx9();
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
        System.out.println("-------------------");
        int count = 0;
        while (6 > count) {
            int innerCount = 5;
            while (count < innerCount) {
                System.out.print("* ");
                innerCount--;
            }
            System.out.println();
            count++;
        }
    }

    public static void starEx2() {
        System.out.println("-------------------");
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
        System.out.println("-------------------");
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
        System.out.println("-------------------");
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
        System.out.println("-------------------");
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

    public static void starEx6() {
        System.out.println("-------------------");
        int n = 5;

        int tipSpace = 1;
        while (tipSpace <= n - 1) {
            System.out.print("  ");
            tipSpace++;
        }
        System.out.println("* ");

        int count = 2;
        while (count < n) {

            int spaceCount = 1;
            while (spaceCount <= n - count) {
                System.out.print("  ");
                spaceCount++;
            }

            System.out.print("* ");

            int internalSpace = 1;
            while (internalSpace <= (2 * count - 3)) {
                System.out.print("  ");
                internalSpace++;
            }

            System.out.println("* ");
            count++;
        }

        int baseCount = 1;
        while (baseCount <= 9) {
            System.out.print("* ");
            baseCount++;
        }
        System.out.println();
    }
    public static void starEx7() {
        System.out.println("-------------------");
        int n = 5;

        int baseCount = 1;
        while (baseCount <= 9) {
            System.out.print("* ");
            baseCount++;
        }
        System.out.println();

        int count = n - 1;
        while (count >= 2) {

            int spaceCount = 1;
            while (spaceCount <= n - count) {
                System.out.print("  ");
                spaceCount++;
            }

            System.out.print("* ");


            int internalSpace = 1;
            while (internalSpace <= (2 * count - 3)) {
                System.out.print("  "); // Double space
                internalSpace++;
            }

            System.out.println("* ");
            count--;
        }

        int tipSpace = 1;
        while (tipSpace <= n - 1) {
            System.out.print("  ");
            tipSpace++;
        }
        System.out.println("* ");
    }

    public static void starEx8(){
        System.out.println("-------------------");
        int n = 0;
        while(n<5){
            int j = 0;
            while(j<5) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            n++;
        }
    }
    public static void starEx9() {
        System.out.println("-------------------");
        int n = 5;

        int count = 0;
        while (count < n / 2) {

            int spaceCount = 0;
            while (spaceCount < count) {
                System.out.print("  ");
                spaceCount++;
            }

            System.out.print("* ");

            int internalSpace = 0;
            int maxInternal = n - 2 - (2 * count);
            while (internalSpace < maxInternal) {
                System.out.print("  ");
                internalSpace++;
            }

            System.out.println("* ");
            count++;
        }

        int midSpace = 0;
        while (midSpace < n / 2) {
            System.out.print("  ");
            midSpace++;
        }
        System.out.println("* ");

        count = n / 2 - 1;
        while (count >= 0) {

            int spaceCount = 0;
            while (spaceCount < count) {
                System.out.print("  ");
                spaceCount++;
            }

            System.out.print("* ");

            int internalSpace = 0;
            int maxInternal = n - 2 - (2 * count);
            while (internalSpace < maxInternal) {
                System.out.print("  ");
                internalSpace++;
            }

            System.out.println("* ");
            count--;
        }
    }
}
