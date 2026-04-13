class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String,Integer> helper = new HashMap<>();
        int counter =0;
        for(int i =0; i < strs.length;i++){
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String dd = Arrays.toString(temp);
            if(!helper.containsKey(dd)){
                List<String> tt = new ArrayList<>();
                tt.add(strs[i]);
                answer.add(tt);
                helper.put(dd, counter);
                counter++;
            }else{
                answer.get(helper.get(dd)).add(strs[i]);
            }
        }
        return answer;
    }
}
