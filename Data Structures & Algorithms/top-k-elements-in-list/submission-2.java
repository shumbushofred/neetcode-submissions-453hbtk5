class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> themap = new HashMap<>();
        List<Integer> thelist = new ArrayList<>();
        Arrays.sort(nums);
        int i =0;
        while(i < nums.length){
            int temp =nums[i];
            int count =0;
            while(i < nums.length && temp == nums[i]){
                count++;
                i++;
            }
            themap.put(temp,count);
        }
        System.out.println(themap);
       List<int[]> thearr = new ArrayList<>();
       for(Map.Entry<Integer, Integer> et: themap.entrySet()){
        thearr.add(new int[]{et.getKey(),et.getValue()});
       }
       thearr.sort((a,b)->b[1] - a[1]);
    //    System.out.println(thearr.get(0));
       int[] ans = new int[k];
       for(int j =0;j <k;j++){
        ans[j] = thearr.get(j)[0];
       }
       return ans;
    }
}
