class Solution {
    public int helper(int m, int n,Integer[][]dp){
        if(m==0 && n==0){
            return 1;
        }
        if(m<0 || n<0){
            return 0;
        }
        if(dp[m][n]!=null){
            return dp[m][n];
        }

        int up=helper(m-1,n,dp);
        int left=helper(m,n-1,dp);

        return dp[m][n]=up+left;
    }
    public int uniquePaths(int m, int n) {
        Integer[][]dp=new Integer[m][n];

        return helper(m-1,n-1,dp);
    }
}
