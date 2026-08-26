class Solution {
    public int helper(int[] cost, Integer[] dp, int n) {
        if (n <= 1) {
            return cost[n];
        }
        if (dp[n] != null) {
            return dp[n];
        }
        return dp[n] = cost[n] + Math.min(helper(cost, dp, n - 1), helper(cost, dp, n - 2));
    }
    public int minCostClimbingStairs(int[] cost) {
        Integer[] dp = new Integer[cost.length];

        return Math.min(helper(cost, dp, cost.length - 1), helper(cost, dp, cost.length - 2));
    }
}
