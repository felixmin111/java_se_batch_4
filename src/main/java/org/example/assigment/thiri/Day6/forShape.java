package org.example.assigment.thiri.Day6;

public class forShape {
    public static void main(String[] args) {
        fullUpRightTriangle();
        fullDownRightTriangle();
        fullUpEqualTriangle();
        fullDownEqualTriangle();
        upRightTriangle();
        downRightTriangle();
        upEqualTriangle();
        downEqualTriangle();
        square();
        x();
    }

    public static void fullUpRightTriangle() {

        System.out.println();
        System.out.println("--- Full Right Triangle (Up) --- ");
        System.out.println();

        for (int i = 1; i < 6; i++) { //5
            for (int j = 0; j < i; j++) { //1,2,3,4,5
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void fullDownRightTriangle() {

        System.out.println();
        System.out.println("--- Full Right Triangle (Down) --- ");
        System.out.println();

        for (int i = 5; i > 0; i--) { //5
            for (int j = 0; j < i; j++) { //5,4,3,2,1
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void fullUpEqualTriangle() {

        System.out.println();
        System.out.println("--- Full Equal Triangle (Up) --- ");
        System.out.println();

        for (int i = 1; i < 6; i++) { //5
            for (int j = 0; j <= 4 - i; j++) { //4,3,2,1
                System.out.print("   ");
            }

            for (int k = 0; k < 2 * i - 1; k++) { //1,3,5,7,9
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void fullDownEqualTriangle() {
        System.out.println();
        System.out.println("--- Full Equal Triangle (Down) --- ");
        System.out.println();

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 5 - i; j++) { //0,1,2,3,4
                System.out.print("   ");
            }

            for (int k = 0; k < 2 * i - 1; k++) { //9,7,5,3,1
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void upRightTriangle() {

        System.out.println();
        System.out.println("--- Right Triangle (Up) --- ");
        System.out.println();

        for (int i = 0; i < 4; i++) { //5
            System.out.print("*"); //every first star

            for (int j = 0; j < i; j++) { //0,1,2,3
                System.out.print("  "); //space
            }
            if (i > 0) {
                System.out.print("*"); //*after space
            }
            System.out.println();
        }

        //last line
        for (int k = 0; k < 5; k++) { //5
            System.out.print("* ");
        }
        System.out.println();
    }

    public static void downRightTriangle() {

        System.out.println();
        System.out.println("--- Right Triangle (Down) --- ");
        System.out.println();

        //fist line
        for (int j = 0; j < 5; j++) { //5*
            System.out.print("* ");
        }
        System.out.println();

        // shape of |/
        for (int i = 4; i > 0; i--) { //4
            System.out.print("*"); //first star at every line

            for (int j = 0; j < 2 * i - 2; j++) { //6,4,2,0
                System.out.print(" ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void upEqualTriangle() {

        System.out.println();
        System.out.println("--- Equal Triangle (Up) --- ");
        System.out.println();

        for (int i = 0; i < 4; i++) { //4

            for (int j = 0; j < 4 - i; j++) { //4,3,2,1
                System.out.print("   ");
            }
            System.out.print(" * "); //first star of first 4 line

            for (int k = 0; k < 2 * i - 1; k++) { //1,3,5
                System.out.print("   ");
            }
            if (i > 0) {
                System.out.print(" *"); //*after space
            }
            System.out.println();
        }

        //last * line
        for (int j = 0; j < 9; j++) { //5*
            System.out.print(" * ");
        }
        System.out.println();
    }

    public static void downEqualTriangle() {

        System.out.println();
        System.out.println("--- Equal Triangle (Down) --- ");
        System.out.println();

        //first * line
        for (int j = 0; j < 9; j++) { //5*
            System.out.print(" * ");
        }
        System.out.println();

        for (int i = 4; i > 0; i--) { //4

            for (int j = 0; j < 5 - i; j++) { //1,2,3,4
                System.out.print("   ");
            }
            System.out.print(" *"); //first star

            for (int k = 0; k <= 2 * i - 3; k++) { //5,3,1
                System.out.print("   ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void square() {

        System.out.println();
        System.out.println("--- Square --- ");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void x() {
        System.out.println();
        System.out.println("----- X ----- ");
        System.out.println();

        //Top half
        for (int i = 3; i > 0; i--) { //3

            for (int j = 0; j < 3 - i; j++) { //0,1,2
                System.out.print("  ");
            }
            if (i < 2) { //use if else to adjust shape to be symmetrical
                System.out.print("  * ");
            } else {
                System.out.print(" * ");
            }

            for (int k = 0; k <= 2 * i - 3; k++) { //3,1
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Bottom half
        for (int i = 0; i < 2; i++) { //2
            if (i == 0) {
                System.out.print("  ");
            }

            System.out.print(" * ");

            for (int k = 0; k <= 2 * i + 1; k++) { //1,3
                System.out.print("  ");
            }

            System.out.println("*");
        }
    }
}
