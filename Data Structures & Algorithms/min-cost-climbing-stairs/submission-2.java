class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] ans = new int[cost.length];
        ans[0] = cost[0];
        ans[1] = cost[1];
        for(int i = 2;i < ans.length; i++){
            System.out.println("am here");
            ans[i] = Math.min(ans[i-1], ans[i-2]) + cost[i];
        }
        // System.out.println(ans);
        return Math.min(ans[cost.length-1], ans[cost.length-2]);
    }
}
