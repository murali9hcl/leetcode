package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode290 {
    public static void main(String[] args) {
        String pattern = "aaaa", s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));



    }

    public static boolean wordPattern(String pattern, String s) {
        char[] pa = pattern.toCharArray();
        String[] a = s.split("\\s+");
        Map<Character, String> map = new HashMap<>();
        boolean result = false;

        for (int i = 0; i < a.length; i++) {
            if(!map.containsKey(pa[i])){
                if(!map.containsValue(a[i])) {
                    map.put(pa[i],a[i]);
                }
            } else{
                if(map.get(pa[i]).equals(a[i])) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
