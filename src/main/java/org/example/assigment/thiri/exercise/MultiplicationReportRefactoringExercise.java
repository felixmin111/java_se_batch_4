package org.example.assigment.thiri.exercise;

import java.util.Scanner;

/*
 * METHOD-SEPARATION AND CLEAN-CODE EXERCISE
 *
 * This program intentionally contains:
 * - only the required main() method
 * - repeated table-processing logic
 * - input, validation, calculation, and output logic in one place
 * - long code that should be separated into smaller methods
 *
 * Student task:
 * 1. Run the program and record its output.
 * 2. Identify blocks with one clear responsibility.
 * 3. Extract those blocks into well-named methods.
 * 4. Remove repeated code.
 * 5. Keep the program behavior and output unchanged.
 */
public class MultiplicationReportRefactoringExercise {

    public String studentName;
    public int maximumMultiplier;

    int totalForTwo = 0;
    int evenResultsForTwo = 0;
    int oddResultsForTwo = 0;
    int largestResultForTwo = 0;
    double averageForTwo;

    int totalForThree = 0;
    int evenResultsForThree = 0;
    int oddResultsForThree = 0;
    int largestResultForThree = 0;
    double averageForThree;

    int totalForFour = 0;
    int evenResultsForFour = 0;
    int oddResultsForFour = 0;
    int largestResultForFour = 0;
    double averageForFour;

    int totalForFive = 0;
    int evenResultsForFive = 0;
    int oddResultsForFive = 0;
    int largestResultForFive = 0;
    double averageForFive;

    int grandTotal;
    double grandAverage;
    int allEvenResults;
    int allOddResults;
    int largestResult;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        MultiplicationReportRefactoringExercise table = new MultiplicationReportRefactoringExercise();

