class Solution {
    public int helper(int[] stones,Integer[][]dp,int currSum,int target,int idx){
        if(idx==stones.length){
            return currSum;
        }
       
        if(dp[idx][currSum]!=null){
            return dp[idx][currSum];
        }
        int notTake=helper(stones,dp,currSum,target,idx+1);
        int take=Integer.MIN_VALUE;

        if(target-currSum>=stones[idx]){
            take=helper(stones,dp,currSum+stones[idx],target,idx+1);
        }
        return dp[idx][currSum]=Math.max(take,notTake);
    }

    public int lastStoneWeightII(int[] stones) {
        int total=0;
        for(int stone:stones){
            total+=stone;
        }

        int target=total/2;
        Integer[][]dp=new Integer[stones.length][target+1];
        int best=helper(stones,dp,0,target,0);

        return total-(2*best);
    }
}