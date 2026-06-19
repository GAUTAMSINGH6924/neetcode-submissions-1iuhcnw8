class Solution {
    public int helper(int[] nums,int n,int[]dp){
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1)return dp[n];
        int skip=helper(nums,n-1,dp);
        int rob=nums[n]+helper(nums,n-2,dp);

        return dp[n]=Math.max(skip,rob);
    }
    public int rob(int[] nums) {
        int[]dp=new int[nums.length+1];
        Arrays.fill(dp,-1);
        int n=nums.length;
        return helper(nums,n-1,dp);
    }
}
