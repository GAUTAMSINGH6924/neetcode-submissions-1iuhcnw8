class Solution {
    public boolean helper(String s1, String s2, String s3, int i, int j, int k, Boolean[][] dp) {
        if (i < 0 && j < 0) {
            return true;
        }

        if(i>=0 && j>=0 && dp[i][j]!=null){
            return dp[i][j];
        }
        boolean task1 = false;
        boolean task2 = false;
        if (i >= 0 && s1.charAt(i) == s3.charAt(k)) {
            task1 = helper(s1, s2, s3, i - 1, j, k - 1, dp);
        }
        if (j >= 0 && s2.charAt(j) == s3.charAt(k)) {
            task2 = helper(s1, s2, s3, i, j - 1, k - 1, dp);
        }
        boolean ans=task1 || task2;
        if(i>=0 && j>=0){
            dp[i][j]=ans;
        }
        return ans;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        int i = s1.length();
        int j = s2.length();
        int k = s3.length();
        if (i + j != k) {
            return false;
        }
        Boolean[][] dp = new Boolean[i][j];

        return helper(s1, s2, s3, i - 1, j - 1, k - 1, dp);
    }
}
