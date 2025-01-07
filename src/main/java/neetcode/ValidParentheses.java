package neetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {
    public static void main(String[] args) {
       // String s = "([{}])";
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length - 1;
        while(start < end) {
            if(map.get(c[start]) != c[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
