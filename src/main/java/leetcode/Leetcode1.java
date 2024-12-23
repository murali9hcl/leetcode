package leetcode;



public class Leetcode1 {
    public static void main(String[] args) {

        //int[] arr = {2, 7, 11, 15};
        int[] arr = {3,2,4};
        //int[] result = getIndexes(arr, 13);
        int[] result = twoSum(arr, 6);
        System.out.println(result[0] + " " + result[1]);


    }

    private static int[] getIndexes(int[] arr, int key) {
        int[] result = new int[2];
        int j = 1;
        while(j < arr.length) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] + arr[j] == key) {
                    result[0] = i;
                    result[1] = j;
                }
            }
            j++;
        }

        return result;
    }

    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while (start < end) {
            int sum = nums[start] + nums[end];
            if(sum == target) {
                return new int[]{start, end};
            }
            if(sum < target) {
                start ++;
            } else {
                end --;
            }
        }
        return new int[]{0};
    }
}
