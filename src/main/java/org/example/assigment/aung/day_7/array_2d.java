package org.example.assigment.aung.day_7;

import java.util.Arrays;

public class array_2d {
    public static void main(String[] args) {
        display();
    }

    public static void printAllElementsRowByRow(int[][] matrix) {
        System.out.println("Problem 1: Print all elements (row by row)");
        System.out.println("-------------------\n");

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }


        System.out.println("\n--------------------");
    }

    public static void printRowsAndColumns(int[][] matrix) {
        System.out.println("Problem 2: Print number of rows and columns");
        System.out.println("-------------------\n");

        System.out.println("number of rows: " + matrix.length);
        System.out.println("number of columns: " + matrix[0].length);

        System.out.println("\n--------------------");
    }

    public static void printAllElementsOneLine(int[][] matrix) {
        System.out.println("Problem 3: Print all elements in one line");
        System.out.println("-------------------\n");

        for  (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
        }

        System.out.println("\n--------------------");
    }

    public static void printSpecificElement(int[][] matrix, int row, int col) {
        System.out.println("Problem 4: Print a specific element");
        System.out.println("-------------------\n");

        System.out.println(matrix[row][col]);

        System.out.println("\n--------------------");
    }

    public static void findSumOfAllElements(int[][] matrix) {
        System.out.println("Problem 5: Find sum of all elements");
        System.out.println("-------------------\n");
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        System.out.println(sum);
        System.out.println("\n--------------------");
    }

    public static void findAverageOfAllElements(int[][] matrix) {
        System.out.println("Problem 6: Find average of all elements");
        System.out.println("-------------------\n");

        double sum = 0;
        int count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        System.out.println(sum/count);

        System.out.println("\n--------------------");
    }

    public static void findMaximumElement(int[][] matrix) {
        System.out.println("Problem 7: Find maximum element");
        System.out.println("-------------------\n");
        int Largest = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > Largest) {
                    Largest = value;
                }
            }
        }
        System.out.println(Largest);

        System.out.println("\n--------------------");
    }

    public static void findMinimumElement(int[][] matrix) {
        System.out.println("Problem 8: Find minimum element");
        System.out.println("-------------------\n");

        int Smallest = matrix[0][0];
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < Smallest) {
                    Smallest = value;
                }
            }
        }
        System.out.println(Smallest);
        System.out.println("\n--------------------");
    }

    public static void countEvenNumbers(int[][] matrix) {
        System.out.println("Problem 9: Count even numbers");
        System.out.println("-------------------\n");
        int count = 0;
        for  (int[] row : matrix) {
            for (int value : row) {
                if (value % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println("There are "+count+" even numbers.");

        System.out.println("\n--------------------");
    }

    public static void countOddNumbers(int[][] matrix) {
        System.out.println("Problem 10: Count odd numbers");
        System.out.println("-------------------\n");

        int count = 0;
        for  (int[] row : matrix) {
            for (int value : row) {
                if (value % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println("There are "+count+" odd numbers.");

        System.out.println("\n--------------------");
    }

    public static void sumOfEachRow(int[][] matrix) {
        System.out.println("Problem 11: Sum of each row");
        System.out.println("-------------------\n");
        int rows= 0;
        for  (int[] row : matrix) {
            int sum = 0;
            for (int count=0; count<row.length; count++) {
                sum += row[count];
            }

            System.out.println("Row "+rows+" sum = "+sum);
        }

        System.out.println("\n--------------------");
    }

    public static void sumOfEachColumn(int[][] matrix) {
        System.out.println("Problem 12: Sum of each column");
        System.out.println("-------------------\n");

        for (int column = 0; column < matrix[0].length; column++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][column];
            }
            System.out.println("Columns "+(column+1)+" sum = "+sum);
        }

        System.out.println("\n--------------------");
    }

    public static void findRowWithMaximumSum(int[][] matrix) {
        System.out.println("Problem 13: Find row with maximum sum");
        System.out.println("-------------------\n");

        int rows= 0;
        int highestRow = 0;
        int highestSum = -111;
        for  (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int count=0; count<matrix[row].length; count++) {
                sum += matrix[row][count];
            }
            if (sum > highestSum) {
                highestSum = sum;
                highestRow = row+1;
            }

        }
        System.out.println("Row " + highestRow + " has maximum sum = "+highestSum);
        System.out.println("\n--------------------");
    }

    public static void findColumnWithMinimumSum(int[][] matrix) {
        System.out.println("Problem 14: Find column with minimum sum");
        System.out.println("-------------------\n");

        int lowestSum = 999999;
        int LowestColumn = 0;
        for (int column = 0; column < matrix[0].length; column++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][column];
            }
            if (sum < lowestSum) {
                lowestSum = sum;
                LowestColumn = column+1;
            }

        }
        System.out.println("Column " + LowestColumn + " has minimum sum = "+lowestSum);


        System.out.println("\n--------------------");
    }

    public static void transposeMatrix(int[][] matrix) {
        System.out.println("Problem 15: Transpose of matrix");
        System.out.println("-------------------\n");

        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                transpose[col][row] = matrix[row][col];
            }
        }
        System.out.println(Arrays.deepToString(transpose));
        System.out.println("\n--------------------");
    }

    public static void matrixAddition(int[][] A, int[][] B) {
        System.out.println("Problem 16: Matrix addition");
        System.out.println("-------------------\n");

        int[][] C = new int[A.length][A[0].length];
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < A[0].length; col++) {
                C[row][col] = A[row][col] +  B[row][col];
            }
        }
        System.out.println(Arrays.deepToString(C));

        System.out.println("\n--------------------");
    }

    public static void matrixMultiplication(int[][] A, int[][] B) {
        System.out.println("Problem 17: Matrix multiplication");
        System.out.println("-------------------\n");

        int[][] C = new int[A.length][B[0].length];
        for (int row = 0; row < A.length; row++) {
            for (int col = 0; col < B[0].length; col++) {
                for (int i =  0; i < A[0].length; i++) {
                    C[row][col] += A[row][i] * B[i][col];
                }
            }
        }
        System.out.println(Arrays.deepToString(C));

        System.out.println("\n--------------------");
    }

    public static void display() {
        // --- Part A: Basic Questions ---
        printAllElementsRowByRow(new int[][]{{1, 2}, {3, 4}});
        printRowsAndColumns(new int[][]{{1, 2, 3}, {4, 5, 6}});
        printAllElementsOneLine(new int[][]{{1, 2, 3}, {4, 5, 6}});

        // Passing the array, and the specific row/col we want to print (Row 1, Col 2)
        printSpecificElement(new int[][]{{1, 2, 3}, {4, 5, 6}}, 1, 2);

        // --- Part B: Logic Questions ---
        findSumOfAllElements(new int[][]{{1, 2}, {3, 4}});
        findAverageOfAllElements(new int[][]{{2, 4, 6}, {8, 10, 12}});
        findMaximumElement(new int[][]{{3, 9, 1}, {7, 5, 2}});
        findMinimumElement(new int[][]{{3, 9, 1}, {7, 5, 2}});
        countEvenNumbers(new int[][]{{1, 2}, {3, 4}});
        countOddNumbers(new int[][]{{1, 2}, {3, 4}});

        // --- Part C: Row & Column Operations ---
        sumOfEachRow(new int[][]{{1, 2, 3}, {4, 5, 6}});
        sumOfEachColumn(new int[][]{{1, 2, 3}, {4, 5, 6}});
        findRowWithMaximumSum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        findColumnWithMinimumSum(new int[][]{{3, 1, 4}, {2, 5, 6}, {7, 8, 9}});

        // --- Part D: Matrix Operations ---
        transposeMatrix(new int[][]{{1, 2, 3}, {4, 5, 6}});

        // Matrix Addition (requires two 2D arrays)
        int[][] addA = {{1, 2}, {3, 4}};
        int[][] addB = {{5, 6}, {7, 8}};
        matrixAddition(addA, addB);

        // Matrix Multiplication (requires two 2D arrays)
        int[][] multA = {{1, 2}, {3, 4}};
        int[][] multB = {{5, 6}, {7, 8}};
        matrixMultiplication(multA, multB);
    }
}
