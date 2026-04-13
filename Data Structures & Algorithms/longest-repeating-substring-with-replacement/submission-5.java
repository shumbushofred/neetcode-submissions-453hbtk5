class Solution {
    public int characterReplacement(String s, int k) {
        int ans =0;
        int[] hil = new int[26];
        int i =0;
        int j =0;
        int hig = 0;
        while(i <= j && j < s.length()){
            char temp = s.charAt(j);
         hil[temp - 'A']++;
         for(int z =0; z < hil.length;z++){
         if(hil[z] > hig){
            hig = hil[z];
         }
         }
         int len = (j-i) +1;
         int val = (len-hig) - k;
      
         if(val <=  0){
            if(len > ans){
                ans = len;
            }
            j++;
         }else{
            hil[s.charAt(i) - 'A']--;
            i++;
            j++;
         }
        }
        return ans;
    }
    
}
