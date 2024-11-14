package ds.array;

public class Palindrome {
    public static void main(String[] args) {
        String name = "teacher";
        char[] charArr = name.toCharArray();
        System.out.println("is String Palindrome:" + isPalindrome(charArr, 0, charArr.length-1));
    }

    public static boolean isPalindrome(char[] charArr, int start, int end) {
        boolean result = true;
        while(start < end){
            if(charArr[start] != charArr[end]) {
                result = false;
                break;
            }
            start++;
            end--;
        }
        return result;
    }
}
