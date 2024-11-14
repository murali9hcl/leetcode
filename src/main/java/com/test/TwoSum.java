package com.test;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum test = new TwoSum();
        //int[] input = {2,7,11,15};
        int[] input = {3, 2, 3};
        int[] result = test.twoSumImproved(input, 6);
        System.out.println(result[0]+ " "+ result[1]);

    }


    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(i + j < nums.length) {
                    if(nums[i] + nums[i + j] == target) {
                        return new int[]{i, (i + j)};
                    }
                }
            }
        }
        return  new int[]{};
    }

    public int[] twoSumImproved(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           int reqNum = target - nums[i];
           if(map.containsKey(reqNum)){
               return  new int[]{map.get(reqNum), i};
           } else {
               map.put(nums[i], i);
           }
        }
        return  new int[]{};
    }
}
