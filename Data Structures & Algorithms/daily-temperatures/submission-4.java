class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for(int i = 0; i < temperatures.length;i++){
            int k =0;
            for(int j = i +1 ; j < temperatures.length;j++){
                k++;
                if(temperatures[i] < temperatures[j]){
                    ans[i] = k;
                    break;
                }
            }
        }
        return ans;
    }
}
