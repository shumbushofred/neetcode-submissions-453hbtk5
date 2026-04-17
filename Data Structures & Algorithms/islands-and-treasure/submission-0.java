class Solution {
    public void islandsAndTreasure(int[][] grid) {
        for(int i =0; i < grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == 0){
                    helper(grid,i,j+1,1);
                    helper(grid,i,j-1,1);
                    helper(grid,i+1,j,1);
                    helper(grid,i-1,j,1);
                }
            }
        }
    }
    public void helper(int[][] grid, int i, int j,int count){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length|| grid[i][j] == -1||grid[i][j] == 0||grid[i][j] <= count){
            return;
        }
         grid[i][j] = count;
        
         helper(grid,i,j+1,count + 1);
         helper(grid,i,j-1,count + 1);
         helper(grid,i+1,j,count + 1);
         helper(grid,i-1,j,count + 1);
    }
}
