class MinStack {
    Stack<Pair<Integer,Integer>>str;
    public MinStack() {
        str=new Stack<>();
    }
    
    public void push(int val) {
        if(str.isEmpty()){
            str.push(new Pair<>(val,val));
        }
        else{
            str.push(new Pair<>(val,Math.min(str.peek().getValue(),val)));
        }
    }
    
    public void pop() {
        if(!str.isEmpty()){
            str.pop();
        }
    }
    
    public int top() {
        return str.peek().getKey();
    }
    
    public int getMin() {
        return str.peek().getValue();
    }
}
