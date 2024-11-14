package leetcode;

public class LeetCode198 {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result + nums[i];
            i++;
        }
        return result;
    }
}
