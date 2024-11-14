package ds.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ReturnOddIntegers {
    public static void main(String[] args) {
        Integer[] arr = {3, 2, 4,  7, 10, 6, 5};
        //reverseArray(arr, 0, arr.length - 1);
        //int[] oddIntegers = Arrays.stream(arr).filter(i -> i % 2 != 0).toArray();
        //System.out.println(Arrays.toString(arr));
        //System.out.println("minimum value: " + getMinimumValue(arr));
        System.out.println("second highest value: " + getSecondHighest(arr));
        System.out.println("After sorting :");
        sortArray();
    }

    private static void sortArray(){
        int [] arr = {3, 2, 4,  7, 10, 6, 5};
        Arrays.sort(Arrays.stream(arr).boxed().toArray(Integer[]::new), Collections.reverseOrder());
        for (int i = 1; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int getSecondHighest(Integer[] arr) {
     //Arrays.sort(Arrays.stream(arr).boxed().toArray(Integer[]::new), Collections.reverseOrder());
        Arrays.sort(arr, Collections.reverseOrder());
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMinimumValue(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
