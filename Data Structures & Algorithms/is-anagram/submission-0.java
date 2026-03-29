class Solution {
    public boolean isAnagram(String s, String t) {
        char[] str=s.toCharArray();
        char[] str1=t.toCharArray();

        Arrays.sort(str);
        Arrays.sort(str1);

        if(str.length!=str1.length){
            return false;
        }
        int i=0;
        while(i<str.length){
            if(str[i]!=str1[i]){
                return false;
            }
            else{
                i++;
            }
        }
        return true;
    }
}
