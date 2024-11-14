package ds.array;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(input, target);
        System.out.println(result[0] + " " + result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length -1; i++) {
            if(target == nums[i] + nums[i+1]) {
                return new int[]{i, i+1};
            }
        }
        return new int[]{};
    }

}
