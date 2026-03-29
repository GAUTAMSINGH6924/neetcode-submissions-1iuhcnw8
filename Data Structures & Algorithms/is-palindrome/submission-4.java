class Solution {
    public boolean isPalindrome(String s) {
        String st=s.toUpperCase();
        char[] str=st.toCharArray();
        int start=0;
        int e=str.length-1;

        while(start<=e){
            if(!Character.isLetterOrDigit(str[start])){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(str[e])){
                e--;
                continue;
            }
            if(str[start]!=str[e]){
                return false;
            }
            start++;
            e--;
        }
        return true;
    }
}
