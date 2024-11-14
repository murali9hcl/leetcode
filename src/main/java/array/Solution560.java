package array;

public class Solution560 {
    int[] sum;
    public static void main(String[] args) {
        Solution560 solution = new Solution560();
        int[] nums = {1, -1, 0};
        int k = 0;
        System.out.println("result is " + solution.subarraySum(nums, k));
    }
    public int subarraySum(int[] nums, int k) {
        sum = new int[nums.length];
        int count = 0;
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            sum[i] = total;
        }

        for (int j = 0; j < nums.length -1; j++) {
           if (nums[j] + nums[j+1] == k || nums[j+1] == k || nums[j] == k){
               count++;
           }
        }

        if(nums.length == 1 && nums[0]==k) {
            count = 1;
        }
        return count;
    }
}
