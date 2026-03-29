class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toUpperCase();
        char[] strs=str.toCharArray();
        int start=0;
        int end=strs.length-1;
        while(start<=end){
            if(!Character.isLetterOrDigit(strs[start])){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(strs[end])){
                end--;
                continue;
            }

            if(strs[start]!=strs[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
