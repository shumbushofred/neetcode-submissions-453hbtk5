class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> them = new HashSet<>();
        for(int i: nums){
            if(them.contains(i)) return true;
            them.add(i);
        }
        return false;
    }
}
