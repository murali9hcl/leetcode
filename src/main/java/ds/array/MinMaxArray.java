package ds.array;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 9};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min value: " + min);
        System.out.println("max value: " + max);
    }
}
