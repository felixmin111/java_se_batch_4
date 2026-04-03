package org.example.assigment.aung.day_7;
import java.util.Arrays;

public class array_1d {
    public static void main(String[] args) {
        display();
    }


    public static void printAllElements(int[] arr) {
        System.out.println("Problem 1: Print all elements");
        System.out.println("-------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\n--------------------");
    }

    public static void findArrayLength(int[] arr) {
        System.out.println("Problem 2: Find array length");
        System.out.println("-------------------\n");

        System.out.println("The length of the array is: " + arr.length);

        System.out.println("\n--------------------");
    }

    public static void findSumOfAllElements(int[] arr) {
        System.out.println("Problem 3: Find sum of all elements");
        System.out.println("-------------------\n");
        int sum = 0;
        for (int num :arr) {
            sum += num;
        }
        System.out.println("The sum of the elements is: " + sum);
        System.out.println("\n--------------------\n");
    }

    public static void findMaximumValue(int[] arr) {
        System.out.println("Problem 4: Find maximum value");
        System.out.println("-------------------\n");

        int Largest = arr[0];
        for (int num : arr) {
            if (num > Largest) {
                Largest = num;
            }
        }
        System.out.println("The maximum value is: " + Largest);
        System.out.println("\n--------------------");
    }

    public static void findMinimumValue(int[] arr) {
        System.out.println("Problem 5: Find minimum value");
        System.out.println("-------------------\n");

        int smallest = arr[0];
        for (int num : arr) {
            if (num > smallest) {
                smallest = num;
            }
        }
        System.out.println("The minimum value is: " + smallest);

        System.out.println("\n--------------------");
    }

    public static void searchForAnElement(int[] arr, int target) {
        System.out.println("Problem 6: Search for an element");
        System.out.println("-------------------\n");

        boolean exists = false;
        for (int num : arr) {
            if (num == target) {
                exists = true;
            }
        }
        if (exists) {
            System.out.println("The element is found");
        }
        else {
            System.out.println("The element isn't in here.");
        }


        System.out.println("\n--------------------");
    }

    public static void countEvenNumbers(int[] arr) {
        System.out.println("Problem 7: Count even numbers");
        System.out.println("-------------------\n");
        int count =0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }
        System.out.println("The count of even numbers is: " + count);

