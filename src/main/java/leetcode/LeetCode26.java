package leetcode;


public class LeetCode26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates1(nums));

    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i < nums.length -1 && nums[i] == nums[i+1]) {
            } else {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    public static int removeDuplicates1(int[] nums) {
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]!=nums[i-1]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
