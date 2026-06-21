class Solution {
    public int calPoints(String[] operations) {
        int ans=0;
        Stack<Integer>stack=new Stack<>();
        int i=0;
        while(i<operations.length){
            if(operations[i].equals("+")){
                int top=stack.pop();
                int newItem=top+stack.peek();

                stack.push(top);
                stack.push(newItem);
            }
            else if(operations[i].equals("D")){
                int newItem=stack.peek()*2;
                stack.push(newItem);
            }
            else if(operations[i].equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
            i++;
        }

        while(!stack.isEmpty()){
            ans+=stack.pop();
        }

        return ans;
    }
}