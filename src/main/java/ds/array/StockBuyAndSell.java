package ds.array;

public class StockBuyAndSell {
    public static void main(String[] args) {
        //int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices = {3, 5, 1, 7, 4, 9, 3};
        System.out.println(maxProfit(prices));
    }


    // time complexity: O(n)
    // space complexity: O(1)
    public static int maxProfit1(int[] prices) {
        int low = Integer.MAX_VALUE;
        int high = 0;
        for (int price : prices) {
            if (price > high && low != Integer.MAX_VALUE) {
                high = price;
            }
            if (price < low) {
                low = price;
            }
        }


        return high - low;
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
