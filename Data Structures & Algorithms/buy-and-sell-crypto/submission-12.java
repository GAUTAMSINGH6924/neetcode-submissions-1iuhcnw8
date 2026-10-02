class Solution {
    public int maxProfit(int[] prices) {
        int bestBuy=prices[0];
        int profit=0;
        int i=0;

        while(i<prices.length){
            if(bestBuy<prices[i]){
                profit=Math.max(profit,prices[i]-bestBuy);
            }
            bestBuy=Math.min(bestBuy,prices[i]);
            i++;
        }
        return profit;
    }
}
