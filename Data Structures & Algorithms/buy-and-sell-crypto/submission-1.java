class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int minAmount=Integer.MAX_VALUE;
        int maxProfit=Integer.MIN_VALUE;

        while(i<prices.length){
            if(minAmount>prices[i]){
                minAmount=prices[i];
            }
            if(maxProfit< prices[i]-minAmount){
                maxProfit=prices[i]-minAmount;
            }
            i++;
        }
        return maxProfit;
    }
}
