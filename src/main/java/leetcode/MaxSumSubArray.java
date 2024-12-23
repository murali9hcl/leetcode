package leetcode;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int maxSum = findMaxSumSubarray(arr, k);
        System.out.println("Maximum sum of subarrays of size " + k + ": " + maxSum);
    }

    public static int findMaxSumSubarray(int[] arr, int k) {
      int maxSum = 0;
      int windowSum = 0;
        //find sum for first k elements
        for (int i = 0; i < k; i++) {
            windowSum +=arr[i];
        }
        maxSum = windowSum;
        // implementing the sliding window
        for (int end = k; end < arr.length; end++) {
            windowSum = windowSum + arr[end];
            windowSum = windowSum - arr[end - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
}
