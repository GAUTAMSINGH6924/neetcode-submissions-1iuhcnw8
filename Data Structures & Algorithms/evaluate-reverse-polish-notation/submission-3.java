class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>str=new Stack<>();
        int result=-1;

        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||
            tokens[i].equals("-")||
            tokens[i].equals("/")||
            tokens[i].equals("*")){
                int b=str.pop();
                int a=str.pop();

                if(tokens[i].equals("+")){
                    result=a+b;
                }
                else if(tokens[i].equals("-")){
                    result=a-b;
                }
                else if(tokens[i].equals("/")){
                    result=a/b;
                }
                else{
                    result=a*b;
                }
                str.push(result);
            }
            else{
                str.push(Integer.parseInt(tokens[i]));
            }
        }
        return str.peek();
    }
}
