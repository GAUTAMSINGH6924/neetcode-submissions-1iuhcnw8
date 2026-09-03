class Solution {
    public boolean helper(int[] nums, Boolean[][] dp, int target, int idx) {
        if(target==0){
            return true;
        }
        if (idx == 0) {
            if (target == nums[idx]) {
                return true;
            } else {
                return false;
            }
        }

        if (dp[target][idx] != null) {
            return dp[target][idx];
        }

        boolean notTake = helper(nums, dp, target, idx - 1);
        boolean take = false;
        if (target >= nums[idx]) {
            take = helper(nums, dp, target - nums[idx], idx - 1);
        }

        return dp[target][idx] = take || notTake;
    }
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        if(total%2==1){
            return false;
        }
        int target = total / 2;
        Boolean[][] dp = new Boolean[target + 1][nums.length];
        return helper(nums, dp, target, nums.length - 1);
    }
}
