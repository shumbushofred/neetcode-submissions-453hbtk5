class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashSet<Integer> theh = new HashSet<>();
     for(int i: nums){
        if(theh.contains(i)){
            return true;
        }
        theh.add(i);
     }
     return false;   
    }
}