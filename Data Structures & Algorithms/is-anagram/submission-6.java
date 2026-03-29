class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str=s.toCharArray();
        char[] str1=t.toCharArray();
        Arrays.sort(str);
        Arrays.sort(str1);
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(str[i]!=str1[i]){
                return false;
            }
        }
        return true;
    }
}
