class Solution {
    public int maxSubArray(int[] nums) {
     int currentsum = 0;
     int ans = nums[0];
     for(int i =0; i < nums.length;i++){
        currentsum= 0;
        for(int j= i ; j < nums.length;j++){
            currentsum = currentsum + nums[j];
            ans = Math.max(ans, currentsum);
        }
     }
     return ans;   
    }
}
