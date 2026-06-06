class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        int result=-1;

        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")||
            tokens[i].equals("-")||
            tokens[i].equals("/")||
            tokens[i].equals("*")){
                int b=stack.pop();
                int a=stack.pop();

                if(tokens[i].equals("+")){
                    result=a+b;
                }
                else if (tokens[i].equals("-")){
                    result=a-b;
                }   
                else if(tokens[i].equals("*")){
                    result=a*b;
                }
                else{
                    result=a/b;
                }
                stack.push(result);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}
