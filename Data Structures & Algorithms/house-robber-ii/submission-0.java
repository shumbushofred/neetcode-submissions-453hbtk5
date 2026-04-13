class Solution {
    public int rob(int[] nums) {
    int[] scen1 = new int[nums.length-1];
        int[] scen2 = new int[nums.length-1];
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        if(nums.length == 3) return Math.max(nums[1],Math.max(nums[0],nums[2]));
        scen1[0] = nums[0];
        scen1[1] = nums[1];
        scen1[2] = nums[0] + nums[2];
        
        scen2[0] = nums[1];
        scen2[1] = nums[2];
        if(nums.length == 4) return Math.max(scen1[scen1.length-1],Math.max(nums[1] + nums[3], nums[2]));
        scen2[2] = nums[1] + nums[3];
        for(int i =3; i < nums.length-1;i++){
            scen1[i] = Math.max(scen1[i-2],scen1[i-3]) + nums[i];
        }
        for(int i =4; i < nums.length;i++){
            scen2[i-1] = Math.max(scen2[i-3],scen2[i-4]) + nums[i];
        }
        System.out.println(Arrays.toString(scen1));
        System.out.println(Arrays.toString(scen2));
        return Math.max(Math.max(scen1[scen1.length-1],scen2[scen2.length-1]),Math.max(scen1[scen1.length-2],scen2[scen2.length-2]));
    }
}