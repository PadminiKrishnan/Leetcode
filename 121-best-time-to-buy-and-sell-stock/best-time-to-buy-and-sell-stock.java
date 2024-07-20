class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int price : prices) {
            if (buyPrice > price) {
                buyPrice = price;
            }
            profit = Math.max(profit, price - buyPrice);
        }
        return profit;
}
}