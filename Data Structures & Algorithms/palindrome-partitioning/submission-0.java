class Solution {
    public boolean isPalindrome(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void helper(String s,List<List<String>>result,List<String>current,int index){
        if(index==s.length()){
            result.add(new ArrayList<>(current));
            return;
        }

        for(int end=index;end<s.length();end++){
            if(isPalindrome(s,index,end)){
                current.add(s.substring(index,end+1));
                helper(s,result,current,end+1);
                current.remove(current.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        List<String>current=new ArrayList<>();

        helper(s,result,current,0);
        return result;
    }
}
