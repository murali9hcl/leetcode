package ds.array;


public class MissingNumberArray {
    public static void main(String[] args) {
        //int[] arr = {2, 4, 1, 8, 6, 3, 7};
        int[] arr = {1,2,3,5};
        System.out.println("Missing number is: " + findMissingNumber(arr));
    }

    private static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = (n* (n+1))/2;
        for (int i : arr) {
            sum = sum - i;
        }
        return sum;
    }


}
