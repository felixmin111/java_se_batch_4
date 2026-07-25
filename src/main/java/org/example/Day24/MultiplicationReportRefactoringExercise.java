import java.util.Scanner;

/*
 * FUNCTION-SEPARATION REFACTORING EXERCISE
 *
 * This program works, but it intentionally contains repeated logic.
 *
 * Important:
 * - There is no loop around tables 2, 3, 4, and 5.
 * - Each table has its own row loop.
 * - Some small methods already exist.
 * - The student must decide what additional methods should be extracted.
 *
 * Student goals:
 * 1. Find repeated blocks.
 * 2. Extract reusable methods.
 * 3. Give each method one clear responsibility.
 * 4. Keep the output unchanged.
 */
private static final int MINIMUM_MULTIPLIER = 1;
private static final int MAXIMUM_MULTIPLIER = 12;

void main() {
    Scanner scanner = new Scanner(System.in);

    displayProgramHeader();

    System.out.print("Enter student name: ");
    String studentName = scanner.nextLine();

    System.out.print("Enter maximum multiplier (1-12): ");
    int maximumMultiplier = scanner.nextInt();

    while (maximumMultiplier < MINIMUM_MULTIPLIER
            || maximumMultiplier > MAXIMUM_MULTIPLIER) {
        System.out.println("The number must be between 1 and 12.");
        System.out.print("Enter maximum multiplier again: ");
        maximumMultiplier = scanner.nextInt();
    }

    // -------------------- TABLE 2 --------------------

    displayTableHeader(studentName, 2);

    int totalForTwo = 0;
    int evenResultsForTwo = 0;
    int oddResultsForTwo = 0;

    for (int multiplier = 1;
         multiplier <= maximumMultiplier;
         multiplier++) {

        int result = 2 * multiplier;
        displayTableRow(2, multiplier, result);
        totalForTwo = totalForTwo + result;

        if (result % 2 == 0) {
            evenResultsForTwo++;
        } else {
            oddResultsForTwo++;
        }
    }

    double averageForTwo =
            calculateAverage(totalForTwo, maximumMultiplier);

    displayTableSummary(
            totalForTwo,
            averageForTwo,
            evenResultsForTwo,
            oddResultsForTwo
    );

    // -------------------- TABLE 3 --------------------

    displayTableHeader(studentName, 3);

    int totalForThree = 0;
    int evenResultsForThree = 0;
    int oddResultsForThree = 0;

    for (int multiplier = 1;
         multiplier <= maximumMultiplier;
         multiplier++) {

        int result = 3 * multiplier;
        displayTableRow(3, multiplier, result);
        totalForThree = totalForThree + result;

        if (result % 2 == 0) {
            evenResultsForThree++;
        } else {
            oddResultsForThree++;
        }
    }

    double averageForThree =
            calculateAverage(totalForThree, maximumMultiplier);

    displayTableSummary(
            totalForThree,
            averageForThree,
            evenResultsForThree,
            oddResultsForThree
    );

    // -------------------- TABLE 4 --------------------

    displayTableHeader(studentName, 4);

    int totalForFour = 0;
    int evenResultsForFour = 0;
    int oddResultsForFour = 0;

    for (int multiplier = 1;
         multiplier <= maximumMultiplier;
         multiplier++) {

        int result = 4 * multiplier;
        displayTableRow(4, multiplier, result);
        totalForFour = totalForFour + result;

        if (result % 2 == 0) {
            evenResultsForFour++;
        } else {
            oddResultsForFour++;
        }
    }

    double averageForFour =
            calculateAverage(totalForFour, maximumMultiplier);

    displayTableSummary(
            totalForFour,
            averageForFour,
            evenResultsForFour,
            oddResultsForFour
    );

    // -------------------- TABLE 5 --------------------

    displayTableHeader(studentName, 5);

    int totalForFive = 0;
    int evenResultsForFive = 0;
    int oddResultsForFive = 0;

    for (int multiplier = 1;
         multiplier <= maximumMultiplier;
         multiplier++) {

        int result = 5 * multiplier;
        displayTableRow(5, multiplier, result);
        totalForFive = totalForFive + result;

        if (result % 2 == 0) {
            evenResultsForFive++;
        } else {
            oddResultsForFive++;
        }
    }

    double averageForFive =
            calculateAverage(totalForFive, maximumMultiplier);

    displayTableSummary(
            totalForFive,
            averageForFive,
            evenResultsForFive,
            oddResultsForFive
    );

    // -------------------- FINAL CALCULATIONS --------------------

    int grandTotal =
            totalForTwo
                    + totalForThree
                    + totalForFour
                    + totalForFive;

    double grandAverage =
            (averageForTwo
                    + averageForThree
                    + averageForFour
                    + averageForFive) / 4;

    int allEvenResults =
            evenResultsForTwo
                    + evenResultsForThree
                    + evenResultsForFour
                    + evenResultsForFive;

    int allOddResults =
            oddResultsForTwo
                    + oddResultsForThree
                    + oddResultsForFour
                    + oddResultsForFive;

    displayFinalReportHeader();
    System.out.println("Student name: " + studentName);
    System.out.println("Tables completed: 2, 3, 4, and 5");
    System.out.println("Maximum multiplier: " + maximumMultiplier);
    System.out.println("Grand total: " + grandTotal);
    System.out.printf("Grand average: %.2f%n", grandAverage);
    System.out.println("All even results: " + allEvenResults);
    System.out.println("All odd results: " + allOddResults);

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

private static void displayProgramHeader() {
    System.out.println("======================================");
    System.out.println("     MULTIPLICATION LEARNING SYSTEM");
    System.out.println("======================================");
}

private static void displayTableHeader(
        String studentName,
        int tableNumber
) {
    System.out.println();
    System.out.println("Student: " + studentName);
    System.out.println("Table of " + tableNumber);
    System.out.println("--------------------");
}

private static void displayTableRow(
        int tableNumber,
        int multiplier,
        int result
) {
    System.out.println(
            tableNumber + " x " + multiplier + " = " + result
    );
}

private static double calculateAverage(
        int total,
        int numberOfResults
) {
    return (double) total / numberOfResults;
}

private static void displayTableSummary(
        int total,
        double average,
        int evenResults,
        int oddResults
) {
    System.out.println("Total: " + total);
    System.out.printf("Average: %.2f%n", average);
    System.out.println("Even results: " + evenResults);
    System.out.println("Odd results: " + oddResults);
    System.out.println();
}

private static void displayFinalReportHeader() {
    System.out.println("======================================");
    System.out.println("             FINAL REPORT");
    System.out.println("======================================");
}