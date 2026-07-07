class Solution {
    public int helper(int[] nums, int target,int idx,int sum){
        if(idx==nums.length && target!=sum){
            return 0;
        }
        if(idx==nums.length && target==sum){
            return 1;
        }

        int neg=helper(nums,target,idx+1,sum-nums[idx]);
        int pos=helper(nums,target,idx+1,sum+nums[idx]);

        return neg+pos;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0,0);
    }
}
