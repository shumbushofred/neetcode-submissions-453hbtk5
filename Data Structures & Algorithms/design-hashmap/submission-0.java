class MyHashMap {
    List<Pair<Integer,Integer>> thearr;
    public MyHashMap() {
        thearr = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        
        for(int i = 0;i < thearr.size();i++){
            //System.out.println("here");
        if (thearr.get(i).getKey().equals(key)) {
                
                thearr.remove(i);
                thearr.add(new Pair<>(key,value));
                return;
            }
        }
        thearr.add(new Pair<>(key,value));
    }
    
    public int get(int key) {
        for(int i = 0;i < thearr.size();i++){
            if(thearr.get(i).getKey() == key){
                return thearr.get(i).getValue();
            }    
    }
    return -1;
    }
    
    public void remove(int key) {
        for(int i = 0;i < thearr.size();i++){
            if(thearr.get(i).getKey() == key){
                thearr.remove(i);
                return;
            }
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */