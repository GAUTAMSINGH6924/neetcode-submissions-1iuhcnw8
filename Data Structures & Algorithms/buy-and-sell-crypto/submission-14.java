class Solution {
    public int maxProfit(int[] prices) {
        int bestTime=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            bestTime=Math.min(bestTime,prices[i]);
            max=Math.max(max,prices[i]-bestTime);
        }

        return max;
    }
}
