class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int minAmount=Integer.MAX_VALUE;
        int MaxProfit=Integer.MIN_VALUE;

        while(i<prices.length){
            if(minAmount>prices[i]){
                minAmount=prices[i];
            }
            if(prices[i]-minAmount>MaxProfit){
                MaxProfit=prices[i]-minAmount;
            }
            i++;
        }
        return MaxProfit;
    }
}