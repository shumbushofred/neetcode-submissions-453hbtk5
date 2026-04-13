class Solution {
     List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        helper(nums,new ArrayList<>(),new HashSet<>());
        return ans;
    }
    public void helper(int[] nums,List<Integer> thelist,HashSet<Integer> theset){
        if(thelist.size() == nums.length){
           ans.add(new ArrayList<>(thelist));
        }

        for(int i =0;i < nums.length;i++){
         if(thelist.size() < nums.length){
           if(!theset.contains(nums[i])){
            thelist.add(nums[i]);
            theset.add(nums[i]);
            helper(nums,thelist,theset);
            thelist.remove(thelist.size()-1);
            theset.remove(nums[i]);
         }
         }
        }
    }
}