class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        if (len ==0) return 0;
        if(len == 1) return nums[0];
        HashMap<Integer,Integer> themap = new HashMap<>();
        int half = len/2;
        for(int i: nums){
            if(themap.containsKey(i)){
             int temp = themap.get(i) +1;
             if (temp > half){
                return i;
             }
             themap.put(i, temp);
            }else{
                themap.put(i,1);
            }
        }
        return 0;
    }
}