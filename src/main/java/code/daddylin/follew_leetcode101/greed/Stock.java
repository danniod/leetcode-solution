package code.daddylin.follew_leetcode101.greed;

/**
 * No. 122
 */
public class Stock {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit += (Math.max(prices[i] - prices[i - 1], 0));
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(new Stock().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(new Stock().maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println(new Stock().maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
