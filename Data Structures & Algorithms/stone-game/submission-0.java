class Solution {
    public int helper(int[] piles,int i,int j,Integer[][]dp){
        if(i>j){
            return 0;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }

        int takeleft=piles[i]-helper(piles,i+1,j,dp);
        int takeRight=piles[j]-helper(piles,i,j-1,dp);

        return dp[i][j]=Math.max(takeleft,takeRight);
    }
    public boolean stoneGame(int[] piles) {
        Integer[][]dp=new Integer[piles.length][piles.length];

        return helper(piles,0,piles.length-1,dp)>0;
    }
}