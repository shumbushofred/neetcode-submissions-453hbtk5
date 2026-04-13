class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> themap = new HashMap<>();
        for(String i: strs){
           
            char[] temp = i.toCharArray();
            Arrays.sort(temp);
            StringBuilder ii = new StringBuilder();
            for(char ik: temp){
                ii.append(ik);
            }
            String newtemp = ii.toString();
            if(themap.containsKey(newtemp)){
                themap.get(newtemp).add(i);
            }else{
                List<String> thett = new ArrayList<>();
                thett.add(i);
                themap.put(newtemp,thett);
            }
        }
        for(Map.Entry<String, List<String>> ent: themap.entrySet()){
            ans.add(ent.getValue());
        }
        return ans;
    }
}
