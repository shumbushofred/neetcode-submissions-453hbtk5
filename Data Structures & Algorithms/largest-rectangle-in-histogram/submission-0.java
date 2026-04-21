class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        for(int i =0;i < heights.length;i++){
            int min = heights[i];
            int area = min * 1;
            if(ans < area){
                ans = area;
            }
            for(int j = i +1; j < heights.length;j++){
                min = Math.min(min, heights[j]);
                area = min * ((j-i)+1);
                // System.out.println(i + "  "+ min+ " "+area+" "+ (j-i)+ " "+heights[j]);
                if(ans < area){
                ans = area;
            }
            }
        }
        return ans;
    }
}
