package org.example.Day22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

public class ListPerformanceDemo {

    private static final int DATA_SIZE = 200_000;
    private static final int ACCESS_COUNT = 20_000;

    public static void main(String[] args) {

        System.out.printf("Data size: %,d records%n", DATA_SIZE);
        System.out.printf("Access count: %,d operations%n%n", ACCESS_COUNT);

        // Give the JVM some work before measuring.
        warmUp();

        testAddAtEnd("ArrayList", ArrayList::new);
        testAddAtEnd("LinkedList", LinkedList::new);

        System.out.println();

        List<Student> arrayList = createList(new ArrayList<>());
        List<Student> linkedList = createList(new LinkedList<>());

        testSequentialIteration("ArrayList", arrayList);
        testSequentialIteration("LinkedList", linkedList);

        System.out.println();

        testIndexAccess("ArrayList", arrayList);
        testIndexAccess("LinkedList", linkedList);

        System.out.println();

        testAddAtBeginningArrayList();
        testAddAtBeginningLinkedList();

        System.out.println();

        testRemoveFromBeginningArrayList();
        testRemoveFromBeginningLinkedList();
    }

    private static void testAddAtEnd(
            String listName,
            Supplier<List<Student>> listSupplier
    ) {
        List<Student> students = listSupplier.get();

        long startTime = System.nanoTime();

        for (int i = 0; i < DATA_SIZE; i++) {
            students.add(createStudent(i));
        }

        long endTime = System.nanoTime();

        printResult(
                listName + " - add at end",
                endTime - startTime
        );
    }

    private static void testSequentialIteration(
            String listName,
            List<Student> students
    ) {
        long totalScore = 0;

        long startTime = System.nanoTime();

        for (Student student : students) {
            totalScore += student.score();
        }

        long endTime = System.nanoTime();

        printResult(
                listName + " - sequential iteration",
                endTime - startTime
        );

        // Prevent the JVM from treating the calculation as unused.
        System.out.println("Score checksum: " + totalScore);
    }

    private static void testIndexAccess(
            String listName,
            List<Student> students
    ) {
        long totalScore = 0;

        long startTime = System.nanoTime();

        for (int i = 0; i < ACCESS_COUNT; i++) {
            int index = (i * 97) % students.size();
            totalScore += students.get(index).score();
        }

        long endTime = System.nanoTime();

        printResult(
                listName + " - get by index",
                endTime - startTime
        );

        System.out.println("Score checksum: " + totalScore);
    }

    private static void testAddAtBeginningArrayList() {
        List<Student> students = new ArrayList<>();

        long startTime = System.nanoTime();

        for (int i = 0; i < DATA_SIZE; i++) {
            students.add(0, createStudent(i));
        }

        long endTime = System.nanoTime();

        printResult(
                "ArrayList - add at beginning",
                endTime - startTime
        );
    }

    private static void testAddAtBeginningLinkedList() {
        LinkedList<Student> students = new LinkedList<>();

        long startTime = System.nanoTime();

        for (int i = 0; i < DATA_SIZE; i++) {
            students.addFirst(createStudent(i));
        }

        long endTime = System.nanoTime();

        printResult(
                "LinkedList - add at beginning",
                endTime - startTime
        );
    }

    private static void testRemoveFromBeginningArrayList() {
        List<Student> students = createList(new ArrayList<>());

        long startTime = System.nanoTime();

        while (!students.isEmpty()) {
            students.remove(0);
        }

        long endTime = System.nanoTime();

        printResult(
                "ArrayList - remove from beginning",
                endTime - startTime
        );
    }

    private static void testRemoveFromBeginningLinkedList() {
        LinkedList<Student> students =
                (LinkedList<Student>) createList(new LinkedList<>());

        long startTime = System.nanoTime();

        while (!students.isEmpty()) {
            students.removeFirst();
        }

        long endTime = System.nanoTime();

        printResult(
                "LinkedList - remove from beginning",
                endTime - startTime
        );
    }

    private static List<Student> createList(List<Student> students) {
        for (int i = 0; i < DATA_SIZE; i++) {
            students.add(createStudent(i));
        }

        return students;
    }

    private static Student createStudent(long id) {
        return new Student(
                id,
                "Student-" + id,
                (int) (id % 101)
        );
    }

    private static void printResult(
            String testName,
            long elapsedNanoseconds
    ) {
        double milliseconds = elapsedNanoseconds / 1_000_000.0;

        System.out.printf(
                "%-45s: %12.3f ms%n",
                testName,
                milliseconds
        );
    }

    private static void warmUp() {
        for (int round = 0; round < 3; round++) {
            List<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < 50_000; i++) {
                numbers.add(i);
            }

            long sum = 0;

            for (Integer number : numbers) {
                sum += number;
            }

            if (sum == -1) {
                System.out.println("Impossible");
            }
        }
    }
    public record Student(
            long id,
            String name,
            int score
    ) {
    }
}