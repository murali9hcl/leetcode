package neetcode;

public class CountingBits {

    public static void main(String[] args) {
        int n = 5;
        int[] result = countBits(n);
        for (int i = 0; i < result.length; i++) {
            System.out.print(" " + result[i]);
        }
    }


    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = countOnes(i);
        }
        return result;
    }

    private static int countOnes(int num) {
        int count = 0;
        while(num > 0) {
            count+= num & 1;
            num >>=1;
        }
        return count;

    }
}
