class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
       for(int i =0; i < nums.length;i++){
        int findit =nums[i] +1;
        int counter = 1;
        for(int j =i+1;j < nums.length;j++){
            if(findit == nums[j]){
                counter++;
                findit++;
            }
        }
        if(counter > ans){
            ans = counter;
        }
       } 
       return ans;
    }
    
}
