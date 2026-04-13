class Solution {
    public int searchInsert(int[] nums, int target) {
        int first =0;
        int last = nums.length -1;
        int mid =0;
        if(nums[first] >= target) return 0;
        while(first <= last){
            mid = first + (last - first)/2;
            if(nums[mid] == target){
                //System.out.println("am here");
                return mid;
            }else if(nums[mid] < target){
                first = mid +1;
            }else{
                last = mid -1;
            }
        }
        return last +1;
    }
}