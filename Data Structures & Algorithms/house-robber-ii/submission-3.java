class Solution {

    public int helper(int[] nums,int start,int end,int[]dp){
        if(end<start){
            return 0;
        }

        if(dp[end]!=-1)return dp[end];
        int skip=helper(nums,start,end-1,dp);
        int rob=nums[end]+helper(nums,start,end-2,dp);

        return dp[end]=Math.max(skip,rob);
    }
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int[]dp=new int[nums.length];
        int[]dp1=new int[nums.length];

        Arrays.fill(dp,-1);
        Arrays.fill(dp1,-1);

        return Math.max(helper(nums,0,nums.length-2,dp),helper(nums,1,nums.length-1,dp1));
    }
}
