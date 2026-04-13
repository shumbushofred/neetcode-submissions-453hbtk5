class MyQueue {
    Stack<Integer> thein;
    Stack<Integer> theout;
    public MyQueue() {
        thein = new Stack<>();
        theout = new Stack<>();
    }
    
    public void push(int x) {
        thein.push(x);
    }
    
    public int pop() {
        peek();
        return theout.pop();
    }
    
    public int peek() {
        if(theout.isEmpty()){
            while(!thein.isEmpty()){
                theout.push(thein.pop());
            }
        }
        return theout.peek();
    }
    
    public boolean empty() {
       return theout.isEmpty() && thein.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */