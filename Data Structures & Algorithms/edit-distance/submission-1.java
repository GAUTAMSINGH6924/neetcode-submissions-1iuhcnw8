class Solution {
    public int helper(String word1, String word2,Integer[][]dp,int i,int j){
        if(i<0){
            return j+1;
        }
        if(j<0){
            return i+1;
        }

        if(dp[i][j]!=null){
            return dp[i][j];
        }
        if(word1.charAt(i)==word2.charAt(j)){
            return dp[i][j]=helper(word1,word2,dp,i-1,j-1);
        }
        int insert=1+helper(word1,word2,dp,i,j-1);
        int delete=1+helper(word1,word2,dp,i-1,j);
        int replace=1+helper(word1,word2,dp,i-1,j-1);

        return dp[i][j]=Math.min(insert,Math.min(delete,replace));

    }
    public int minDistance(String word1, String word2) {
        Integer[][]dp=new Integer[word1.length()][word2.length()];

        return helper(word1,word2,dp,word1.length()-1,word2.length()-1);
    }
}
