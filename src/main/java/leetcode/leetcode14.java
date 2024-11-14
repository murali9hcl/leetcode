package leetcode;

import java.util.Arrays;

public class leetcode14 {
    public static void main(String[] args) {
        //String[] strs = {"flower","flow","flight"};
        String[] strs = {};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int j = 1;
        for (String str : strs) {
            String subString = str.substring(0, j);
            boolean finalResult = Arrays.stream(strs).allMatch(k -> k.startsWith(subString));
            if (finalResult) {
                result = subString;
                j++;
            } else {
                break;
            }
        }
        return result;
    }

}
