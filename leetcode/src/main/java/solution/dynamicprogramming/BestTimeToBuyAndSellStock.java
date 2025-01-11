package solution.dynamicprogramming;

public class BestTimeToBuyAndSellStock {

    public int maxProfitV1(int[] prices) { // time limit exceeded
        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public int maxProfitV2(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int maxProfit = 0;
        int minBuy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minBuy) {
                minBuy = prices[i];
            }
            int profit = prices[i] - minBuy;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
