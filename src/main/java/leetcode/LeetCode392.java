package leetcode;

public class LeetCode392 {

    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {
        boolean result = false;
        char[] c = s.toCharArray();
        for (char c1 : c) {
            result = t.indexOf(c1) >= 0;
            if(!result) {
                break;
            }
        }
        return result;

    }
}
