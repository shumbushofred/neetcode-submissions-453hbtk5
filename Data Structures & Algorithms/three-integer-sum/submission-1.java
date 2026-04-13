class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<String> themap = new HashSet<>();
        for(int i = 0;i < nums.length;i++){
            for(int j = i +1;j < nums.length;j++){
                for(int k = j +1;k < nums.length;k++){
                    if((nums[i] + nums[j] + nums[k]) == 0){
                    List<Integer> temp = new ArrayList<>();
                       temp.add(nums[i]);
                       temp.add(nums[j]);
                       temp.add(nums[k]);
                       Collections.sort(temp);
                       int l =0;
                       StringBuilder thes = new StringBuilder();
                       while(l < 3){
                        thes.append(temp.get(l));
                        thes.append(".");
                        l++;
                       }
                       String he = thes.toString();
                       if(!themap.contains(he)){
                        ans.add(new ArrayList<>(temp));
                        themap.add(he);
                       }

                    }
                }
            }
        }
        return ans;
    }
}
