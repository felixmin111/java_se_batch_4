package org.example.assigment.aung;
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
public class MultiplicationTableGenerator {

    public static String studentName;
    public static int maximumMultiplier;
    public static int grandTotal;
    public static double grandAverage;
    public static int allEvenResults;
    public static int allOddResults;
    public static int largestResult;
    public static Scanner scanner = new Scanner(System.in);

    public static void getInitialInput(){


        System.out.println("======================================");
        System.out.println("     MULTIPLICATION LEARNING SYSTEM");
        System.out.println("======================================");

        System.out.print("Enter student name: ");
        studentName = scanner.nextLine();

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

        maximumMultiplier = scanner.nextInt();

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
    }

    public static int processTable(int tableNumber) {
        System.out.println();
        System.out.println("Student: " + studentName);
        System.out.println("Multiplication table: " + tableNumber);
        System.out.println("--------------------");

        int total = 0;
        int evenResults = 0;
        int oddResults = 0;
        int tableLargestResult = 0;

        for (int multiplier = 1; multiplier <= maximumMultiplier; multiplier++) {
            int result = tableNumber * multiplier;
            System.out.println(tableNumber + " x " + multiplier + " = " + result);

            total += result;


            if (result % 2 == 0) {
                evenResults++;
                allEvenResults++;
            } else {
                oddResults++;
                allOddResults++;
            }

            if (result > tableLargestResult) {
                tableLargestResult = result;
            }
            if (result > largestResult) {
                largestResult = result;
            }
        }

        double average = (double) total / maximumMultiplier;

        System.out.println("--------------------");
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Even results: " + evenResults);
        System.out.println("Odd results: " + oddResults);
        System.out.println("Largest result: " + tableLargestResult);

        return total;
    }

    public static void finalReport(int totalForTwo, int totalForThree, int totalForFour, int totalForFive) {
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
            System.out.println("Table 2 has a larger total than table 3.");
        } else {
            System.out.println("Table 3 has a larger total than table 2.");
        }

        if (totalForFour > totalForFive) {
            System.out.println("Table 4 has a larger total than table 5.");
        } else {
            System.out.println("Table 5 has a larger total than table 4.");
        }

        System.out.println();
        System.out.println("Thank you, " + studentName + "!");
        System.out.println("Program finished successfully.");

        scanner.close();

    }

    public static void main(String[] args) {
        getInitialInput();
        int totalForTwo = processTable(2);
        int totalForThree = processTable(3);
        int totalForFour = processTable(4);
        int totalForFive = processTable(5);
        grandTotal = totalForTwo + totalForThree + totalForFour + totalForFive;
        grandAverage = (double) grandTotal / maximumMultiplier;

        finalReport(totalForTwo, totalForThree, totalForFour, totalForFive);
    }
}