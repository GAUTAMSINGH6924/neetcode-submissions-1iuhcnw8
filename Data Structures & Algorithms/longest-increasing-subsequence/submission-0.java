class Solution {

    public int helper(int[] nums,int[][]dp,int prev_idx,int idx){
        if(idx==nums.length){
            return 0;
        }

        if(dp[idx][prev_idx+1]!=-1){
            return dp[idx][prev_idx+1];
        }

        int len=0+helper(nums,dp,prev_idx,idx+1);

        if(prev_idx==-1 || nums[prev_idx]<nums[idx]){
            len=Math.max(len,1+helper(nums,dp,idx,idx+1));
        }
        return dp[idx][prev_idx+1]=len;
    }
    public int lengthOfLIS(int[] nums) {
        int[][]dp=new int[nums.length][nums.length+1];

        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp[i],-1);
        }

        return helper(nums,dp,-1,0);
    }
}
