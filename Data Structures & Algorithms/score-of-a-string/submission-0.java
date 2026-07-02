class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            char ch1=s.charAt(i+1);
            ans+=Math.abs(ch-ch1);
        }
        return ans;
    }
}