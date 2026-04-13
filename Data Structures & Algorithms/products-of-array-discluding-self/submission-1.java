class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] theleft = new int[nums.length];
        int[] theright = new int[nums.length];
        int[] ans = new int[nums.length];
        theleft[0] = 1;
        theright[nums.length-1] = 1;
        for(int i =1; i < nums.length;i++){
            theleft[i] = theleft[i -1]*nums[i-1];
        }
        for(int i = nums.length -2; i >= 0;i--){
            theright[i] = theright[i + 1]*nums[i + 1];
        }
        for(int i =0; i < nums.length;i++){
            ans[i] = theleft[i]*theright[i];
        }
        return ans;
    }
}  
