class Solution {
    public int climbStairs(int n) {
      int[] helper = new int[n];
      helper[0] =1;
      if(n > 1){
        helper[1] =2;
      }
      for(int i = 2; i < n;i++){
        helper[i] = helper[i-2] + helper[i-1];
      }
      return helper[n-1];
    }
}
