class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> subsets(int[] nums) {
         ans = new ArrayList<>();
         List<Integer> temp = new ArrayList<>();
         helper(nums,temp, 0);
         return ans;
    }
    public void helper(int[] nums, List<Integer> temp, int i){
        //  if(i < nums.length){
        //     System.out.println(temp);
            ans.add(new ArrayList<>(temp));
    //   }
        for(int j = i; j < nums.length;j++){
            temp.add(nums[j]);
            helper(nums,temp,j + 1);
            temp.remove(temp.size()-1);
        }
    }
}
