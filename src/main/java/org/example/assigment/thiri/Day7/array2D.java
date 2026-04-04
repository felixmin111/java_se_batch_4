package org.example.assigment.thiri.Day7;

//Java 2D Array Exercises
//arr.length → number of rows
//arr[i].length → number of columns

import java.util.Arrays;

public class array2D {
    public static void main (String[] args) {
        //Part A: Basic Questions
        int[][] arr = {{1,2,3},{4,5,6},{8,1,1}};

        printingRowByRow(arr); //1
        System.out.println();

        printingNoOfRowAndColumn(arr); //2
        System.out.println();

        printingAllElementsInOneLine(arr); //3
        System.out.println();

        printingSpecificElement(arr);//4
        System.out.println();

        //Part B: Logic Questions
        sumOfAllElement(arr); //5
        System.out.println();

        avgOfAllElement(arr); //6
        System.out.println();

        max(arr); //7
        System.out.println();

        min(arr); //8
        System.out.println();

        countingEvenNum(arr); //9
        System.out.println();

        countingOddNum(arr); //10
        System.out.println();

        //Part C: Row & Column Operations
        sumOfEachRow(arr); //11
        System.out.println();

        sumOfEachColumn(arr);//12
        System.out.println();

        rowWithMaxSum(arr); //13
        System.out.println();

        columnWithMinSum(arr); //14
        System.out.println();

        //Part D: Matrix Operations
        int[][] arr1 = {{1,4,1}, {2,0,2}, {9,3,3}};
        transposeOfMatrix(arr); //15
        System.out.println();

        matrixAddition(arr,arr1); //16
        System.out.println();

        matrixMultiplication(arr, arr1); //17
        System.out.println();
    }

    //Part A: Basic Questions
    //1. Print all elements (row by row)
    public static void printingRowByRow(int[][] arr) {
        System.out.println("--- 1. Print all elements (row by row) ---");
        for (int[] num: arr) {
            for (int value : num) {
                System.out.print(value + " ");
            } System.out.println();
        }
    }

    //2. Print number of rows and columns
    public static void printingNoOfRowAndColumn(int[][] arr) {
        System.out.println("--- 2. Print number of rows and columns ---");
        System.out.println("Rows: " + arr.length);
        System.out.println("Colums: "+arr[0].length);
    }

    //3. Print all elements in one line
    public static void printingAllElementsInOneLine(int[][] arr) {
        System.out.println("--- 3. Print all elements in one line ---");
        for (int[] num: arr) {
            for (int value : num) {
                System.out.print(value + " ");
            }
        }  System.out.println();
    }

    //4. Print a specific element
    //Print element at row 1, column 2
    public static void printingSpecificElement(int[][] arr) {
        System.out.println("--- 4. Print a specific element ---");
                System.out.println("Element at row 1, column 2: " + arr[0][1]);
    }

    //Part B: Logic Questions
    //5. Find sum of all elements
    public static void sumOfAllElement(int[][] arr) {
        System.out.println("--- 5. Find sum of all elements ---");
        int sum = 0;
        for (int[] num: arr) {
            for (int value : num) {
                sum += value;
            }
        }  System.out.println("Sum: "+ sum);
    }

    //6. Find average of all elements
    public static void avgOfAllElement(int[][] arr) {
        float nums = arr.length * arr[0].length;
        System.out.println("--- 6. Find average of all elements ---");
        float sum = 0;
        for (int[] num: arr) {
            for (int value : num) {
                sum += value;
            }
        }
        float avg = sum / nums ;
        System.out.println("Avg: "+ avg);
    }

    //7. Find maximum element
    public static void max(int[][] arr) {
        System.out.println("--- 7. Find maximum element ---");
        int max = arr[0][0];
        for (int[] num: arr) {
            for (int value : num) {
                if (value > max) {
                    max = value;
                }
            }
        }
        System.out.println("Maximun : "+ max);
    }

