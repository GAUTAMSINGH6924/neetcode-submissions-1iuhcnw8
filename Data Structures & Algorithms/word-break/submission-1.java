class Solution {
    public boolean helper(String s, List<String> wordDict,Boolean[]dp,int idx){
        if(idx==s.length()){
            return true;
        }

        if(dp[idx]!=null){
            return dp[idx];
        }

        for(String word:wordDict){
            if(idx+word.length()<=s.length() && s.startsWith(word,idx)){
                if(helper(s,wordDict,dp,idx+word.length())){
                    return dp[idx]=true;
                }
            }
        }
        return dp[idx]=false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[]dp=new Boolean[s.length()];

        return helper(s,wordDict,dp,0);
    }
}
