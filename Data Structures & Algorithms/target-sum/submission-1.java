class Solution {
    public int helper(int[] nums, int target, int idx, int sum, Integer[][] dp, int offset) {
        if (idx == nums.length && target != sum) {
            return 0;
        }
        if (idx == nums.length && target == sum) {
            return 1;
        }
        if (dp[idx][sum + offset] != null)
            {return dp[idx][sum + offset];}
        int neg = helper(nums, target, idx + 1, sum - nums[idx], dp, offset);
        int pos = helper(nums, target, idx + 1, sum + nums[idx], dp, offset);

        return dp[idx][sum + offset] =neg + pos;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int total = 0;
        for (int x : nums) {
            total += x;
        }

        Integer[][] dp = new Integer[nums.length][2 * total + 1];
        return helper(nums, target, 0, 0, dp, total);
    }
}
