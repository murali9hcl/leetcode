package leetcode;

import java.util.Arrays;

public class LeetCode88 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
       int count = 0;
        for (int i = 0; i < m; i++) {
                nums1[count] = nums1[i];
                count++;
        }
        for (int i = 0; i < n; i++) {
            nums1[count] = nums2[i];
            count++;
        }
        Arrays.sort(nums1);
        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}
