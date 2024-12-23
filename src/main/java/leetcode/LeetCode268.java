package leetcode;

public class LeetCode268 {
    public static void main(String[] args) {
       int[] nums = {3,0,1};
       int missingNumber = missingNumber(nums);
        System.out.println("missing Number :" + missingNumber );

    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while( i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

    }
}
