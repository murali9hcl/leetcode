package leetcode;

public class LeetCode383 {
    public static void main(String[] args) {
        String ransomNote = "aab", magazine = "baa";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder stringBuilder = new StringBuilder(magazine);
        String reversed = stringBuilder.reverse().toString();
        return magazine.contains(ransomNote) || ransomNote.contains(reversed);
    }
}
