class Solution {
    public int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0]=0;
        right[height.length-1]=0;
        for(int i = 1; i < height.length;i++){
            left[i] = Math.max(left[i-1], height[i-1]);
        }
        for(int j = height.length-2; j >= 0;j--){
            right[j] = Math.max(right[j+1], height[j+1]);
        }
        int[] ans = new int[height.length];
        for(int k = 0; k < height.length;k++){
            ans[k] = Math.max((Math.min(left[k], right[k])) - height[k], 0);
        }
        int altans = 0;
        for(int z: ans){
            altans += z;
        }
        return altans;
    }
}
