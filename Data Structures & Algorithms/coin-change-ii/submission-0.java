class Solution {
    public int helper(int amount, int[] coins,int idx,int[][]dp){
        if(amount==0){
            return 1;
        }
        if(idx<0 && amount>0){
            return 0;
        }
        if(dp[idx][amount]!=-1){
            return dp[idx][amount];
        }
        int skip=helper(amount,coins,idx-1,dp);
        int take=0;
        if(amount>=coins[idx]){
            take=helper(amount-coins[idx],coins,idx,dp);
        }

        return dp[idx][amount]=skip+take;
    }
    public int change(int amount, int[] coins) {
        int[][]dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(amount,coins,coins.length-1,dp);
    }
}
