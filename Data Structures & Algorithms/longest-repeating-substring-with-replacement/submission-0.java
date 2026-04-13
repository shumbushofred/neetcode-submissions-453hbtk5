class Solution {
    public int characterReplacement(String s, int k) {
       int[] le = new int[26];
       int i =0;
       le[s.charAt(i) - 'A']++;
       int mostletters = 1;
       int ans = mostletters;
       for(int j = 1;j < s.length();j++){
        le[s.charAt(j) - 'A']++;
        mostletters = Math.max(mostletters, le[s.charAt(j) - 'A']);
        int boxsize = (j-i)+1;
        if(boxsize - mostletters > k){
            le[s.charAt(i) - 'A']--;
            i++;
            
        }
        boxsize = (j-i)+1;
        if(boxsize > ans){
            ans = boxsize;
        }
       }
       return ans;
    }
}