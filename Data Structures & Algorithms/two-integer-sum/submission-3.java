class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> themap = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            int diff = target - nums[i];
            if(themap.containsKey(diff)){
                return new int[]{themap.get(diff), i};
            }
            themap.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
