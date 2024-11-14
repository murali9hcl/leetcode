package leetcode;

public class Leetcode27 {
    public static void main(String[] args) {
        //int[] nums = {3,2,2,3};
        //int val = 3;
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int result = removeElement(nums, val);
        System.out.println("count " + result);


    }
    public static  int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] != val) {
                nums[counter] = nums[i];
                counter ++;
            }

        }
        return counter;

    }
}
