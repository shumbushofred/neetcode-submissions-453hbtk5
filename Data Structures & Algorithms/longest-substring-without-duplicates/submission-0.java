class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        int ans = 0;
       int i=0;
       int j=1;
       HashSet<Character> themap = new HashSet<>();
       themap.add(s.charAt(i));
        while(j < s.length()){
            if(themap.contains(s.charAt(j))){
                while(themap.contains(s.charAt(j))){
                    themap.remove(s.charAt(i));
                    i++;
                }
                themap.add(s.charAt(j));
                j++;
            }else{
                themap.add(s.charAt(j));
                j++;
            }
            int temp = j-i;
            if(temp > ans){
                ans = temp;
            }
        }
        return ans;
    }
}
