class Solution {
    public int maxProfit(int[] prices) {
       int minn = prices[0];
       int ans = 0;
      for(int i =1; i < prices.length;i++){
        if(prices[i] - minn > ans){
            ans = prices[i] - minn;
        }
        if(minn > prices[i]){
            minn = prices[i];
        }
       } 
       return ans;
    }
}
