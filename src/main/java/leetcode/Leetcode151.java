package leetcode;

import java.util.Stack;

public class Leetcode151 {
    public static void main(String[] args) {
        String input = "the sky is blue";
        //result = "blue is sky the";
        String result = reverseWords(input);
        System.out.println(result);
    }

    public static  String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        String[] splited = s.split("\\s+");
        for (String string : splited) {
            stack.push(string);
        }
        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
