package org.example.assigment.lapyae.day7;

import java.util.Arrays;

public class arrayy_1D {
    public static void main(String[] args) {
        display();
    }

    public static void display(){
        printALLElements(new int[]{1,5,8,9,2});
        findARRAYLength(new int[]{10,20,30,40,50});
        findSumOfALLElements(new int[]{1,2,3,4,5});
        findMAXimumValue(new int[]{7,2,9,4,1});
        findMINImumValue(new int[]{7,2,9,4,1});
        searchForANElement(new int[]{3,6,9,12},9);
        countEVENNumbers(new int[]{2,5,8,7,10});
        countODDNumbers(new int[]{2,5,8,7,10});
        rEVERSEAnArray(new int[]{1,2,3,4,5});
        copyARRAY(new int[]{4,5,6});
        replaceNEGATIVENumbers(new int[]{3,-1,5,-7,2});
        sortTheARRAY(new int[]{5,2,9,1});
        checkArraysEQUAL(new int[]{1,2,3}, new int[]{1,2,3});
        findSecondLARGEST(new int[]{10,5,8,20,15});
        checkIfArrayIsSORTED(new int[]{1,2,3,4,5});
        countDUPLICATEValues(new int[]{1,2,2,3,4,4,4});
        mergeTWOArrays(new int[]{1,2,3}, new int[]{4,5,6});
        findAVERAGE(new int[]{10,20,30,40});
    }

    public static void printALLElements(int[] arr) {
        System.out.println("Problem 1: Print all elements");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n--------------------");
    }

    public static void findARRAYLength(int[] arr) {
        System.out.println("Problem 2: Find array length");
        System.out.println(arr.length);
        System.out.println("--------------------");
    }

    public static void findSumOfALLElements(int[] arr) {
        System.out.println("Problem 3: Find sum of all elements");
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        System.out.println(sum);
        System.out.println("--------------------");
    }

    public static void findMAXimumValue(int[] arr) {
        System.out.println("Problem 4: Find maximum value");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println("--------------------");
    }

    public static void findMINImumValue(int[] arr) {
        System.out.println("Problem 5: Find minimum value");
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        System.out.println("--------------------");
    }

    public static void searchForANElement(int[] arr, int target) {
        System.out.println("Problem 6: Search for an element");
        boolean found = false;
        for (int n : arr) {
            if (n == target) {
                found = true;
                break;
            }
        }
        if (found == true) {
            System.out.println("It is found!");
        }
        else {
            System.out.println("It can't be found!");
        }
        System.out.println("--------------------");
    }

    public static void countEVENNumbers(int[] arr) {
        System.out.println("Problem 7: Count even numbers");
        int count = 0;
        for (int n : arr) {
            if (n % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("--------------------");
    }

    public static void countODDNumbers(int[] arr) {
        System.out.println("Problem 8: Count odd numbers");
        int count = 0;
        for (int n : arr) {
            if (n % 2 != 0) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println("--------------------");
    }

    public static void rEVERSEAnArray(int[] arr) {
        System.out.println("Problem 9: Reverse an array");
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------");
    }

    public static void copyARRAY(int[] arr) {
        System.out.println("Problem 10: Copy one array into another");
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(copy));
        System.out.println("--------------------");
    }

    public static void replaceNEGATIVENumbers(int[] arr) {
        System.out.println("Problem 11: Replace negative numbers with 0");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------");
    }

    public static void sortTheARRAY(int[] arr){
        System.out.println("Problem 12: Sort the array");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------");
    }

    public static void checkArraysEQUAL(int[] arr1, int[] arr2) {
        System.out.println("Problem 13: Check if two arrays are equal");
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println("--------------------");
    }

    public static void findSecondLARGEST(int[] arr) {
        System.out.println("Problem 14: Find second largest number");
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);
        System.out.println("--------------------");
    }

    // --- LEVEL 5: MORE LOGICAL ---

    public static void checkIfArrayIsSORTED(int[] arr) {
        System.out.println("Problem 15: Check if array is sorted");
        int[] new_arr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(new_arr);
        if (Arrays.equals(arr, new_arr)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");
        }
        System.out.println("--------------------");
    }

    public static void countDUPLICATEValues(int[] arr) {
        System.out.println("Problem 16: Count duplicate values");
        Arrays.sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println(arr[i] + " appears " + count + " times");
                }
                count = 1;
            }
        }
        if (count > 1) {
            System.out.println(arr[arr.length - 1] + " appears " + count + " times");
        }
        System.out.println("--------------------");
    }

    public static void mergeTWOArrays(int[] a, int[] b) {
        System.out.println("Problem 17: Merge two arrays");
        int[] merged = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) merged[i] = a[i];
        for (int i = 0; i < b.length; i++) merged[a.length + i] = b[i];
        System.out.println(Arrays.toString(merged));
        System.out.println("--------------------");
    }

    public static void findAVERAGE(int[] arr) {
        System.out.println("Problem 18: Find average");
        double sum = 0;
        for (int n : arr) sum += n;
        System.out.println(sum / arr.length);
        System.out.println("--------------------");
    }

}
