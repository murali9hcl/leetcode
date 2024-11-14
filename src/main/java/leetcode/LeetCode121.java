package leetcode;

public class LeetCode121 {
    public static void main(String[] args) {
        //int[] prices = {7,6,4,3,1};
        int[] prices = {2,1};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = prices.length-1; i > 0; i--) {
            for (int j = i - 1; j > 0; j--) {
                int result = prices[i] - prices[j];
                if(result > 0 && result > maxProfit) {
                    maxProfit = result;
                }
            }
        }
        return maxProfit;
    }
}
