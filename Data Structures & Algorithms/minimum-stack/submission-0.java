class MinStack {
    Stack<Pair<Integer,Integer>> str;
    public MinStack() {
        str=new Stack<>();
    }
    
    public void push(int val) {
        if(str.isEmpty()){
            str.push(new Pair<>(val,val));
        }
        else{
            str.push(new Pair<>(val,Math.min(val,str.peek().getValue())));
        }
    }
    
    public void pop() {
        if(!str.isEmpty()){
            str.pop();
        }
    }
    
    public int top() {
        if(!str.isEmpty()){
            return str.peek().getKey();
        }
        return -1;
    }
    
    public int getMin() {
        return str.peek().getValue();
    }
}
