class Solution {
    public void helper(int n,int open ,int close,List<String>result,String current){
        if(open==0 && close==0){
            result.add(current);
            return;
        }

        if(close>open){
            helper(n,open,close-1,result,current+")");
        }
        if(open >0){
            helper(n,open-1,close,result,current+"(");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        helper(n,n,n,result,"");
        return result;
    }
}
