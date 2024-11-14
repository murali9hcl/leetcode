package leetcode;

public class LeetCode66 {
    public static void main(String[] args) {
        //int[] digits = {1,2,3};
        int[] digits = {9};
       int[] result = plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] plusOneOld(int[] digits) {
        StringBuilder s = new StringBuilder();
        for (int digit : digits) {
            s.append(digit);
        }
        String numberStr = String.valueOf(Integer.parseInt(s.toString()) + 1);
        int[] digitsUpdated = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digitsUpdated[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digitsUpdated;
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}
