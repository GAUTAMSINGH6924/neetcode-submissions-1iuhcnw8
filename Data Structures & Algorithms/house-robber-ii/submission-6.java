class Solution {
    public int helper(int[] nums,Integer[]dp,int start,int idx){
        if(idx<start){
            return 0;
        }

        if(dp[idx]!=null){
            return dp[idx];
        }

        int notTake=helper(nums,dp,start,idx-1);
        int take=nums[idx]+helper(nums,dp,start,idx-2);

        return dp[idx]=Math.max(notTake,take);
    }
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        Integer[] dp = new Integer[nums.length];
        Integer[] dp1 = new Integer[nums.length];

        return Math.max(
            helper(nums, dp, 0, nums.length - 2), helper(nums, dp1, 1, nums.length - 1));
    }
}
