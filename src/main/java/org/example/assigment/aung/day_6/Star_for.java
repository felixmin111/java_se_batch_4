package org.example.assigment.aung.day_6;

public class Star_for {
    public static void main(String[] args){
        display();
    }

    public static void Triangle() {
        System.out.println("Regular Triangle");
        System.out.println("----------------");
        for (int count = 1; count<=5; count++) {
            for (int count2=0;count2<count;count2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static void FlippedTriangle(){
        System.out.println("Flipped Triangle");
        System.out.println("----------------");
        for (int count = 5; count>0; count--) {
            for (int count2=0;count2<count;count2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static void Pyramid(){
        System.out.println("Pyramid");
        System.out.println("----------------");
        for (int count=1; count<=5; count++) {
            for (int space=1; space<=5-count; space++) {
                System.out.print(" ");
            }
            for (int count2=1; count2<=((2*count)-1); count2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static void FlippedPyramid(){
        System.out.println("Flipped Pyramid");
        System.out.println("----------------");
        for (int count=5; count>0; count--) {
            for (int space=1; space<=5-count; space++) {
                System.out.print(" ");
            }
            for (int count2=1; count2<=((2*count)-1); count2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static void HollowTriangle() {
        System.out.println("Hollow Triangle");
        System.out.println("----------------");
        for (int count = 1; count<=5; count++) {
            for (int count2=1;count2<=count;count2++) {
                if (count2 == 1 || count2 == count || count == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static void FlippedHollowTriangle() {
        System.out.println("Flipped Hollow Triangle");
        System.out.println("----------------");
        for (int count = 5; count>0; count--) {
            for (int count2=1;count2<=count;count2++) {
                if (count2 == 1 || count2 == count || count == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static void HollowPyramid() {
        System.out.println("Hollow Pyramid");
        System.out.println("----------------");
        for (int count = 1; count<=5; count++) {
            for (int space=1; space<=5-count; space++) {
                System.out.print(" ");
            }

            for (int count2=1; count2<=(2*count)-1; count2++) {
                if (count2 == 1 || count2 == (2*count)-1 || count == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static void FlippedHollowPyramid() {
        System.out.println("Flipped Hollow Pyramid");
        System.out.println("----------------");
        for (int count = 5; count>0; count--) {
            for (int space=1; space<=5-count; space++) {
                System.out.print(" ");
            }

            for (int count2=1; count2<=(2*count)-1; count2++) {
                if (count2 == 1 || count2 == (2*count)-1 || count == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static void Square() {
        System.out.println("Square");
        System.out.println("----------------");
        for (int count=1; count<=5; count++) {
            System.out.println("* * * * *");
        }
        System.out.println("----------------");
    }

    public static void Cross() {
        System.out.println("Cross");
        System.out.println("----------------");
        for (int count=1; count<=5; count++) {
            for(int count2=1; count2<=5; count2++) {
                if (count2==count || (count2+count)==6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static void display() {
        Triangle();
        FlippedTriangle();
        Pyramid();
        FlippedPyramid();
        HollowTriangle();
        FlippedHollowTriangle();
        HollowPyramid();
        FlippedHollowPyramid();
        Square();
        Cross();
    }
}
