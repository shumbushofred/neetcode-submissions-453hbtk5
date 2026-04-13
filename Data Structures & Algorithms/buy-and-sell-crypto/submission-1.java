class Solution {
    public int maxProfit(int[] prices) {
        int answer =0;
        int low = Integer.MAX_VALUE;
        for (int i: prices){
            int val = i-low;
            if(val > answer){
                answer = val;
            }
            if(low > i){
                low =i;
            }
        }
        return answer;
    }
}
