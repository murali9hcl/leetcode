package ds.array;

public class FindMissingNumber {


    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,6};
        System.out.println(findMissingNumberInArray(myArray));
    }

    static int findMissingNumberInArray(int[] arr) {
        int n = arr.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        return expectedSum - actualSum; //formula to find missing number in array
    }
    static int findMissingNumberInArray2(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        return n * (n + 1) / 2 - sum;
    }

    public static int findMissingNumberInArray1(int[] array) {
        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int number : array) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }

    //write function to find missing number in array
    //1,2,3,4,6

    static int findMissingNumberInArray(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }
        return n * (n + 1) / 2 - sum; //formula to find missing number in array
    }
}
