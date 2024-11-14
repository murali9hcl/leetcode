package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13 {
    public static void main(String[] args) {
       // System.out.println(romanToInt("III"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int total = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        for (int i = s.length() -1; i >= 0; i--) {
            char c = s.charAt(i);
            if( i < s.length()-1 && map.get(String.valueOf(s.charAt(i))) < map.get(String.valueOf(s.charAt(i+1)))) {
                total = total - map.get(String.valueOf(c));
            } else {
                total = total + map.get(String.valueOf(c));
            }
        }
        return total;
    }
}
