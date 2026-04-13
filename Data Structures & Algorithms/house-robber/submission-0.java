class Solution {
    public int rob(int[] nums) {
     int[] ans = new int[nums.length];
        if(nums.length == 1) return nums[0];
        ans[0] = nums[0];
        if(nums.length ==2) return Math.max(nums[0], nums[1]);
        ans[1] = nums[1];
        if(nums.length == 3) return Math.max((nums[0]+nums[2]),nums[1]);
        
        ans[2] = Math.max((nums[0] + nums[2]),nums[1]);
        
        for(int i =3; i < nums.length;i++){
            ans[i] = Math.max(ans[i-2],ans[i-3]) + nums[i];
        }
        //System.out.println(Arrays.toString(ans));
        return Math.max(ans[nums.length-1],ans[nums.length-2]);
    }
}