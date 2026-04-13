class MinStack {
    PriorityQueue<Integer> theq;
    Stack<Integer> thes;
    public MinStack() {
        theq = new PriorityQueue<>();
        thes = new Stack<>();
    }
    
    public void push(int val) {
        thes.push(val);
        theq.add(val);
    }
    
    public void pop() {
        theq.remove(thes.pop());
    }
    
    public int top() {
        return thes.peek();
    }
    
    public int getMin() {
        return theq.peek();
    }
}
