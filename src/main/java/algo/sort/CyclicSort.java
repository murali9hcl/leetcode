package algo.sort;

public class CyclicSort {

    public static void main(String[] args) {
        int[] nums = {3,1,2,5,4};
        int[] result = sort(nums);
        for (int i : result) {
            System.out.println(i + " ");
        }
    }

    public static int[] sort(int[] nums) {
        int i = 0;
       while( i < nums.length) {
           int correctIndex = nums[i] - 1;
           if(nums[i]!= nums[correctIndex]) {
               swap(nums, i, correctIndex);
           } else {
               i ++;
           }
       }
        return nums;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }


}
