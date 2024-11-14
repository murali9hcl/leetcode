package leetcode;

public class LeetCode58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
    }

    public static  int lengthOfLastWord(String s) {
        String[] splited = s.split("\\s+");
        String finalword = splited[splited.length -1];
        return finalword.length();
    }

}
