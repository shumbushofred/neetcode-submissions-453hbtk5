class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for(int i=0; i < temperatures.length;i++){
            int j = i +1;
            while(j <= temperatures.length -1 && temperatures[i] >= temperatures[j]){
                j++;
            }
                if(j <= temperatures.length -1){
                ans[i] = j-i;
                }else{
                    ans[i] = 0;
                }
        }
        return ans;
    }
}
