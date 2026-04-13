class Solution {
    public int trap(int[] height) {
        int total =0;
        int prevhighest = 0;
        int[] fromleft = new int[height.length];
        int[] fromright = new int[height.length];
        
        for(int i=0; i < fromleft.length;i++){
            if(prevhighest >= height[i]){
              fromleft[i] = prevhighest;
            }else{
                fromleft[i] = prevhighest;
                prevhighest = height[i];
            }
        }
        prevhighest = 0;
        for(int j=fromright.length-1; j >= 0 ;j--){
            if(prevhighest >= height[j]){
              fromright[j] = prevhighest;
            }else{
                fromright[j] = prevhighest;
                prevhighest = height[j];
            }
        }
        for(int k=0; k < height.length;k++){
            int num = Math.min(fromright[k],fromleft[k]);
            int temp = num - height[k];
            if(temp > 0){
                total = total + temp;
            }
        }
        return total;
    }
}
