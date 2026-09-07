class Solution {
    public int helper(int[] coins, int amount, Integer[][] dp, int idx) {
        if (amount == 0) {
            return 0;
        }

        if (amount != 0 && idx < 0) {
            return (int) 1e9;
        }
        if(dp[idx][amount]!=null){
            return dp[idx][amount];
        }
        int notTake = helper(coins, amount, dp, idx - 1);

        int take = (int) 1e9;

        if (amount >= coins[idx]) {
            take = 1 + helper(coins, amount - coins[idx], dp, idx);
        }

        return dp[idx][amount]=Math.min(take, notTake);
    }
    public int coinChange(int[] coins, int amount) {
        Integer[][] dp = new Integer[coins.length][amount + 1];
        int ans = helper(coins, amount, dp, coins.length - 1);
        return ans >= (int) 1e9 ? -1 : ans;
    }
}
