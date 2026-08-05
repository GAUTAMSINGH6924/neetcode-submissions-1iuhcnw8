class Solution {

    public int helper(int[] stoneValue,Integer[]dp,int idx){
        if(idx>=stoneValue.length){
            return 0;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }
        int ans=Integer.MIN_VALUE;
        int taken=0;
        for(int i=0;i<3 && idx+i<stoneValue.length;i++){
            taken+=stoneValue[idx+i];

            ans=Math.max(ans,taken-helper(stoneValue,dp,idx+i+1));
        }

        return dp[idx]=ans;
    }
    public String stoneGameIII(int[] stoneValue) {
        Integer[]dp=new Integer[stoneValue.length];

        int ans=helper(stoneValue,dp,0);
        if(ans>0){
            return "Alice";
        }
        else if(ans<0){
            return "Bob";
        }
        else{
            return "Tie";
        }
    }
}