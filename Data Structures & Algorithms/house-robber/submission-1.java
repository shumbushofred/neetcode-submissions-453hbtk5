class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        ans[1] = nums[1];
        ans[2] = ans[0] + nums[2];
        for(int i =3; i < ans.length; i++){
            ans[i] = Math.max(ans[i-3], ans[i-2]) + nums[i];
        }
        return Math.max(ans[ans.length-1],ans[ans.length-2]);
    }
}
