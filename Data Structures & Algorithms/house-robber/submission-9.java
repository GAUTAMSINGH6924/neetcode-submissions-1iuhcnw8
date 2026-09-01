class Solution {
    public int helper(int[] nums, Integer[] dp, int idx) {
        if (idx < 0) {
            return 0;
        }

        if (dp[idx] != null) {
            return dp[idx];
        }
        int notTake = helper(nums, dp, idx - 1);

        int take = nums[idx] + helper(nums, dp, idx - 2);
        
        return dp[idx] = Math.max(take, notTake);
    }
    public int rob(int[] nums) {
        Integer[] dp = new Integer[nums.length];

        return helper(nums, dp, nums.length - 1);
    }
}
