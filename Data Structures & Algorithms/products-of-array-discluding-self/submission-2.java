class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] theleft = new int[nums.length];
       int[] theright = new int[nums.length];
       int[] ans = new int[nums.length];
       theleft[0] =1;
       theright[nums.length-1] =1;
    //    theleft[1] = nums[0];
       for(int i =1; i < nums.length;i++){
        theleft[i] = theleft[i-1] * nums[i-1];
       }
    //    System.out.println(Arrays.toString(theleft));
    //    theright[nums.length-2] = nums[nums.length-1];
       for(int j =nums.length-2; j >=0 ;j--){
        theright[j] = theright[j+1] * nums[j+1];
       }
       for(int k =0;k < nums.length;k++){
        ans[k] = theright[k] * theleft[k];
       }
       return ans;
    }
}  
