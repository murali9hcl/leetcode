package array;

public class NumArray {
    int[] sum;
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        int left = 1;
        int right = 2;
        NumArray obj = new NumArray(nums);
        System.out.println("sum is :" +  obj.sumRange(left,right));
    }


    public NumArray(int[] nums) {
        sum = new int[nums.length];
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            this.sum[i] = total;
        }
    }

    public int sumRange(int left, int right) {
        int rightSum = sum[right];
        int leftSum = 0;
        if(left > 0) {
            leftSum = sum[left - 1];
        }
        return rightSum - leftSum;
    }
}
