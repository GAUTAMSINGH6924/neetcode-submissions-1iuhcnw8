class Solution {
    public int helper(String text1, String text2, Integer[][] dp, int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }

        if (text1.charAt(i) == text2.charAt(j)) {
            return dp[i][j] = 1 + helper(text1, text2, dp, i - 1, j - 1);
        }

        return dp[i][j] =
                   Math.max(helper(text1, text2, dp, i - 1, j), helper(text1, text2, dp, i, j - 1));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int i = text1.length();
        int j = text2.length();

        Integer[][] dp = new Integer[i][j];

        return helper(text1, text2, dp, i - 1, j - 1);
    }
}
