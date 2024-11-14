package leetcode;

public class LeetCode125 {
    public static void main(String[] args) {
    String s = "A man, a plan, a canal: Panama";
    //String s = " ";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String input = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder(input);
        String reversed = sb.reverse().toString();
        return input.compareToIgnoreCase(reversed) == 0;
    }
}
