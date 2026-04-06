package org.example.assigment.thiri.Day7;

//Java Array Utility Methods
// These are common things you use when solving array problems:

import java.util.Arrays;

public class array1D {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {3,8,2,1,5};

        printingAllElements(a); //1.
        arrLength(a); //2
        sumOfElementsInArray(a); //3
        maxValue(a); //4

        minValue(a); //5
        searchingElement(5, a);//6
        countingEvenNum(a); //7
        countingOddNum(a); //8
        reversingArray(a); //8

        copingArray(a); //9
        replacingNegativeNum(new int[] {-1, 3, 4,-11, 17, -99}); //11
        sortingArr(new int[] {7,6,3,9,1}); //12

        comparingArr(a, b); //13
        secondLargest(b);//14

        checkingSorted(new int[] {2, 5,2,7}); //15
        countDuplicateValues(new int[] {11,2,9,5,8,9,1,3,6,3,5,9,2}); //16
        mergingTwoArrays(a,b); //17
        findingAverage(a);//18
    }

    //Java Array Practice Problems
    //Level 1: Basic
    //Problem 1: Print all elements
    //Write a program to print all elements of an array.
    public static void printingAllElements (int[] nums) {
        System.out.print("1. Printing all elements of an array: ");
        for (int i = 0; i < nums.length ; i++) {
            System.out.print (nums[i] + " ");
        }
    }

    //Problem 2: Find array length
    //Write a program to print the number of elements in an array.
    public static void arrLength(int[] nums) {
        System.out.print("\n2. Length of the array: ");
        System.out.println (nums.length);
    }

    //Problem 3: Find sum of all elements
    //Write a program to find the sum of all numbers in an array.
    public static void sumOfElementsInArray(int[] nums) {
        int sum = 0;
        for(int i=0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.print("3. The sum of all numbers in an array: ");
        System.out.println (sum);
    }

    //Problem 4: Find maximum value
    //Write a program to find the largest element in an array.
    public static void maxValue(int[] nums){
        int a = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > a) {
                a =nums[i];
         }
        }
        System.out.print("4. The largest element in an array: ");
        System.out.println (a);
    }

    //Problem 5: Find minimum value
    //Write a program to find the smallest element in an array.
    public static void minValue(int[] nums){
        int a = nums[0];
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < a) {
                a =nums[i];
            }
        }
        System.out.print("5. The smallest element in an array: ");
        System.out.println (a);
    }

    //Level 2: Searching
    //Problem 6: Search for an element
    public static void searchingElement(int num, int[] nums){
        String a = "Not found";
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == num) {
                a = "Found";
            }
        }
        System.out.print("6. Checking whether a number exists in the array: ");
        System.out.println (a);
    }

    //Problem 7: Count even numbers
    //Write a program to count how many even numbers are in the array.
    public static void countingEvenNum(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0) {
                count += 1;
            }
        }
        System.out.print("7. Counting even number in the array: ");
        System.out.println (count);
    }

    //Problem 8: Count odd numbers
    //Write a program to count how many odd numbers are in the array.
    public static void countingOddNum(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 != 0) {
                count += 1;
            }
        }
        System.out.print("8. Counting odd number in the array: ");
        System.out.println (count);
    }

    //Level 3: Updating values
    //Problem 9: Reverse an array
    //Write a program to reverse the array.
    public static void reversingArray(int[] nums) {
        int[] reverse = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            reverse[i] = nums[nums.length - 1 - i];
            }
            System.out.print("9. Reversing the array: ");
            System.out.println(Arrays.toString(reverse));
    }

    //Problem 10: Copy one array into another
    //Write a program to copy all elements of one array to another.
    public static void copingArray(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        System.out.print("10. Copying the array: ");
        System.out.println(Arrays.toString(copy));
    }

    //Problem 11: Replace negative numbers with 0
    //Write a program that changes every negative value into 0.
    public static void replacingNegativeNum(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }
        System.out.print("11. Counting odd number in the array: ");
        System.out.println (Arrays.toString(nums));
    }

    //Level 4: Sorting and comparison
    //Problem 12: Sort the array
    //Write a program to sort an array in ascending order.
    public static void sortingArr(int[] nums) {
        Arrays.sort(nums);
        System.out.print("12. Sort an array in ascending order: ");
        System.out.println (Arrays.toString(nums));
    }

    //Problem 13: Check if two arrays are equal
    //Write a program to compare two arrays.
    public static void comparingArr(int[] nums1, int[] nums2) {
        String condition = "Not Same";
        if (Arrays.equals(nums1, nums2)) {
            condition = "Same";
        }
        System.out.print("13. Comparing two arrays: ");
        System.out.println (Arrays.toString(nums1) + " vs " +Arrays.toString(nums2) + " --> " + condition);
    }

    //Problem 14: Find second largest number
    //Write a program to find the second largest number in the array.
    public static void secondLargest(int[] nums) {
        Arrays.sort(nums);
        int secMax = nums[nums.length-2];
        System.out.print("14. Second largest number in the array: ");
        System.out.println ( secMax );
    }

    //Level 5: More logical
    //Problem 15: Check if array is sorted
    //Write a program to check whether the array is already sorted in ascending order.
    public static void checkingSorted (int[] nums) {
        int[] sort = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sort);
        String condition = "No";
        if (Arrays.equals(nums, sort)) {
            condition = "Yes";
        }
        System.out.print("15. The array is already sorted in ascending order: ");
        System.out.println (condition);
    }

    //Problem 16: Count duplicate values
    //Write a program to count how many duplicate elements are in the array.
    public static void countDuplicateValues(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        System.out.println("16. Counting how many duplicate elements are in the array");
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
            } else {
                if (count > 1) {
                    System.out.println("    " + nums[i] + " appears " + count + " times");
                }
                count = 1; // reset for next number
            }
        }
        // handle last element
        if (count > 1) {
            System.out.println("    " + nums[nums.length - 1] + " appears " + count + " times");
        }
    }

    //Problem 17: Merge two arrays
    //Write a program to combine two arrays into one.
    public static void mergingTwoArrays(int[] nums1, int[] nums2) {
        int[] num3 = Arrays.copyOf(nums1, nums1.length+nums2.length);
        for (int i = 0; i <nums2.length; i++){
            num3[nums1.length+i] = nums2[i];
        }
        System.out.print("17. Combining two arrays into one: ");
        System.out.println (Arrays.toString(num3));
    }

    //Problem 18: Find average
    //Write a program to calculate the average of array elements.
    //Input:
    //Int[ ] arr = {10, 20, 30, 40};
    //Output:
    //25.0
    public static void findingAverage(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        int avg = sum / nums.length;
        System.out.print("18. Calculating the average of array elements: ");
        System.out.println (avg);
    }
}
