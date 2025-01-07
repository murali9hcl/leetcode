package neetcode;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,2,4,6,8};
        int target = 4;
        System.out.println("element present at index " + search(nums, target));

    }
    public static  int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        while(start <= end) {
            int mid = (start +end) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target < nums[mid] ) {
                end = mid - 1;
            } else {
                start  = mid + 1;
            }
        }
        return -1;
    }
}
