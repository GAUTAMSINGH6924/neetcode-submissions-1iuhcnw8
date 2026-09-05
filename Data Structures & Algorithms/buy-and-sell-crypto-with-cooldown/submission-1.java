class Solution {
    public int helper(int[] prices,Integer[][]dp,int idx,int buy){
        if(idx>=prices.length){
            return 0;
        }

        if(dp[idx][buy]!=null){
            return dp[idx][buy];
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(-prices[idx]+helper(prices,dp,idx+1,0),helper(prices,dp,idx+1,1));
        }
        else{
            profit=Math.max(prices[idx]+helper(prices,dp,idx+2,1),helper(prices,dp,idx+1,0));
        }

        return dp[idx][buy]=profit;
    }
    public int maxProfit(int[] prices) {
        Integer[][] dp = new Integer[prices.length][2];

        return helper(prices,dp,0,1);
    }
}