        System.out.println("\n--------------------");
    }

    public static void countOddNumbers(int[] arr) {
        System.out.println("Problem 8: Count odd numbers");
        System.out.println("-------------------\n");

        int count =0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }
        System.out.println("The count of odd numbers is: " + count);

        System.out.println("\n--------------------");
    }

    public static void reverseAnArray(int[] arr) {
        System.out.println("Problem 9: Reverse an array");
        System.out.println("-------------------\n");

        int[] reversed = new int[arr.length];
        int index = 0;
        for (int num =  arr.length - 1; num >= 0; num--) {
            reversed[index] = arr[num];
            index++;
        }
        System.out.println(Arrays.toString(reversed));

        System.out.println("\n--------------------");
    }

    public static void copyArray(int[] arr) {
        System.out.println("Problem 10: Copy one array into another");
        System.out.println("-------------------\n");

        int[] new_arr = new int[arr.length];
        for (int num = 0; num < arr.length; num++) {
            new_arr[num] = num;
        }
        System.out.println(Arrays.toString(new_arr));

        System.out.println("\n--------------------");
    }

    public static void replaceNegativeNumbers(int[] arr) {
        System.out.println("Problem 11: Replace negative numbers with 0");
        System.out.println("-------------------\n");

        int[] new_arr = new int[arr.length];
        for (int num = 0; num < arr.length; num++) {
            if (arr[num] > 0) {
                new_arr[num] = arr[num];
            }
            else {
                new_arr[num] = 0;
            }
        }
        System.out.println(Arrays.toString(new_arr));

        System.out.println("\n--------------------");
    }

    public static void sortTheArray(int[] arr) {
        System.out.println("Problem 12: Sort the array");
        System.out.println("-------------------\n");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("\n--------------------");
    }

    public static void checkArraysEqual(int[] arr1, int[] arr2) {
        System.out.println("Problem 13: Check if two arrays are equal");
        System.out.println("-------------------\n");

        System.out.println(Arrays.equals(arr1, arr2));

        System.out.println("\n--------------------");
    }

    public static void findSecondLargest(int[] arr) {
        System.out.println("Problem 14: Find second largest number");
        System.out.println("-------------------\n");

        Arrays.sort(arr);
        System.out.println("Second largest number is " + arr[arr.length-2]);


        System.out.println("\n--------------------");
    }


    public static void checkIfArrayIsSorted(int[] arr) {
        System.out.println("Problem 15: Check if array is sorted");
        System.out.println("-------------------\n");

        int[] new_arr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(new_arr);
        if  (Arrays.equals(arr, new_arr)) {
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }


        System.out.println("\n--------------------");
    }

    public static void countDuplicateValues(int[] arr) {
        System.out.println("Problem 16: Count duplicate values");
        System.out.println("-------------------\n");

        Arrays.sort(arr);
        int count = 1;
        for (int num=0; num < arr.length-1; num++) {
            if (arr[num] == arr[num+1]) {
                count++;
            }
            else if (count>1){

                System.out.println(arr[num] + " appears " + count + " times in the array.");
                count = 1;
            }
            else {
                count=1;
            }

        }
        if (count > 1) {
            System.out.println(arr[arr.length - 1] + " appears " + count + " times in the array.");
        }

        System.out.println("\n--------------------");
    }

    public static void mergeTwoArrays(int[] a, int[] b) {
        System.out.println("Problem 17: Merge two arrays");
        System.out.println("-------------------\n");

        int[] new_arr = new int[a.length + b.length];
        for (int num = 0; num < a.length; num++) {
            new_arr[num] = a[num];
        }
        for (int num = a.length; num < a.length + b.length; num++) {
            new_arr[num] = b[num-a.length];
        }
        System.out.println(Arrays.toString(new_arr));
        System.out.println("\n--------------------");
    }

    public static void findAverage(int[] arr) {
        System.out.println("Problem 18: Find average");
        System.out.println("-------------------\n");
        int sum = 0;
        for  (int num = 0; num < arr.length; num++) {
            sum += arr[num];
        }
        System.out.println("The average is " + sum/arr.length);

        System.out.println("\n--------------------");
    }

    public static void display() {
        // Level 1: Basic
        printAllElements(new int[]{4, 8, 1, 9});
        findArrayLength(new int[]{10, 20, 30, 40, 50});
        findSumOfAllElements(new int[]{1, 2, 3, 4, 5});
        findMaximumValue(new int[]{7, 2, 9, 4, 1});
        findMinimumValue(new int[]{7, 2, 9, 4, 1});

        // Level 2: Searching
        searchForAnElement(new int[]{3, 6, 9, 12}, 9);
        countEvenNumbers(new int[]{2, 5, 8, 7, 10});
        countOddNumbers(new int[]{2, 5, 8, 7, 10});

        // Level 3: Updating values
        reverseAnArray(new int[]{1, 2, 3, 4, 5});
        copyArray(new int[]{4, 5, 6});
        replaceNegativeNumbers(new int[]{3, -1, 5, -7, 2});

        // Level 4: Sorting and comparison
        sortTheArray(new int[]{5, 2, 9, 1});
        checkArraysEqual(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        findSecondLargest(new int[]{10, 5, 8, 20, 15});

        // Level 5: More logical
        checkIfArrayIsSorted(new int[]{1, 2, 3, 4, 5});
        countDuplicateValues(new int[]{1, 2, 2, 3, 4, 4, 4});
        mergeTwoArrays(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        findAverage(new int[]{10, 20, 30, 40});
    }
}