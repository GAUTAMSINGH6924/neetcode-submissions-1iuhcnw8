class Solution {
    public int helper(int[] nums, int target, int sum, int idx,int offset,Integer[][]dp) {
        if (idx < 0) {
            if (sum == target) {
                return 1;
            } else {
                return 0;
            }
        }

        if(dp[idx][sum+offset]!=null){
            return dp[idx][sum+offset];
        }

        int min = helper(nums, target, sum - nums[idx], idx - 1,offset,dp);
        int plus = helper(nums, target, sum + nums[idx], idx - 1,offset,dp);

        return dp[idx][sum+offset]=min + plus;
    }
    public int findTargetSumWays(int[] nums, int target) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        Integer[][]dp=new Integer[nums.length][2*total+1];
        return helper(nums, target, 0, nums.length - 1,total,dp);
    }
}
