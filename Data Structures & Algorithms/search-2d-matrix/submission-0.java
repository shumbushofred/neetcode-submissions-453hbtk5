class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int row = findrow(matrix,target);
        if (row < 0) return false;
        // if(row >= matrix.length){
        //     row = row-1;
        // }
        System.out.println(row);
        if(matrix[row][0] == target) return true;
        int left =0;
        int right = matrix[0].length;
        while(left < right){
            int mid = left +((right -left)/2);
            if(matrix[row][mid] == target){
                return true;
            }else if(matrix[row][mid] > target){
                right = mid;
            }else{
                left = mid +1;
            }
        }
        if(left >= matrix[0].length){
            return false;
         }
            return matrix[row][left] == target;
    }
    public int findrow(int[][] matrix, int target){
        int left = 0;
        int right = matrix.length;
        while(left < right){
            int mid = left +((right -left)/2);
            if(matrix[mid][0] == target){
                return mid;
            }else if(matrix[mid][0] > target){
                right = mid;
            }else{
                left = mid +1;
            }
        }
        return left-1;
    }
}