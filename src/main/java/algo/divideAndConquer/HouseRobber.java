package algo.divideAndConquer;

public class HouseRobber {

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        int[] nums = {2, 7, 9, 3, 1};
        System.out.println("Maximum amount that can be robbed: " + houseRobber.rob(nums));
    }

   // Initial Checks: We handle cases where the input array is null or has no houses. If there's only one house, we return the amount in that house.

   // Dynamic Programming Array: We initialize a dp array where dp[i] holds the maximum amount of money that can be robbed from the first i houses.

   // Iterate and Update: For each house, we update dp[i] using the recurrence relation discussed earlier.

//    Result: Finally, the result is stored in dp[n - 1], which gives the maximum amount of money that can be robbed from all houses.
}