    //8. Find minimum element
    public static void min(int[][] arr) {
        System.out.println("--- 8. Find minimum element ---");
        int min = arr[0][0];
        for (int[] num: arr) {
            for (int value : num) {
                if (value < min) {
                    min = value;
                }
            }
        }
        System.out.println("Minimum : "+ min);
    }

    //9. Count even numbers
    public static void countingEvenNum(int[][] arr) {
        System.out.println("--- 9. Count even numbers ---");
        int count = 0;
        for (int[] num: arr) {
            for (int value : num) {
                if (value % 2 == 0) {
                    count ++;
                }
            }
        }
        System.out.println("Count of Even Num: " + count);
    }

    //10. Count odd numbers
    public static void countingOddNum(int[][] arr) {
        System.out.println("--- 10. Count odd numbers ---");
        int count = 0;
        for (int[] num: arr) {
            for (int value : num) {
                if (value % 2 != 0) {
                    count ++;
                }
            }
        }
        System.out.println("Count of Odd Num: " + count);
    }

    //Part C: Row & Column Operations
    //11. Sum of each row
    public static void sumOfEachRow(int[][] arr) {
        System.out.println("--- 11. Sum of each row ---");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of Row "+ (i+1)+ " : " + sum);
            sum = 0;
        }
    }

    //12. Sum of each column
    public static void sumOfEachColumn(int[][] arr) {
        System.out.println("--- 12. Sum of each column ---");
        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];}
            System.out.println("Sum of Column "+ (i+1)+ " : " + sum);
            sum = 0;
            }
        }

    //13. Find row with maximum sum
    public static void rowWithMaxSum(int[][] arr) {
        System.out.println("--- 13. Find row with maximum sum ---");

        int maxSum = Integer.MIN_VALUE;
        int row = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + " : " + sum);
            if (sum > maxSum) {
                maxSum = sum;
                row = i;
            }

        }
        System.out.println("Row "+ (row+1) +" has maximum sum: "+ maxSum);
    }

    //14. Find column with minimum sum
    public static void columnWithMinSum(int[][] arr) {
        System.out.println("--- 14. Find column with minimum sum ---");
        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int column = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println("Sum of Column " + (i + 1) + " : " + sum);
            if (sum < minSum) {
                minSum = sum;
                column = i;
            }
            sum = 0;
        }System.out.println("Column "+ (column+1) +" has minimum sum: "+ minSum);
    }

    //Part D: Matrix Operations
    //15. Transpose of matrix
    public static void transposeOfMatrix(int[][] arr) {
        System.out.println("--- 15. Transpose of matrix ---");

        int[][] tArr= new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) { //123 123
               tArr[j][i]=arr[i][j];
            }
        }

        for (int k =0; k<tArr.length; k++) {
            for (int l =0; l<tArr[k].length; l++) {
                System.out.print(tArr[k][l] + " ");
            }System.out.println();
        }
    }

    //16. Matrix addition
    public static void matrixAddition(int[][] arr, int[][] arr1) {
        System.out.println("--- 16. Matrix addition ---");

        int[][] sum = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { //123 123
                sum[i][j] = arr[i][j] + arr1[i][j];
            }
        }

        for (int[] ints : sum) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    //17. Matrix multiplication (IMPORTANT)
    public static void matrixMultiplication(int[][] arr, int[][] arr1) {
        System.out.println("--- 17. Matrix multiplication ---");

        int rowA = arr.length;
        int colA = arr[0].length;
        int rowB = arr1.length;
        int colB = arr1[0].length;

        if (colA != rowB) {
            System.out.println("Matrix multiplication not possible!");
            return;
        }

        int[][] mul = new int[rowA][colB];

        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) {
                for (int k = 0; k < colA; k++) {
                    mul[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }

            for (int[] ints : mul) {
                for (int anInt : ints) {
                    System.out.print(anInt + " ");
                }
                System.out.println();
            }
    }
}
