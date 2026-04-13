class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> themap = new HashMap<>();
       for(int i =0;i<nums.length;i++){
        int rem = target - nums[i];
        if(themap.containsKey(rem)){
            return new int[]{themap.get(rem),i};
        }else{
            themap.put(nums[i], i);
        }
       } 
       return new int[]{0,0};
    }
}
