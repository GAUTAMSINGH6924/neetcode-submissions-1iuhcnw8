class Solution {
    public boolean isPalindrome(String s) {
        String help=s.toUpperCase();
        char[]str=help.toCharArray();

        int i=0;
        int j=s.length()-1;

        while(i<=j){
            if(!Character.isLetterOrDigit(str[i])){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(str[j])){
                j--;
                continue;
            }

            if(str[i]!=str[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
