class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> themap = new HashSet<>();
        if(s.length() == 0) return 0;
        int ans =1;
        int i =0;
        themap.add(s.charAt(0));
        for(int j =1; j < s.length();j++){
            char temp = s.charAt(j);
         if(!themap.contains(temp)){
            if(j-i+1 > ans){
                ans = j-i+1;
            }
         }else{
            while(j > i && s.charAt(i) != temp){
                themap.remove(s.charAt(i));
                i++;
            }
            themap.remove(s.charAt(i));
            i++;
         }
         themap.add(temp);
        }
        return ans;
    }
}