        table.displayMultiplicationTables();
        table.grandTotal();
        table.report();
    }

    public int askInfo() {
        System.out.println("======================================");
        System.out.println("     MULTIPLICATION LEARNING SYSTEM");
        System.out.println("======================================");

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        while (studentName.trim().isEmpty()) {
            System.out.println("Student name cannot be empty.");
            System.out.print("Enter student name again: ");
            studentName = scanner.nextLine();
        }

        System.out.print("Enter maximum multiplier (1-12): ");

        while (!scanner.hasNextInt()) {
            System.out.println("Please enter a whole number.");
            scanner.next();
            System.out.print("Enter maximum multiplier (1-12): ");
        }

        int maximumMultiplier = scanner.nextInt();

        while (maximumMultiplier < 1 || maximumMultiplier > 12) {
            System.out.println("The number must be between 1 and 12.");
            System.out.print("Enter maximum multiplier again: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a whole number.");
                scanner.next();
                System.out.print("Enter maximum multiplier again: ");
            }

            maximumMultiplier = scanner.nextInt();
        }
        return maximumMultiplier;
    }


    // -------------------- TABLE 2 -------------------- //
    public void displayMultiplicationTables() {

        System.out.println();
        int maximumMultiplier = askInfo();
        System.out.println("Student: " + studentName);

        table2(maximumMultiplier);
        table3(maximumMultiplier);
        table4(maximumMultiplier);
        table5(maximumMultiplier);
    }

    public void table2(int maximumMultiplier) {
        System.out.println("Multiplication table: 2");
        System.out.println("--------------------");

        for (int multiplier = 1;
             multiplier <= maximumMultiplier;
             multiplier++) {

            int result = 2 * multiplier;
            System.out.println(
                    2 + " x " + multiplier + " = " + result
            );

            totalForTwo = totalForTwo + result;

            if (result % 2 == 0) {
                evenResultsForTwo++;
            } else {
                oddResultsForTwo++;
            }

            if (result > largestResultForTwo) {
                largestResultForTwo = result;
            }
        }

        averageForTwo =
                (double) totalForTwo / maximumMultiplier;

        System.out.println("--------------------");
        System.out.println("Total: " + totalForTwo);
        System.out.printf("Average: %.2f%n", averageForTwo);
        System.out.println("Even results: " + evenResultsForTwo);
        System.out.println("Odd results: " + oddResultsForTwo);
        System.out.println("Largest result: " + largestResultForTwo);
    }

    // -------------------- TABLE 3 --------------------
    public void table3(int maximumMultiplier) {
        System.out.println();
        System.out.println("Student: " + studentName);
        System.out.println("Multiplication table: 3");
        System.out.println("--------------------");

        for (int multiplier = 1;
             multiplier <= maximumMultiplier;
             multiplier++) {

            int result = 3 * multiplier;
            System.out.println(
                    3 + " x " + multiplier + " = " + result
            );

            totalForThree = totalForThree + result;

            if (result % 2 == 0) {
                evenResultsForThree++;
            } else {
                oddResultsForThree++;
            }

            if (result > largestResultForThree) {
                largestResultForThree = result;
            }
        }

        double averageForThree =
                (double) totalForThree / maximumMultiplier;

        System.out.println("--------------------");
        System.out.println("Total: " + totalForThree);
        System.out.printf("Average: %.2f%n", averageForThree);
        System.out.println("Even results: " + evenResultsForThree);
        System.out.println("Odd results: " + oddResultsForThree);
        System.out.println("Largest result: " + largestResultForThree);
    }

    // -------------------- TABLE 4 --------------------
    public void table4(int maximumMultiplier) {
        System.out.println();
        System.out.println("Student: " + studentName);
        System.out.println("Multiplication table: 4");
        System.out.println("--------------------");

        for (int multiplier = 1;
             multiplier <= maximumMultiplier;
             multiplier++) {

            int result = 4 * multiplier;
            System.out.println(
                    4 + " x " + multiplier + " = " + result
            );

            totalForFour = totalForFour + result;

            if (result % 2 == 0) {
                evenResultsForFour++;
            } else {
                oddResultsForFour++;
            }

            if (result > largestResultForFour) {
                largestResultForFour = result;
            }
        }

        double averageForFour =
                (double) totalForFour / maximumMultiplier;

        System.out.println("--------------------");
        System.out.println("Total: " + totalForFour);
        System.out.printf("Average: %.2f%n", averageForFour);
        System.out.println("Even results: " + evenResultsForFour);
        System.out.println("Odd results: " + oddResultsForFour);
        System.out.println("Largest result: " + largestResultForFour);
    }
    // -------------------- TABLE 5 --------------------

    public void table5(int maximumMultiplier) {
        System.out.println();
        System.out.println("Student: " + studentName);
        System.out.println("Multiplication table: 5");
        System.out.println("--------------------");

        for (int multiplier = 1;
             multiplier <= maximumMultiplier;
             multiplier++) {

            int result = 5 * multiplier;
            System.out.println(
                    5 + " x " + multiplier + " = " + result
            );

            totalForFive = totalForFive + result;

            if (result % 2 == 0) {
                evenResultsForFive++;
            } else {
                oddResultsForFive++;
            }

            if (result > largestResultForFive) {
                largestResultForFive = result;
            }
        }

        double averageForFive =
                (double) totalForFive / maximumMultiplier;

        System.out.println("--------------------");
        System.out.println("Total: " + totalForFive);
        System.out.printf("Average: %.2f%n", averageForFive);
        System.out.println("Even results: " + evenResultsForFive);
        System.out.println("Odd results: " + oddResultsForFive);
        System.out.println("Largest result: " + largestResultForFive);
    }

    // -------------------- FINAL REPORT --------------------

    public void grandTotal() {
        grandTotal =
                totalForTwo
                        + totalForThree
                        + totalForFour
                        + totalForFive;

        grandAverage =
                (averageForTwo
                        + averageForThree
                        + averageForFour
                        + averageForFive) / 4;

        allEvenResults =
                evenResultsForTwo
                        + evenResultsForThree
                        + evenResultsForFour
                        + evenResultsForFive;

        allOddResults =
                oddResultsForTwo
                        + oddResultsForThree
                        + oddResultsForFour
                        + oddResultsForFive;

        largestResult = largestResultForTwo;

        if (largestResultForThree > largestResult) {
            largestResult = largestResultForThree;
        }

        if (largestResultForFour > largestResult) {
            largestResult = largestResultForFour;
        }

        if (largestResultForFive > largestResult) {
            largestResult = largestResultForFive;
        }

    }

    public void report() {

        System.out.println();
        System.out.println("======================================");
        System.out.println("             FINAL REPORT");
        System.out.println("======================================");
        System.out.println("Student name: " + studentName);
        System.out.println("Tables completed: 2, 3, 4, and 5");
        System.out.println("Maximum multiplier: " + maximumMultiplier);
        System.out.println("Grand total: " + grandTotal);
        System.out.printf("Grand average: %.2f%n", grandAverage);
        System.out.println("All even results: " + allEvenResults);
        System.out.println("All odd results: " + allOddResults);
        System.out.println("Largest result: " + largestResult);

        if (grandAverage >= 40) {
            System.out.println("Report level: HIGH");
        } else if (grandAverage >= 20) {
            System.out.println("Report level: MEDIUM");
        } else {
            System.out.println("Report level: LOW");
        }

        System.out.println();
        System.out.println("Result comparison");
        System.out.println("--------------------");

        if (totalForTwo > totalForThree) {
            System.out.println(
                    "Table 2 has a larger total than table 3."
            );
        } else {
            System.out.println(
                    "Table 3 has a larger total than table 2."
            );
        }

        if (totalForFour > totalForFive) {
            System.out.println(
                    "Table 4 has a larger total than table 5."
            );
        } else {
            System.out.println(
                    "Table 5 has a larger total than table 4."
            );
        }

        System.out.println();
        System.out.println("Thank you, " + studentName + "!");
        System.out.println("Program finished successfully.");

        scanner.close();
    }
}
