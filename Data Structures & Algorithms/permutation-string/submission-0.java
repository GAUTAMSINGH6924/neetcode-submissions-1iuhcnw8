class Solution {

    public boolean isFreqSame(int[] wind,int[]freq){
         for (int i = 0; i < 26; i++) {
            if (wind[i] != freq[i]) {
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int[] freq=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }  
        for(int i=0;i<s2.length();i++){
            int windowSize=0;
            int idx=i;
            int [] windFreq=new int[26];

            while(windowSize<s1.length() && idx<s2.length()){
                windFreq[s2.charAt(idx)-'a']++;
                windowSize++;
                idx++;
            }

            if(isFreqSame(windFreq,freq)){
                return true;
            }
        } 
        return false;
    }
}
