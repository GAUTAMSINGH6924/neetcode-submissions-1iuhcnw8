class Solution {
    int[][]directions={{-1,0},{0,1},{1,0},{0,-1}};

    public int helper(int[][] matrix,int i,int j,int[][]dp){
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int maxLength=1;
        for(int[]dir:directions){
            int ni=i+dir[0];
            int nj=j+dir[1];

            if(ni>=0 && ni<matrix.length &&
               nj>=0 && nj<matrix[0].length &&
               matrix[ni][nj]>matrix[i][j]
               ){
                maxLength=Math.max(maxLength,1+helper(matrix,ni,nj,dp));
            }
        }
        return dp[i][j]=maxLength;
    }
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int[][]dp=new int[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }

        int ans=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans=Math.max(ans,helper(matrix,i,j,dp));
            }
        }

        return ans;
    }
}
