class Solution {
    public int helper(int n, int[] cost, int[] dp) {
        if(n==0)return cost[0];
        if(n==1)return cost[1];
        if(dp[n]!=0)return dp[n];

        return dp[n]=cost[n]+Math.min(helper(n - 1, cost, dp), helper(n - 2, cost, dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp = new int[cost.length];
        return Math.min(helper(n - 1, cost, dp), helper(n - 2, cost, dp));
    }
}
