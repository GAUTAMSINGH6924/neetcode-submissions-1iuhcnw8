class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int minAmount=Integer.MAX_VALUE;
        int maxProfit=Integer.MIN_VALUE;

        while(i<prices.length){
           minAmount=Math.min(minAmount,prices[i]);
           maxProfit=Math.max(maxProfit,prices[i]-minAmount);
           
            i++;
        }
        return maxProfit;
    }
}
