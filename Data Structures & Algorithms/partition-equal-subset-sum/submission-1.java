class Solution {
    public Boolean helper(int[] nums,int idx,int target,Boolean[][]dp){
        if(target==0){
            return true;
        }
        if(idx==0){
            return target==nums[idx];
        }
        if(dp[idx][target]!=null){
            return dp[idx][target];
        }
        Boolean skip=helper(nums,idx-1,target,dp);
        Boolean take=false;
        if(target>nums[idx]){
            take=helper(nums,idx-1,target-nums[idx],dp);
        }
        return dp[idx][target]=skip||take;
    }
    public Boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%2==1){
            return false;
        }
        int target=sum/2;
        Boolean [][]dp=new Boolean[nums.length][target+1];

        return helper(nums,nums.length-1,target,dp);
    }
}
