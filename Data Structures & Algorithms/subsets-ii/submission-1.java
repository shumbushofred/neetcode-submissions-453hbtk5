class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, new ArrayList<>(),0);
        return ans;
    }
    public void helper(int[] nums, List<Integer> temp, int count){
        Collections.sort(temp);
        if(!ans.contains(temp)){
            ans.add(new ArrayList<>(temp));
        }
        for(int i = count; i < nums.length;i++){
            temp.add(nums[i]);
            helper(nums, temp,i + 1);
            temp.remove(temp.size()-1);
        }
    }
}
