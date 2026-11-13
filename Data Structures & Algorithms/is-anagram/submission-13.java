class Solution {
    public boolean isAnagram(String s, String t) {
        char[]str=s.toCharArray();
        char[]str1=t.toCharArray();

        Arrays.sort(str);
        Arrays.sort(str1);

        if(str.length!=str1.length){
            return false;
        }

        for(int i=0;i<str.length;i++){
            if(str[i]!=str1[i]){
                return false;
            }
        }
        return true;
    }
}
