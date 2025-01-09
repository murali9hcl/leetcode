package neetcode;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println("missing Number" + missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n+1)/2;
        int arraySum = 0;

        for (int i = 0; i < nums.length; i++) {
            arraySum += nums[i];
        }
        return totalSum - arraySum;
    }
}
