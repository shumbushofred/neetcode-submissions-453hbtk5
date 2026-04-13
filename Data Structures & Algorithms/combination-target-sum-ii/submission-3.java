class Solution {
    Set<List<Integer>> themap;
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        themap = new HashSet<>();    
        helper(candidates,target,new ArrayList<>(),0,0);
        ans = new ArrayList<>(themap);
        return ans;
    }
    public void helper(int[] candidates, int target, List<Integer> temp, int sum,int count){
        
       
        if(sum == target){
            // List<Integer> newtemp = new ArrayList<>(temp);
            // Collections.sort(newtemp);
            // System.out.println(temp);
            themap.add(new ArrayList<>(temp));
            return;
        }
        if(sum > target || count >= candidates.length){
            return;
        }
        temp.add(candidates[count]);
        helper(candidates,target,temp,sum + candidates[count],count + 1);
            
        temp.remove(temp.size()-1);
        while(count+1 < candidates.length && candidates[count] == candidates[count + 1]){
        count++;
        }
        helper(candidates,target,temp,sum,count + 1);
    }
}
