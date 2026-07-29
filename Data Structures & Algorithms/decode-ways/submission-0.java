class Solution {
    public int helper(String s,int idx,Integer[]dp){

        if(idx==s.length()){
            return 1;
        }
        if(s.charAt(idx)=='0'){
            return 0;
        }
        if(dp[idx]!=null){
            return dp[idx];
        }

        int ways=helper(s,idx+1,dp);

        if(idx+1<s.length()){
            int num=(s.charAt(idx)-'0')*10+(s.charAt(idx+1)-'0');

            if(num>=10 && num<=26){
                ways+=helper(s,idx+2,dp);
            }
        }

        return dp[idx]=ways;
    }
    public int numDecodings(String s) {
        Integer[]dp=new Integer[s.length()];

        return helper(s,0,dp);
    }
}
