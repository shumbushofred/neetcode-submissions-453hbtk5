class MyStack {
    Queue<Integer> theq;
    public MyStack() {
        theq = new LinkedList<>();
    }
    
    public void push(int x) {
        theq.add(x);
        for(int i =0; i < theq.size()-1;i++){
            theq.add(theq.poll());
        }
    }
    
    public int pop() {
        return theq.poll();
    }
    
    public int top() {
        return theq.peek();
    }
    
    public boolean empty() {
        return theq.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */