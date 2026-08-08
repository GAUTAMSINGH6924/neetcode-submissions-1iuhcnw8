class Solution {
    public int helper(int[] nums,int idx,Integer[]dp){
        if(idx<0){
            return 0;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }

        int skip=helper(nums,idx-1,dp);
        int rob=nums[idx]+helper(nums,idx-2,dp);

        return dp[idx]=Math.max(skip,rob);
    }
    public int rob(int[] nums) {
        Integer[]dp=new Integer[nums.length];

        return helper(nums,nums.length-1,dp);
    }
}
