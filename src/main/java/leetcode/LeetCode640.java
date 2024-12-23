package leetcode;


public class LeetCode640 {
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        int k = 4;
        double maxAvg = findAverages(arr, k);
        System.out.println(" Max Avg " + maxAvg);
    }

    public static double findAverages(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return 0.0;
        // Calculate the sum of the first window
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        // Initialize max average with the first window's average
        double maxAverage = windowSum / k;
        // Slide the window over the array
        for (int end = k; end < n; end++) {
            windowSum = windowSum + arr[end];
            windowSum = windowSum - arr[end - k];
            //windowSum += arr[end] - arr[end - k];
            System.out.println("sum is " + windowSum);
            double currentAverage = windowSum / k;
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
            }
        }
        return maxAverage;
    }

    public static double findAveragesBruteForce(int[] arr, int k) {
        double result = 0;

        // Iterate over the array to select starting point of each subarray
        for (int i = 0; i <= arr.length - k; i++) {
            // Calculate the sum of the next 'k' elements
            double sum = 0;
            for (int j = i; j < i + k; j++) {
                System.out.println("calculating sum for: " + arr[j]);
                sum += arr[j];
            }
            System.out.println("sum  is" + sum);
            // Calculate the average and store it in the result array
            double avg = sum / k;
            System.out.println("avg  is" + avg);
            if(avg > result) {
                result = avg;
            }
        }
        return result;
    }
}

