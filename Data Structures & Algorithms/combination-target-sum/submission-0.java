class Solution {
     List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        ans = new ArrayList<>();
        helper(nums,target,0, new ArrayList<>(),0);
        return ans;
        
    }
    public void helper(int[] nums, int target, int i, List<Integer> temp, int sum){
        if(sum > target) return;
        if(sum == target){
            ans.add(new ArrayList<>(temp));
        }
        for(int j= i; j < nums.length; j++){
            sum = sum + nums[j];
            temp.add(nums[j]);
            helper(nums,target, j, temp, sum);
            sum = sum - nums[j];
            temp.remove(temp.size()-1);

        }
    }
}
