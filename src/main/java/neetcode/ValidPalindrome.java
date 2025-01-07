package neetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        //String s = "Was it a car or a cat I saw?";
        String s = "0P";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z]", "");
        int start = 0;
        int end = s.length() -1;
        while(start < end) {
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
