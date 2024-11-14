package ds.array;

import java.util.Arrays;

public class ResizeArray {


    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println("org array length: " + arr.length);
        int[] newArr = resizeArray(arr, arr.length * 2);
        System.out.println("array after resizing :" + newArr.length);
    }

    private static int[] resizeArray(int[] arr, int length) {
        return Arrays.copyOf(arr, length);
    }
}
