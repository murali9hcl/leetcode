package neetcode;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {3,4,5,6};
        int target = 7;

        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);

    }

    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;

        while(start < end) {
            int sum = nums[start] + nums[end];
            if(sum == target) {
                return new int[]{start,end};
            }
            if(sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[2];
    }
}
