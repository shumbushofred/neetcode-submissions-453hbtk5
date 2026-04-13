class Solution {
    public int minCostClimbingStairs(int[] cost) {
   int[] ans = new int[cost.length];
        ans[0] = cost[0];
        ans[1] = cost[1];
        for(int i =2; i < cost.length;i++){
            cost[i] = Math.min(cost[i-1],cost[i-2]) + cost[i];
        }
        return Math.min(cost[cost.length-1],cost[cost.length-2]);
    }
}