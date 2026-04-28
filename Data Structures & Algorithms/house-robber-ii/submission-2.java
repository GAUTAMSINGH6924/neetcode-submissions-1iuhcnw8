class Solution {
    public int helper(int n,int start,int[]dp,int[]nums){
        if(start>n)return 0;
        if(dp[n]!=-1)return dp[n];

        return dp[n]=Math.max(helper(n-1,start,dp,nums),nums[n]+helper(n-2,start,dp,nums));
    }
    public int rob(int[] nums) {
        if(nums.length==1)return nums[0];
        int[] dp1 = new int[nums.length];
        int[] dp2 = new int[nums.length];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int case1 = helper(nums.length - 1, 1, dp1, nums);
        int case2 = helper(nums.length - 2, 0, dp2, nums);

        return Math.max(case1, case2);
    }
}
