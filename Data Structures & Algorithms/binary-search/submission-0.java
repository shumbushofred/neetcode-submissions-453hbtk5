class Solution {
    public int search(int[] nums, int target) {
      int i =0;
      int j = nums.length-1;
      while(i <= j){
        int mid = i + ((j-i)/2);
        int themid = nums[mid];
        if(themid == target){
            return mid;
        }else if(themid > target){
            j= mid -1;
        }else{
            i = mid + 1;
        }
      }  
      return -1;
    }
}
