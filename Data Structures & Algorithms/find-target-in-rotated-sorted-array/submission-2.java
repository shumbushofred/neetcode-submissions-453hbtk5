class Solution {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length -1;
        int mid =0;
        while(left < right){
            mid  = left + (right -left)/2;
            // System.out.println(nums[mid] +"  " + nums[right]);
            if (nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        // return left;
         System.out.println(left);
        if(nums[left] <= target && nums[nums.length -1] >= target){
            right = nums.length -1;
        }else{
            right = left;
            left = 0;
            
        }
       System.out.println(left +"  " + right);
         while(left <= right){
            mid  = left + (right -left)/2;
            // System.out.println(nums[mid] +"  " + nums[right]);
            if(nums[mid] == target){
                return mid;
            }
            else if (nums[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
