class Solution {
    public int removeElement(int[] nums, int val) {
        
     int len = nums.length;
     int count =0;
     if(len == 0) return len;
     for(int i: nums){
        if(i == val){
            count++;
        }
     } 
     int notval =0;
     int current  = 0;
     while(notval < len && nums[notval] != val){
        notval++;
        current++;
     }
     current++;
     while(current < len){
        if(nums[current] != val){
            nums[notval] = nums[current];
            nums[current] = val;
            notval++;
            current++;
        }else{
            current++; 
        }
     }
     return len-count;
    }
}