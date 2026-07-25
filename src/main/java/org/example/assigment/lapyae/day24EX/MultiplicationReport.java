package org.example.assigment.lapyae.day24EX;
import java.util.Scanner;

public class MultiplicationReport {

    // Helper class to hold the statistics for each multiplication table
    static class TableStats {
        int total = 0;
        double average = 0.0;
        int evenResults = 0;
        int oddResults = 0;
        int largestResult = 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printHeader();

        String studentName = getStudentName(scanner);
        int maximumMultiplier = getMaximumMultiplier(scanner);

        // Process tables 2, 3, 4, and 5 using the reusable method
        TableStats stats2 = processTable(2, maximumMultiplier, studentName);
        TableStats stats3 = processTable(3, maximumMultiplier, studentName);
        TableStats stats4 = processTable(4, maximumMultiplier, studentName);
        TableStats stats5 = processTable(5, maximumMultiplier, studentName);

        printFinalReport(studentName, maximumMultiplier, stats2, stats3, stats4, stats5);

        scanner.close();
    }

    private static void printHeader() {
        System.out.println("======================================");
        System.out.println("     MULTIPLICATION LEARNING SYSTEM");
        System.out.println("======================================");
    }

    private static String getStudentName(Scanner scanner) {
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();

        while (studentName.trim().isEmpty()) {
            System.out.println("Student name cannot be empty.");
            System.out.print("Enter student name again: ");
            studentName = scanner.nextLine();
        }
        return studentName;
    }

    private static int getMaximumMultiplier(Scanner scanner) {
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

    private static TableStats processTable(int tableNumber, int maxMultiplier, String studentName) {
        System.out.println();
        System.out.println("Student: " + studentName);
        System.out.println("Multiplication table: " + tableNumber);
        System.out.println("--------------------");

        TableStats stats = new TableStats();

        for (int multiplier = 1; multiplier <= maxMultiplier; multiplier++) {
            int result = tableNumber * multiplier;
            System.out.println(tableNumber + " x " + multiplier + " = " + result);

            stats.total += result;

            if (result % 2 == 0) {
                stats.evenResults++;
            } else {
                stats.oddResults++;
            }

            if (result > stats.largestResult) {
                stats.largestResult = result;
            }
        }

        stats.average = (double) stats.total / maxMultiplier;

        System.out.println("--------------------");
        System.out.println("Total: " + stats.total);
        System.out.printf("Average: %.2f%n", stats.average);
        System.out.println("Even results: " + stats.evenResults);
        System.out.println("Odd results: " + stats.oddResults);
        System.out.println("Largest result: " + stats.largestResult);

        return stats;
    }

    private static void printFinalReport(String studentName, int maxMultiplier,
                                         TableStats t2, TableStats t3,
                                         TableStats t4, TableStats t5) {

        int grandTotal = t2.total + t3.total + t4.total + t5.total;
        double grandAverage = (t2.average + t3.average + t4.average + t5.average) / 4;
        int allEvenResults = t2.evenResults + t3.evenResults + t4.evenResults + t5.evenResults;
        int allOddResults = t2.oddResults + t3.oddResults + t4.oddResults + t5.oddResults;

        int largestResult = Math.max(Math.max(t2.largestResult, t3.largestResult),
                Math.max(t4.largestResult, t5.largestResult));

        System.out.println();
        System.out.println("======================================");
        System.out.println("             FINAL REPORT");
        System.out.println("======================================");
        System.out.println("Student name: " + studentName);
        System.out.println("Tables completed: 2, 3, 4, and 5");
        System.out.println("Maximum multiplier: " + maxMultiplier);
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

        if (t2.total > t3.total) {
            System.out.println("Table 2 has a larger total than table 3.");
        } else {
            System.out.println("Table 3 has a larger total than table 2.");
        }

        if (t4.total > t5.total) {
            System.out.println("Table 4 has a larger total than table 5.");
        } else {
            System.out.println("Table 5 has a larger total than table 4.");
        }

        System.out.println();
        System.out.println("Thank you, " + studentName + "!");
        System.out.println("Program finished successfully.");
    }
}
