class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> themap = new HashSet<>();
        for(int i: nums){
            if (themap.contains(i)){
                return true;
            }else{
                themap.add(i);
            }
        }
        return false;
    }
}
