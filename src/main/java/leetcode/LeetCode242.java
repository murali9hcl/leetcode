package leetcode;

import java.util.Arrays;

public class LeetCode242 {



    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        int result = Arrays.compare(c, d);
        return result == 0;
    }
}
