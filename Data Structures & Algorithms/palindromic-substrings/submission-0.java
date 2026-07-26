class Solution {
    public boolean helper(String s,int i,int j,Boolean[][]dp){
        if(i>=j){
            return true;
        }

        if(dp[i][j]!=null){
            return dp[i][j];
        }

        if(s.charAt(i)!=s.charAt(j)){
            return dp[i][j]=false;
        }

        return dp[i][j]=helper(s,i+1,j-1,dp);
    }
    public int countSubstrings(String s) {
        Boolean[][]dp=new Boolean[s.length()][s.length()];
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(helper(s,i,j,dp)){
                    count++;
                }
            }
        }
        return count;
    }
}
