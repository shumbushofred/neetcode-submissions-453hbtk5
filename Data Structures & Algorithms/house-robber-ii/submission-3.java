class Solution {
    public int rob(int[] nums) {
        int combsize = nums.length-1;
        int[] comb1 = new int[combsize];
        int[] comb2 = new int[combsize];
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        if(nums.length ==3) return Math.max(nums[0], Math.max(nums[1], nums[2]));
        comb1[0] = nums[0];
        comb1[1] = nums[1];
        comb1[2] = nums[2] + nums[0];
        comb2[0] = nums[1];
        comb2[1] = nums[2];
        if(nums.length >= 4){
            comb2[2] = comb2[0] + nums[3];
        }
        for(int i =3; i < nums.length-1;i++){
            comb1[i] = Math.max(comb1[i-2],comb1[i-3]) + nums[i];
        }
         for(int j =4; j < nums.length;j++){
            comb2[j-1] = Math.max(comb2[j-3],comb2[j-4]) + nums[j];
        }
      System.out.println(Arrays.toString(comb1));
      System.out.println(Arrays.toString(comb2));
        
        return Math.max(
    Math.max(comb1[combsize - 1], comb1[combsize - 2]),
    Math.max(comb2[combsize - 1], comb2[combsize - 2])
);
    }
}
