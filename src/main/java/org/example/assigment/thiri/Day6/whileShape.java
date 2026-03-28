package org.example.assigment.thiri.Day6;

public class whileShape {

     static void main() {
        fullUpRightTri();
        fullDownRightTri();
        fullUpEqualTri();
        fullDownEqualTri();
        upRightTri();
        downRightTri();
        upEqualTri();
        downEqualTri();
        whileSquare();
        whileX();
    }

    public static void fullUpRightTri() {
        System.out.println();
        System.out.println("--- Full Right Triangle (Up) --- ");
        System.out.println();

        int i = 0;
        while (i < 5) { //5line

            System.out.print(" * ");

            int j = 0;
            while (j < i) { //1,2,3,4
                System.out.print(" * ");
                j += 1;
            }

            System.out.println();
            i += 1;
        }
    }

    public static void fullDownRightTri() {
        System.out.println();
        System.out.println("--- Full Right Triangle (Down) --- ");
        System.out.println();

        int i = 5;
        while (i > 0) { //5line

            System.out.print(" * ");

            int j = 0;
            while (j < i-1) { //4,3,2,1
                System.out.print(" * ");
                j += 1;
            }

            System.out.println();
            i -= 1;
        }
    }

    public static void fullUpEqualTri() {

        System.out.println();
        System.out.println("--- Full Equal Triangle (Up) --- ");
        System.out.println();

        int i = 0;
        while (i < 5) {

            int j=0;
            while (j < 4 - i) { //4,3,2,1,0
                System.out.print("   ");
                j += 1;
            }

            int k = 0;
            while (k < 2 * i + 1 ) { //1,3,5,7,9
                System.out.print(" * ");
                k += 1;
            }

            System.out.println();
            i += 1;
        }
    }

    public static void fullDownEqualTri() {

        System.out.println();
        System.out.println("--- Full Equal Triangle (Down) --- ");
        System.out.println();

        int i = 5;
        while (i>0) {

            int j = 0;
            while (j<5-i) { //0,1,2,3,4
                System.out.print("   ");
                j+=1;
            }

            int k=0;
            while (k< 2*i -1) { //9,7,5,3,1
                System.out.print(" * ");
                k+=1;
            }
            System.out.println();
            i -=1;
        }
    }

    public static void upRightTri() {

        System.out.println();
        System.out.println("--- Right Triangle (Up) --- ");
        System.out.println();

        int i = 0;
        while (i < 4) { //4line

            System.out.print(" * "); //first * of first 4 line


            int j = 0;
            while (j < i-1) { //0,0,1,2
                    System.out.print("   ");
                    j += 1;
            }
            if (i>0) { //* not to put on first line
                System.out.print(" * ");}

            System.out.println();
            i += 1;
            }

        int k = 0; //last line
        while (k < 5) {
            System.out.print(" * ");
            k += 1;
        }
        System.out.println();
     }

    public static void downRightTri() {

        System.out.println();
        System.out.println("--- Right Triangle (Down) --- ");
        System.out.println();

        int i = 0;
        while (i < 5) { //fist * line
            System.out.print(" * ");
            i += 1;
        }

        System.out.println();

        int j = 4; // last 4 lines
        while (j > 0) {

            System.out.print(" * "); //every first star of each line in this loop

            int k = 0;
            while (k < j - 2) { //2,1,0
                System.out.print("   ");
                k += 1;
            }

            if (j > 1) { //last star of each line skip last line in this loop
                System.out.println(" * ");
            }

            j -= 1;
        }

        System.out.println();
    }

    public static void upEqualTri() {

        System.out.println();
        System.out.println("--- Equal Triangle (Up) --- ");
        System.out.println();

        int i = 0;
        while (i < 4) {

            int j = 1;
            while (j < 10) { //5 4,6  3,7  2,8
                if ( j == 5-i || j == 5+i ) {
                    System.out.print(" * ");
                }else{System.out.print("   ");} //
                j += 1;
            }
            System.out.println();
            i += 1;
        }

        int k = 0;
        while (k < 9) {
            System.out.print(" * ");
            k += 1;
        }
        System.out.println();
    }

    public static void downEqualTri() {

        System.out.println();
        System.out.println("--- Equal Triangle (Down) --- ");
        System.out.println();

        int i = 0;
        while (i < 9) {
            System.out.print(" * ");
            i += 1;
        }
        System.out.println();

        int j = 4;
        while (j > 0) {

            int k = 1;
            while (k < 10) {
                if ( k == 6-j || k == 4+j ) {//2,8 3,7 4,6 5
                    System.out.print(" * ");
                }else{System.out.print("   ");}
                k += 1;
            }

            System.out.println();
            j -= 1;
        }

        System.out.println();
    }


    public static void whileSquare() {

        System.out.println();
        System.out.println("--- Square --- ");
        System.out.println();

        int i = 0;
        while (i < 5) {

            int j = 0;
            while (j < 5) {
                System.out.print(" * ");
                j += 1;
            }

            System.out.println();
            i += 1;
        }
    }

    public static void whileX() {
        System.out.println();
        System.out.println("----- X ----- ");
        System.out.println();

        int i = 0;
        while (i<5) {

            int j = 0;
            while (j < 5 ) {

                if (j == i || j == 4 - i) {
                System.out.print(" * ");
                } else {System.out.print("   ");}

                j += 1;
            }

            System.out.println();
            i += 1;
        }
    }
}
