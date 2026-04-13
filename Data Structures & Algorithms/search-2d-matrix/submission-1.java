class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int first =0;
        int last = matrix.length -1;
        int mid =0;
        if(matrix[first][0] > target) return false;
        while(first <= last){
            mid = first + (last - first)/2;
            if(matrix[mid][0] == target){
                return true;
            }else if(matrix[mid][0] < target){
                first = mid +1;
            }else{
                last = mid -1;
            }
        }
        if(last == matrix.length -1){
            return helper(matrix,target,last);
        }
        return helper(matrix,target,last);
    }
    public boolean helper(int[][] matrix, int target, int i)
    {
        System.out.println(i);
        int first = 0;
        int last = matrix[i].length -1;
        while(first <= last){
            int mid = first +(last - first)/2;
            if(matrix[i][mid] == target){
                return true;
            }else if(matrix[i][mid] < target){
                first = mid +1;
            }else{
                last = mid-1;
            }
        }
        return false;
    }
}
