package leetcode;

public class LeetCode28 {
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));


    }
    public static int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)) {
            return -1;
        } else {
           return haystack.indexOf(needle);
        }
    }
}
