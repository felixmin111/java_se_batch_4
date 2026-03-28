package org.example.assigment.aung.day_6;

public class Star_While {
    public static void main(String[] args) {
        display();
    }

    public static void One() {
        int count = 1;
        while (count <= 5) {
            int count2 = 0;
            while (count2 < count) {
                System.out.print("*");
                count2++;
            }
            System.out.println();
            count++;

        }

    }

    public static void Two() {
        int count = 5;
        while (count > 0) {
            int count2 = 0;
            while (count2 <= count) {
                System.out.print("*");
                count2++;
            }
            System.out.println();
            count--;

        }
    }

    public static void Three() {
        int count = 1;
        while (count <= 5) {
            int space = 1;
            while (space <= 5 - count) {
                System.out.print(" ");
                space++;

            }
            int count2 = 1;
            while (count2 <= ((2 * count) - 1)) {
                System.out.print("*");
                count2++;
            }
            System.out.println();
            count++;
        }

    }

    public static void Four() {
        int count = 5;
        while (count > 0) {
            int space = 1;
            while (space <= 5 - count) {
                System.out.print(" ");
                space++;

            }
            int count2 = 1;
            while (count2 <= ((2 * count) - 1)) {
                System.out.print("*");
                count2++;
            }
            System.out.println();
            count--;
        }

    }

    public static void Five() {
        int count = 1;
        while (count <= 5) {
            int count2 = 1;
            while (count2 <= count) {
                if (count2 == 1 || count2 == count || count == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                count2++;
            }

            System.out.println();
            count++;
        }
    }

    public static void Six() {
        int count = 5;
        while (count > 0) {
            int count2 = 1;
            while (count2 <= count) {
                if (count2 == 1 || count2 == count || count == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                count2++;
            }
            System.out.println();
            count--;
        }
    }

    public static void Seven() {
        int count = 1;
        while (count <= 5) {
            int space = 1;
            while (space <= 5 - count) {
                System.out.print(" ");
                space++;
            }
            int count2 = 1;
            while (count2 <= ((2 * count) - 1)) {
                if (count2 == 1 ||count2 == ((2 * count) - 1)|| count == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                count2++;
            }
            System.out.println();
            count++;
        }
    }

    public static void Eight() {
        int count = 5;
        while (count > 0) {
            int space = 1;
            while (space <= 5 - count) {
                System.out.print(" ");
                space++;
            }
            int count2 = 1;
            while (count2 <= ((2 * count) - 1)) {
                if (count2 == 1 ||count2 == ((2 * count) - 1)|| count == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                count2++;
            }
            System.out.println();
            count--;
        }
    }

    public static void Nine() {
        int count=1;
        while (count<=5) {
           System.out.println("* * * * *");
           count++;
        }
    }

    public static void Ten() {
        int count = 1;
        while (count <= 5) {
            int count2 = 1;
            while (count2 <= 5) {
                if (count2==count || (count2+count)==6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                count2++;
            }
            System.out.println();
            count++;
        }
    }

    public static void display() {
        One();
        System.out.println("-----------------------------");
        Two();
        System.out.println("-----------------------------");
        Three();
        System.out.println("-----------------------------");
        Four();
        System.out.println("-----------------------------");
        Five();
        System.out.println("-----------------------------");
        Six();
        System.out.println("-----------------------------");
        Seven();
        System.out.println("-----------------------------");
        Eight();
        System.out.println("-----------------------------");
        Nine();
        System.out.println("-----------------------------");
        Ten();
    }
}




