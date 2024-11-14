package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        int cand = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(count == 0) {
                cand = nums[i];
            }
            if(cand == nums[i]){
                count++;
            } else {
                count--;
            }
        }

        return count;
    }

    public static int majorityElementOld(int[] nums) {
        int result = 0;
        int length = nums.length;
        int majority = length/2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                map.put(nums[i], ++count);
            } else {
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue() > majority) {
                result = entry.getKey();
            }
        }
        return result;

    }


}
