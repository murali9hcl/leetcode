package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode139 {
    public static void main(String[] args) {
       String s = "leetcode";
       List<String> list = new ArrayList<>();
       list.add("leet");
       list.add("code");
        System.out.println(wordBreak(s, list));

    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        String output = "";
        for (String string : wordDict) {
            output = output + string;
        }
        return s.contains(output);
    }
}
