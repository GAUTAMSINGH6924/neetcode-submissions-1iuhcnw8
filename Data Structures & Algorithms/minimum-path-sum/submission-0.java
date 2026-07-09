class Solution {
    public int helper(int[][] grid,int i,int j,int[][]dp){
        if(i==0&&j==0){
            return grid[i][j];
        }
        if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }

        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        int top=helper(grid,i-1,j,dp);
        int left=helper(grid,i,j-1,dp);

        return dp[i][j]=grid[i][j]+Math.min(top,left);
    }
    public int minPathSum(int[][] grid) {
        int[][]dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            Arrays.fill(dp[i],-1);
        }

        return helper(grid,grid.length-1,grid[0].length-1,dp);
    }
}