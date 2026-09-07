class Solution {
    public int helper(int amount, int[] coins,Integer[][]dp,int idx){
        if(amount==0){
            return 1;
        }

        if(amount!=0 && idx<0){
            return 0;
        }

        if(dp[idx][amount]!=null){
            return dp[idx][amount];
        }
        int skip=helper(amount,coins,dp,idx-1);
        int take=0;
        if(amount>=coins[idx]){
            take=helper(amount-coins[idx],coins,dp,idx);
        }

        return dp[idx][amount]=skip+take;
    }
    public int change(int amount, int[] coins) {
        Integer[][]dp=new Integer[coins.length][amount+1];

        return helper(amount,coins,dp,coins.length-1);
    }
}
