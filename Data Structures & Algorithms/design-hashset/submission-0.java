class MyHashSet {
    List<Integer> thearr;
    public MyHashSet() {
        thearr = new ArrayList<>();
    }
    
    public void add(int key) {
        for(int i =0;i < thearr.size();i++){
            if(thearr.get(i) == key){
                return;
            }
        }
        thearr.add(key);
    }
    
    public void remove(int key) {
         for(int i =0;i < thearr.size();i++){
            if(thearr.get(i) == key){
               thearr.remove(i);
               return;
            }
        }
    }
    
    public boolean contains(int key) {
         for(int i =0;i < thearr.size();i++){
            if(thearr.get(i) == key){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */