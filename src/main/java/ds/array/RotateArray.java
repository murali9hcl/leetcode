package ds.array;

public class RotateArray {
    //leetcode48
    public static void main(String[] args) {
       // int[] arr = {1, 2, 3, 4, 5, 6};
       // int[] arr = {1, 2, 3, 4, 5};
        int[] arr = {-1,-100,3,99};
        int d = 2;
        //expected [3,99,-1,-100]
        //int[] arr = {1,2,3,4,5,6,7};
        //int d = 3;
        //expected [5,6,7,1,2,3,4]
        rotateArrayCyclicWithK(arr, d);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] rotateArrayCyclic(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1];
        for (int i = n-1; i > 0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        return arr;
    }

    public static int[] rotateArrayCyclicWithK(int[] arr, int k) {
        int n = arr.length;
        for (int j = 0; j < k; j++) {
            int last = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
        return arr;
    }

    public static int[] rotateArray(int[] arr) {
        int n = arr.length;
            int first = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = first;
        return arr;
    }

    public static int[] rotateArray(int[] arr, int d) {
        int n = arr.length;
        for (int j = 0; j <= d; j++) {
        int first = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = first;
        }
        return arr;
    }


}
