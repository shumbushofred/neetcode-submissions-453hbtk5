class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,Integer> themap = new HashMap<>();
        List<List<String>> answer = new ArrayList<>();
        int counter = 0;
        for(String i: strs){
            String temp =i;
            char[] arr = temp.toCharArray();
            Arrays.sort(arr);
            String helper = new String(arr);
            if(themap.containsKey(helper)){
                answer.get(themap.get(helper)).add(i);
            }else{
                themap.put(helper, counter);
                answer.add(new ArrayList<>(List.of(i)));
                counter++;
            }
        }
        
        return answer;
    }
}
