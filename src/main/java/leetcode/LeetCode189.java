package leetcode;

public class LeetCode189 {
    public static void main(String[] args) {
        int[] arr = {-1,-100,3,99};
        int d = 2;
        //expected [3,99,-1,-100]
        //int[] arr = {1,2,3,4,5,6,7};
        //int d = 3;
        //expected [5,6,7,1,2,3,4]
        rotate(arr, d);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        for (int j = 0; j < k; j++) {
            int last = nums[n - 1];
            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = last;
        }
    }
}
