package leetcode;

public class Leetcode9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        int original = x;
        int reversedNum = 0;
        while(x != 0){
            int digit = x % 10;
            reversedNum = reversedNum * 10 + digit;
            x = x/10;
        }

        return original == reversedNum;
    }
}
