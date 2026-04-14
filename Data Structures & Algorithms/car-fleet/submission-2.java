class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        List<Pair<Integer,Integer>> thelist = new ArrayList<>();
        for(int i =0;i < position.length;i++){
            Pair<Integer,Integer> temp = new Pair<>(position[i], speed[i]);
            thelist.add(temp);
        }
        Collections.sort(thelist,(p1,p2) -> p2.getKey() - p1.getKey());
        Stack<Float> thestack = new Stack<>();
        for(int j = 0; j < thelist.size();j++){
            Pair<Integer,Integer> temp = thelist.get(j);
            
            float timetodest = (float)(target - temp.getKey()) / (float)temp.getValue();
            if(thestack.isEmpty()){
                thestack.push(timetodest);
            }else{
              System.out.println(temp.getKey() + "  "+ thestack.peek() + "  "+ timetodest);
                if(thestack.peek() < timetodest){
                    thestack.push(timetodest);
                }
            }
        }
        return thestack.size();
    }
}
