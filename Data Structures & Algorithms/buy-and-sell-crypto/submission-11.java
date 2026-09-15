class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>bestBuy){
                profit=Math.max(profit,prices[i]-bestBuy);
            }
            bestBuy=Math.min(prices[i],bestBuy);
        }
        return profit;
    }
}
