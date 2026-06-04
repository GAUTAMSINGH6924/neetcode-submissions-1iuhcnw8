class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toUpperCase();
        char[] charArray=str.toCharArray();

        int start=0;
        int end=str.length()-1;

        while(start<=end){
            if(!Character.isLetterOrDigit(charArray[start])){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(charArray[end])){
                end--;
                continue;
            }

            if(charArray[start]!=charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
