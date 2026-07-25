class Solution {
    public boolean helper(String s, String p,int i ,int j,Boolean[][]dp){
        if(i<0 && j<0){
            return true;
        }
        if(j<0){
            return false;
        }
        if(i<0){
            while(j>=0){
                if(p.charAt(j)!='*'){
                    return false;
                }
                j--;
                j--;
            }
            return true;
        }
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        boolean ans=false;
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'){
            ans=helper(s,p,i-1,j-1,dp);
        }

        else if(p.charAt(j)=='*'){
            ans=helper(s,p,i,j-2,dp);
            if(p.charAt(j-1)==s.charAt(i) || p.charAt(j-1)=='.'){
                ans=ans||helper(s,p,i-1,j,dp);
            }
        }

        return dp[i][j]=ans;
    }
    public boolean isMatch(String s, String p) {
        Boolean[][]dp=new Boolean[s.length()][p.length()];

        return helper(s,p,s.length()-1,p.length()-1,dp);
    }
}
