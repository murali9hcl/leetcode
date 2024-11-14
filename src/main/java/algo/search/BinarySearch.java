package algo.search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {70, 40, 30, 11, 57, 41, 25, 14, 52};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print( a[i] + " ");
        }
        System.out.println();
        int r = a.length - 1;
        int result = binarySearch(a, 0,  r, 41);
        if(result == -1){
            System.out.println("value is not found");
        }else {
            System.out.println("value is found at index " + result);
        }
    }

    private static int binarySearch(int[]a, int l, int r, int key) {
       if(r >= l){
           //int mid = l + (r - l)/2;
           int mid = (l + r )/2;
           if(a[mid] == key) {
               return mid;
           }else if(key < a[mid]) {
               return binarySearch(a, l, mid-1, key);
           } else {
               return binarySearch(a, mid + 1, r, key);
           }
       }
        return -1;
    }
}
