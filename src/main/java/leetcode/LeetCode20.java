package leetcode;

import java.util.Stack;

public class LeetCode20 {
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        char[] c = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c1 : c) {
            if (c1 == '{') {
                stack.push('}');
            } else if (c1 == '(') {
                stack.push(')');
            } else if (c1 == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c1) {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
