package com.test;

import java.util.Arrays;

public class MergeTwoArrays {
        public static void main(String[] args) {
            // Define two arrays
            int[] array1 = {1, 2, 3, 4};
            int[] array2 = {5, 6, 7, 8};

            // Calculate the length of the merged array
            int[] mergedArray = new int[array1.length + array2.length];

            // Copy elements from the first array
            System.arraycopy(array1, 0, mergedArray, 0, array1.length);

            // Copy elements from the second array
            System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

            // Print the merged array
            System.out.println("Merged Array: " + Arrays.toString(mergedArray));
        }
}
