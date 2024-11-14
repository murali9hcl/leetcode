package leetcode;

public class LeetCode35 {

    public static void main(String[] args) {
        int[] nums = {3,6,7,8,10};
        int target = 5;

        searchInsert(nums, target);

    }

    public static int searchInsert(int[] nums, int target) {
            int r = nums.length - 1;
            int result = binarySearch(nums, 0,  r, target);
            if(result == -1) {
                result = binarySearch(nums, 0,  r, target-1);
                result = result + 1;
            }
            System.out.println("result: " + result);
            return result;
    }

    private static int binarySearch(int[]a, int l, int r, int key) {
        if(r >= l){
            int mid = l + (r - l)/2;
            if(a[mid] == key) {
                return mid;
            }else if(key < a[mid]) {
                return binarySearch(a, l, mid-1, key);
            } else {
                return binarySearch(a, mid + 1, r, key);
            }
        }
        return -1;
    }
}
