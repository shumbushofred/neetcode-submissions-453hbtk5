class MinStack {
    Stack<Integer> thes;
    Stack<Integer> themin;
    public MinStack() {
        thes = new Stack<>();
        themin = new Stack<>();
    }
    
    public void push(int val) {
        thes.push(val);
        if(themin.isEmpty()){
            themin.push(val);
        }else{
            if(val > themin.peek()){
                themin.push(themin.peek());
            }else{
                themin.push(val);
            }
        }
    }
    
    public void pop() {
        themin.pop();
        thes.pop();
    }
    
    public int top() {
        return thes.peek();
    }
    
    public int getMin() {
        return themin.peek();
    }
}
