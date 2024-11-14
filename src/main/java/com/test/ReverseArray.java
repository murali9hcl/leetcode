package com.test;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2, 6, 5};
        arr = reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] reverseArray(int[] arr) {
        int j = arr.length;
        int[] newArray = new int[j];
        for (int i = 0; i < arr.length; i++) {
            newArray[j - 1] = arr[i];
            j--;
        }
        return newArray;
    }
}
