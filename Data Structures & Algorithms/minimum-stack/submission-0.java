class MinStack {
    Stack<Integer> thes;
    List<Integer> thel;
    int min;
    public MinStack() {
        thes = new Stack<>();
        thel = new ArrayList<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        thes.push(val);
        thel.add(val);
        if(min > val){
            min = val;
        }
    }
    
    public void pop() {
        int temp = thes.pop();
        thel.remove(Integer.valueOf(temp));
        if(temp == min){
            recalculatemin();
        }
    }
    
    public int top() {
        return thes.peek();
    }
    
    public int getMin() {
        return min;
    }
    public void recalculatemin(){
        int temp = Integer.MAX_VALUE;
        for(int i =0;i< thel.size();i++){
            if(temp > thel.get(i)){
                temp = thel.get(i);
            }
        }
        min = temp;
    }
}
