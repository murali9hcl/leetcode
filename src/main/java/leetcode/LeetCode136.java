package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class LeetCode136 {
    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
       int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    public static int singleNumberOld(int[] nums) {
        Queue<Integer> queue = new LinkedList<>();
        for (int num : nums) {
            if (!queue.contains(num)) {
                queue.add(num);
            } else {
                if (num == queue.peek()) {
                    queue.poll();
                }
            }
        }
        return queue.peek();
    }
}
