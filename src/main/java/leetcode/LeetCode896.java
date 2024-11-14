package leetcode;

public class LeetCode896 {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        System.out.println(isMonotonic(nums));
    }

    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                decreasing = false;
            }
            if (nums[i + 1] > nums[i]) {
                increasing = false;
            }
        }
        return decreasing || increasing;

    }
}
