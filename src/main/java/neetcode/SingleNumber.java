package neetcode;


public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        // XOR all elements
         for (int num : nums) {
             result =result^num;
             System.out.println("after result " + result);
         }
        return result;
    }
}
