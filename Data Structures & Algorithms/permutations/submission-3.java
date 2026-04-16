class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        helper(nums,new ArrayList<>(),0);
        return ans;
    }
    public void helper(int[] nums, List<Integer> temp, int count){
        
        if(temp.size() == nums.length){
          ans.add(new ArrayList<>(temp));
        }
        if(temp.size() > nums.length){
            return;
        }
        for(int i =0;i < nums.length;i++){
            if(!temp.contains(nums[i])){
            temp.add(nums[i]);
            helper(nums, temp,i);
            temp.remove(temp.size()-1);
            }
        }
    }
}
