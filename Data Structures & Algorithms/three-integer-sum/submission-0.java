class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> thel = new ArrayList<>();
        HashSet<String> themap = new HashSet<>();
        for(int i = 0; i < nums.length;i++){
            for(int j = i + 1; j < nums.length;j++){
                for(int k =j + 1; k < nums.length;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        String hi = nums[i] + " " + nums[j] + " " + nums[k];
                        if(!themap.contains(hi)){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        thel.add(temp);
                        themap.add(hi);
                        }
                    }
                }
            }
        }
        return thel;
    }
}
