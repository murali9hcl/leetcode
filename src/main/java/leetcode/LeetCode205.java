package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode205 {
    public static void main(String[] args) {
       String s = "a", t = "a";

        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (!map.containsValue(t.charAt(i))) {
                    map.put(s.charAt(i), t.charAt(i));
                }
            } else {
                return map.get(s.charAt(i)).equals(t.charAt(i));
            }
        }
        return false;
    }
}
