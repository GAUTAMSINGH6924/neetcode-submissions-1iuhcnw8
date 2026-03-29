class Solution {

    public void generateParenthesisHelper(int n,int open, int close,List<String> result, String current){
        // base case
        if(open==0 && close==0){
            result.add(current);
            return;
        }
        // solve one bakki recusrssion dekh lega
        if(close>open){
            generateParenthesisHelper(n,open,close-1,result,current+")");
        }
        if(open>0){
            generateParenthesisHelper(n,open-1,close,result,current+"(");
        }

            
        }


    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        generateParenthesisHelper(n,n,n,result,"");

        return result;
    }
}
