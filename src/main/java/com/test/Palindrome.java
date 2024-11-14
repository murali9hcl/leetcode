package com.test;

public class Palindrome {


    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(-121));
    }

    public boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while(num > 0) {
            int digit = num% 10;
            rev = (rev*10) + digit;
            num = num/10;
        }
        return temp == rev;
    }
}
