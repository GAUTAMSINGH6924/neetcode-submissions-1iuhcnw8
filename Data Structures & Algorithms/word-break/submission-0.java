class Solution {
    public boolean helper(String s, List<String> wordDict, int idx, Boolean[] dp) {
        if (idx == s.length()) {
            return true;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }

        for(String word:wordDict){
            if(idx+word.length()<=s.length() && s.startsWith(word,idx)){
                if(helper(s, wordDict, idx+word.length(), dp)){
                    return dp[idx]=true;
                }
            }
        }
        return dp[idx]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] dp = new Boolean[s.length()];

        return helper(s, wordDict, 0, dp);
    }
}
