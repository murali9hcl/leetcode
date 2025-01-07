package neetcode;

public class StockPrice {

    public static void main(String[] args) {
        int[] prices = {10,1,5,6,7,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < minValue) {
                minValue = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i]- minValue);
            }
        }
      return maxProfit;
    }
}
