package neetcode;

import java.util.HashSet;
import java.util.Set;


public class ArrayDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        System.out.println(hasDuplicateOpt(nums));


    }

    public static boolean hasDuplicate(int[] nums) {
        boolean result = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return result;
    }

    public static boolean hasDuplicateOpt(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                return true;
            }
        }
        return false;
    }
}