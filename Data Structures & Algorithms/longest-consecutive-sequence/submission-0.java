class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> themap = new HashSet<>();
        int ans = 0;
        for(int z: nums){
            themap.add(z);
        }
        for(int i: nums){
            int temp =1;
            int num = i+1;
            while(themap.contains(num)){
                temp++;
                num++;
            }
            if(temp > ans){
                ans = temp;
            }
        }
        return ans;
    }
}
