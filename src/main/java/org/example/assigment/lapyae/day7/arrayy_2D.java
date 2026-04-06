package org.example.assigment.lapyae.day7;

import java.util.Arrays;

public class arrayy_2D {
    public static void main(String[] args) {
        display();
    }

    public static void display() {
        printROWbyROW(new int[][]{{1, 2}, {3, 4}});
        printNumbersOfRowsNColumns(new int[][]{{1, 2, 3}, {4, 5, 6}});
        printSingleLine(new int[][]{{1, 2, 3}, {4, 5, 6}});
        printSpecificElement(new int[][]{{1, 2, 3}, {4, 5, 6}});
        findSumOfAllElements(new int[][]{{1, 2}, {3, 4}});
        calculateAverage(new int[][]{{2, 4, 6}, {8, 10, 12}});
        findMaxElement(new int[][]{{3, 9, 1}, {7, 5, 2}});
        findMiniElement(new int[][]{{3, 9, 1}, {7, 5, 2}});
        countEvenNumbers(new int[][]{{1, 2}, {3, 4}});
        countOddNumbers(new int[][]{{1, 2}, {3, 4}});
        rowSums(new int[][]{{1, 2, 3}, {4, 5, 6}});
        sumOfEachColumn(new int[][]{{1, 2, 3}, {4, 5, 6}});
        findMaxRowSum(new int[][]{{1, 2, 3}, {4, 5, 6}});
        findColumnWithMinimumSum(new int[][]{{3, 1, 4}, {2, 5, 6}, {7, 8, 9}});
        transposeMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}});
        matrixAddition(new int[][]{{1, 2},{3, 4}}, new int[][]{{5, 6}, {7, 8}});
        matrixMultiplication(new int[][]{{1, 2}, {3, 4}}, new int[][]{{5, 6}, {7, 8}});
    }

    public static void printROWbyROW(int[][] arr) {
        System.out.println("Problem 1. Print Row by Row");
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }

    public static void printNumbersOfRowsNColumns(int[][] arr) {
        System.out.println("Problem 2. Number of Rows and Columns");

        System.out.println("Rows: " + arr.length);
        System.out.println("Columns: " + (arr.length > 0 ? arr[0].length : 0));
        System.out.println("--------------------");
    }

    public static void printSingleLine(int[][] arr) {
        System.out.println("Problem 3. Print All in One Line");
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
        }
        System.out.println("\n--------------------");
    }

    public static void printSpecificElement(int[][] arr) {
        System.out.println("Problem 4: Print a specific element");

        System.out.println(arr[1][2]);

        System.out.println("--------------------");
    }

    public static void findSumOfAllElements(int[][] arr) {
        System.out.println("Problem 5: Find sum of all elements");
        int sum = 0;

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
        }

        System.out.println(sum);
        System.out.println("--------------------");
    }

    public static void calculateAverage(int[][] arr) {
        System.out.println("Problem 6. Average of All Elements");
        double sum = 0;
        int totalElements = 0;
        for (int[] row : arr) {
            for (int val : row) {
                sum += val;
                totalElements++;
            }
        }
        System.out.println("Average = " + (sum / totalElements));
        System.out.println("--------------------");
    }

    public static void findMaxElement(int[][] arr) {
        System.out.println("Problem 7: Find maximum element");

        int max = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("--------------------");
    }

    public static void findMiniElement(int[][] arr) {
        System.out.println("Problem 8: Find minimum element");


        int min = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
        }

        System.out.println("Minimum = " + min);
        System.out.println("--------------------");
    }

    public static void countEvenNumbers(int[][] arr) {
        System.out.println("Problem 9: Count even numbers");

        int count = 0;
        for (int[] row : arr) {
            for (int value : row) {

                if (value % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println("--------------------");
    }

    public static void countOddNumbers(int[][] arr) {
        System.out.println("Problem 10: Count odd numbers");


        int count = 0;
        for (int[] row : arr) {
            for (int value : row) {

                if (value % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
        System.out.println("--------------------");
    }

    public static void rowSums(int[][] arr) {
        System.out.println("Problem 11. Sum of Each Row");
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for (int val : arr[i]) {
                rowSum += val;
            }
            System.out.println("Row " + (i + 1) + " sum = " + rowSum);
        }
        System.out.println("--------------------");
    }

    public static void sumOfEachColumn(int[][] matrix) {
        System.out.println("Problem 12: Sum of each column");

        for (int col = 0; col < matrix[0].length; col++) {
            int sum = 0;

            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][col];
            }
            System.out.println("Column " + (col + 1) + " sum = " + sum);
        }
        System.out.println("--------------------");
    }

    public static void findMaxRowSum(int[][] arr) {
        System.out.println("13. Row with Maximum Sum");
        int maxSum = Integer.MIN_VALUE;
        int bestRow = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int val : arr[i]) {
                currentSum += val;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                bestRow = i + 1;
            }
        }
        System.out.println("Row " + bestRow + " has maximum sum = " + maxSum);
        System.out.println("--------------------");
    }

    public static void findColumnWithMinimumSum(int[][] arr) {
        System.out.println("Problem 14: Find column with minimum sum");

        int minSum = Integer.MAX_VALUE;
        int minColumnIndex = 0;

        for (int col = 0; col < arr[0].length; col++) {
            int currentColumnSum = 0;

            for (int row = 0; row < arr.length; row++) {
                currentColumnSum += arr[row][col];
            }

            if (currentColumnSum < minSum) {
                minSum = currentColumnSum;
                minColumnIndex = col + 1;
            }
        }

        System.out.println("Column " + minColumnIndex + " has minimum sum = " + minSum);
        System.out.println("--------------------");
    }

    public static void transposeMatrix(int[][] matrix) {
        System.out.println("Problem 15: Transpose of matrix");

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                transpose[c][r] = matrix[r][c];
            }
        }

        for (int[] row : transpose) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");
    }

    public static void matrixAddition(int[][] A, int[][] B) {
        System.out.println("Problem 16: Matrix addition");

        int rows = A.length;
        int cols = A[0].length;
        int[][] C = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int[] row : C) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");
    }

    public static void matrixMultiplication(int[][] A, int[][] B) {
        System.out.println("Problem 17: Matrix multiplication");

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");
    }
}