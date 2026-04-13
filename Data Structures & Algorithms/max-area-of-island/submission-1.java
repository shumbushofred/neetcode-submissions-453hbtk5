class Solution {
    int ans;
    int count;
    public int maxAreaOfIsland(int[][] grid) {
       ans =0; 
       for(int i =0; i< grid.length;i++){
        for(int j=0; j < grid[0].length;j++){
            if(grid[i][j] == 1){
                count =0;
                helper(grid,i,j);
                if(count > ans){
                    ans = count;
                }
                // System.out.println(ans);
            }
        }
       }
       return ans;
    }
    public void helper(int[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j <0 || j >= grid[0].length || grid[i][j] == 0){
            return;
        }
        grid[i][j] = 0;
        count++;
        helper(grid,i + 1,j);
        helper(grid,i -1 ,j);
        helper(grid,i,j + 1);
        helper(grid,i,j - 1);
    }

}